package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPerecederosService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.PerecederosVo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/informes")
public class PerecederosRestController {

	@Autowired
	private IPerecederosService metodoService;

	@GetMapping("/perecederos")
	public List<Ajuste> index() {
		return metodoService.find();
	}
}
