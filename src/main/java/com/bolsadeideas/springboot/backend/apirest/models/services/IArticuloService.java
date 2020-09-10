package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;

public interface IArticuloService {

	public List<ArticuloVo> findAll();
	
	public List<ArticuloVo> findByNombre(String term);

	public List<ArticuloVo> findByAgrupacion(String fami, String grup);

}
