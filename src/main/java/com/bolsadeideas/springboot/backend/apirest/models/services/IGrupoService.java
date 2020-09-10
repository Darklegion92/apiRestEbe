package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Grupo;

public interface IGrupoService {

	public List<Grupo> findAll();

	public Grupo findArticulos(String fami, String grup);
}
