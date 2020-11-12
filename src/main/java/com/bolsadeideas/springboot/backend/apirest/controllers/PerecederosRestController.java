package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPerecederosService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/informes")
public class PerecederosRestController {

	@Autowired
	private IPerecederosService metodoService;

	@GetMapping("/perecederos")
	public List<Ajuste> index(@RequestParam("idfamilia") Integer idfamilia,
			@RequestParam("fechainicial") String fechaInical, @RequestParam("fechafinal") String fechaFinal,
			@RequestParam("idsucursal") Integer idsucursal) {
		
		@SuppressWarnings("deprecation")
		Date dateInicial = new Date(fechaInical);
		@SuppressWarnings("deprecation")
		Date dateFinal = new Date(fechaFinal);
		try {
			dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInical);
			dateFinal = new SimpleDateFormat("dd/MM/yyyy").parse(fechaFinal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Ajuste> invInicial = metodoService.find(idfamilia, dateInicial, idsucursal);
		List<Ajuste> invFinal = metodoService.find(idfamilia, dateFinal, idsucursal);

		return invInicial;
	}
}
