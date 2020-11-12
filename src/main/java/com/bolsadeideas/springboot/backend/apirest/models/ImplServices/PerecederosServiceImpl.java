package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IPerecederosDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPerecederosService;

@Service
public class PerecederosServiceImpl implements IPerecederosService {

	@Autowired
	private IPerecederosDao perecederosDao;

	@Override
	@Transactional(readOnly = true)
	public List<Ajuste> find(Integer idfamilia, Date fecha, Integer idsucursal) {
		List<Ajuste> inventarioInicial = (List<Ajuste>) perecederosDao.findAjuste(idfamilia,  idsucursal,fecha);
		return inventarioInicial;
	}
}
