package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IPrecioArticuloDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPrecioArticuloService;

@Service
public class PrecioArticuloServiceImpl implements IPrecioArticuloService {

	@Autowired
	private IPrecioArticuloDao precioArticuloDao;

	@Override
	@Transactional(readOnly = true)
	public List<PrecioArticulo> findAll() {
		return (List<PrecioArticulo>) precioArticuloDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public PrecioArticulo findById(String id) {
		return precioArticuloDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public PrecioArticulo findByCod(String id) {
		return precioArticuloDao.findByCod(id);
	}

}
