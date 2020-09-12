package com.bolsadeideas.springboot.backend.apirest.models.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;


public interface IPrecioArticuloDao extends CrudRepository<PrecioArticulo, String>{
	
	@Query(value = "select p.* from precios_articulo p where p.arti_cod = ?1 and lipr_cod=1;", nativeQuery = true)
	public PrecioArticulo findByCod(String term);
}
