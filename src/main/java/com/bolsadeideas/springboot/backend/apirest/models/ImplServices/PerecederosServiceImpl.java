package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IPerecederosDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPerecederosService;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPrecioArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.PerecederosVo;

@Service
public class PerecederosServiceImpl implements IPerecederosService{

	@Autowired
	private IPerecederosDao perecederosDao;

	@Autowired
	private IPrecioArticuloService metodoService;

	@Override
	@Transactional(readOnly = true)
	public List<Ajuste> find() {

		List<Ajuste> inventarioInicial = (List<Ajuste>) perecederosDao.find();
	
		System.err.println("Articulos---");
		
	

		return inventarioInicial;
	}
}
