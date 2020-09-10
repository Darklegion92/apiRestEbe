package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Punto;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPuntoService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/")
public class PuntoRestController {

	@Autowired
	private IPuntoService metodoService;
	
	@GetMapping("/puntos/{doc}")
	public ResponseEntity<?> show(@PathVariable String doc) {
		
		Punto punto = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			punto = metodoService.findByDoc(doc);
		} catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			response.put("dato", (e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(punto == null) {
			response.put("mensaje", "El Documento ID: ".concat(doc.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Punto>(punto, HttpStatus.OK);
	}
	
	
}
