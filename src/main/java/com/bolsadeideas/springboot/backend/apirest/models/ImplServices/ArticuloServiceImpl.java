package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IArticuloDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Articulo;
import com.bolsadeideas.springboot.backend.apirest.models.services.IArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	private IArticuloDao articuloDao;

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findAll() {

		List<Articulo> articulos = (List<Articulo>) articuloDao.findAll();
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {
				ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(),
						articulo.getPreciosArticulo().get(0).getPrecio(),
						articulo.getPreciosArticulo().get(0).getDescuento(), articulo.getMarca().getNombre(),
						articulo.getFamilia().getNombre(), articulo.getGrupo().getNombre());
				articulosVo.add(articuloVo);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return articulosVo;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findByNombre(String term) {
		List<Articulo> articulos = (List<Articulo>) articuloDao.findByNombre(term);
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {
				ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(),
						articulo.getPreciosArticulo().get(0).getPrecio(),
						articulo.getPreciosArticulo().get(0).getDescuento(), articulo.getMarca().getNombre(),
						articulo.getFamilia().getNombre(), articulo.getGrupo().getNombre());
				articulosVo.add(articuloVo);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return articulosVo;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findByAgrupacion(String fami, String grup) {
		List<Articulo> articulos = (List<Articulo>) articuloDao.findByAgrupacion(fami,grup);
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {
				ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(),
						articulo.getPreciosArticulo().get(0).getPrecio(),
						articulo.getPreciosArticulo().get(0).getDescuento(), articulo.getMarca().getNombre(),
						articulo.getFamilia().getNombre(), articulo.getGrupo().getNombre());
				articulosVo.add(articuloVo);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return articulosVo;
	}
}
