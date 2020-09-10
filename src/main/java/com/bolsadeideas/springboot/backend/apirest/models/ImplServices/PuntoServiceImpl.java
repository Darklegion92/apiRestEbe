package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IPuntoDao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Punto;

import com.bolsadeideas.springboot.backend.apirest.models.services.IPuntoService;

@Service
public class PuntoServiceImpl implements IPuntoService {

	@Autowired
	private IPuntoDao puntoDao;

	@Override
	@Transactional(readOnly = true)
	public Punto findByDoc(String doc) {
		return puntoDao.findByDoc(doc);
	}
}
