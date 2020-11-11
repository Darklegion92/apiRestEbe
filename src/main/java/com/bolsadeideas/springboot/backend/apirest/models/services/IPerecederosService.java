package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;
import com.bolsadeideas.springboot.backend.apirest.models.vo.PerecederosVo;

public interface IPerecederosService {

	public List<PerecederosVo> find();

}
