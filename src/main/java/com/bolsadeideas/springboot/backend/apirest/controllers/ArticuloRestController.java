package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.services.IArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/")
public class ArticuloRestController {

	@Autowired
	private IArticuloService metodoService;

	@GetMapping("/articulos")
	public List<ArticuloVo> index() {
		return metodoService.findAll();
	}

	@GetMapping("/articulos/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<ArticuloVo> findByNombre(@PathVariable String term) {
		return metodoService.findByNombre(term.toUpperCase());
	}
	
	@GetMapping("/agrupaciones/{fami}/{grup}")
	@ResponseStatus(HttpStatus.OK)
	public List<ArticuloVo> findByAgrupacion(@PathVariable String fami,@PathVariable String grup) {
		return metodoService.findByAgrupacion(fami.toUpperCase(),grup.toUpperCase());
	}
}
