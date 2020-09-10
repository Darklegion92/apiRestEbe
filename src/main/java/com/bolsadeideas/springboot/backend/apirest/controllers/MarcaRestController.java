package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Marca;
import com.bolsadeideas.springboot.backend.apirest.models.services.IMarcaService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class MarcaRestController {

	@Autowired
	private IMarcaService metodoService;

	@GetMapping("/marcas")
	public List<Marca> index() {
		return metodoService.findAll();
	}
		
}
