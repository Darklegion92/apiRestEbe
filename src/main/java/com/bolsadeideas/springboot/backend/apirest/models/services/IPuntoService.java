package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Punto;

public interface IPuntoService {

	public Punto findByDoc(String doc);
		
}
