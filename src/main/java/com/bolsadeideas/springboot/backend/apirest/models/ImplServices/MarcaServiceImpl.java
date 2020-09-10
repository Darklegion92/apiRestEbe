package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IMarcaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Marca;
import com.bolsadeideas.springboot.backend.apirest.models.services.IMarcaService;

@Service
public class MarcaServiceImpl implements IMarcaService {

	@Autowired
	private IMarcaDao marcaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAll() {
		return (List<Marca>) marcaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Marca findById(Long id) {
		return marcaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Marca save(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		marcaDao.deleteById(id);
	}

}
