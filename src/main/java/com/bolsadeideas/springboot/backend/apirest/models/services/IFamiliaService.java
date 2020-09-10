package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Familia;

public interface IFamiliaService {

	public List<Familia> findAll();

}
