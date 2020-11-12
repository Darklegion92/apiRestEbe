package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Articulo;

public interface IPerecederosDao extends CrudRepository<Ajuste, Long> {
	@Query(value = "select a.* from articulo a where a.arti_des like %?1% and a.esar_cod='A'", nativeQuery = true)
	public List<Articulo> findByNombre(String term);

	@Query(value = "select a.arti_cod as codigo ,ajd.ajus_exnue as inventario "
			+ "from ajustes_detalle ajd, articulo a, ajustes aj "
			+ "where ajd.ajus_id = aj.ajus_id and a.arti_cod = ajd.arti_cod and "
			+ "a.fain_cod = 15 and a.esar_cod='A' and aj.ajus_anulado='N' and aj.ajus_fecha='02.11.2020' and aj.bode_cod=1;", nativeQuery = true)
	public List<Ajuste> find();

	@Query(value = "select a.* from articulo a where a.arti_cod = ?1 and a.esar_cod='A'", nativeQuery = true)
	public Articulo findById(String term);
}