package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;


public interface IPrecioArticuloDao extends CrudRepository<PrecioArticulo, String>{

}
