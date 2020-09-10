package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Grupo;

public interface IGrupoDao extends CrudRepository<Grupo, Long> {
	@Query(value = "select g.grin_nom,g.grin_cod,fain_cod from grupo_inventario g where g.grin_nom='ARROZ' AND g.fain_cod='1'", nativeQuery = true)
	public Grupo findAticulos(String fami, String grup);

}
