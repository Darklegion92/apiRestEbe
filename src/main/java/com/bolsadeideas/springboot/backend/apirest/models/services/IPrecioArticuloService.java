package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;

public interface IPrecioArticuloService {

	public List<PrecioArticulo> findAll();
	
	public PrecioArticulo findById(String id);
	
	public PrecioArticulo findByCod(String id);
}
