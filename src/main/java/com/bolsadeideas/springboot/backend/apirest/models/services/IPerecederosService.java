package com.bolsadeideas.springboot.backend.apirest.models.services;


import java.util.Date;
import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Ajuste;

public interface IPerecederosService {

	public List<Ajuste> find(Integer idfamilia, Date fecha, Integer idsucursal);

}
