package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Articulo;

public interface IArticuloDao extends CrudRepository<Articulo, Long> {
	@Query(value = "select a.* from articulo a where a.arti_des like %?1%", nativeQuery = true)
	public List<Articulo> findByNombre(String term);

	@Query(value = "select a.* from articulo a where a.fain_cod=(select fain_cod from familia_inventario where fain_nom = ?1) and a.grin_cod=(select grin_cod from grupo_inventario where grin_nom = ?2)", nativeQuery = true)
	public List<Articulo> findByAgrupacion(String fami, String grup);
}