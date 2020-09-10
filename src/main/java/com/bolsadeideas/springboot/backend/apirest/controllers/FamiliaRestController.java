package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Familia;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Grupo;
import com.bolsadeideas.springboot.backend.apirest.models.services.IFamiliaService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.AgrupacionesVo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/")
public class FamiliaRestController {

	@Autowired
	private IFamiliaService metodoService;

	@GetMapping("/agrupaciones")
	public List<AgrupacionesVo> index() {

		List<AgrupacionesVo> agrupaciones = new ArrayList<AgrupacionesVo>();
		List<Familia> familias = metodoService.findAll();
		for (Familia familia : familias) {
			List<Grupo> grupos = familia.getGrupos();
			ArrayList<String> agrupacionGrupos = new ArrayList<String>();

			for (Grupo grupo : grupos) {
				agrupacionGrupos.add(grupo.getNombre());
			}

			AgrupacionesVo agrupacion = new AgrupacionesVo(familia.getNombre(), agrupacionGrupos);
			agrupaciones.add(agrupacion);
		}
		return agrupaciones;
	}
}
