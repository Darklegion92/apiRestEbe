package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IGrupoDao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Grupo;

import com.bolsadeideas.springboot.backend.apirest.models.services.IGrupoService;

@Service
public class GrupoServiceImpl implements IGrupoService {

	@Autowired
	private IGrupoDao grupoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Grupo> findAll() {
		return (List<Grupo>) grupoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Grupo findArticulos(String fami, String grup) {
		return grupoDao.findAticulos(fami,grup);
	}

}
