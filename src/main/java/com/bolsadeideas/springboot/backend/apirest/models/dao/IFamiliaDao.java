package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Familia;

public interface IFamiliaDao extends CrudRepository<Familia, Long> {
	
}
