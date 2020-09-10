package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IFamiliaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Familia;
import com.bolsadeideas.springboot.backend.apirest.models.services.IFamiliaService;


@Service
public class FamiliaServiceImpl implements IFamiliaService {

	@Autowired
	private IFamiliaDao familiaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Familia> findAll() {
		return (List<Familia>) familiaDao.findAll();
	}
}
