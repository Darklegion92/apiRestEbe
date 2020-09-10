package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Marca;

public interface IMarcaService {

	public List<Marca> findAll();
	
	public Marca findById(Long id);
	
	public Marca save(Marca grupo);
	
	public void delete(Long id);

}
