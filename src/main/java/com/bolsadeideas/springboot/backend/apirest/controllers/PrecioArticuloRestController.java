package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPrecioArticuloService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/")
public class PrecioArticuloRestController {

	@Autowired
	private IPrecioArticuloService metodoService;

	@GetMapping("/precioarticulo")
	public List<PrecioArticulo> index() {
		return metodoService.findAll();
	}

}
