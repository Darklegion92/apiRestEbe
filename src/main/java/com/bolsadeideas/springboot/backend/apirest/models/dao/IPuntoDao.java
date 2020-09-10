package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Punto;


public interface IPuntoDao extends CrudRepository<Punto, Long>{
	@Query(value = "select p.* from puntos_cliente p where p.ptcl_nit = ?1 order by p.ptcl_id DESC", nativeQuery = true)
	public Punto findByDoc(String doc);
	
}
