package com.bolsadeideas.springboot.backend.apirest.models.ImplServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IArticuloDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Articulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.PrecioArticulo;
import com.bolsadeideas.springboot.backend.apirest.models.services.IArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPrecioArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	private IArticuloDao articuloDao;

	@Autowired
	private IPrecioArticuloService metodoService;

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findAll() {

		List<Articulo> articulos = (List<Articulo>) articuloDao.findAll();
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {

				if (articulo.getEstado().equals("A")) {
					PrecioArticulo precio = metodoService.findByCod(articulo.getCodigo());
					ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(),
							precio.getPrecio(), precio.getDescuento(), articulo.getMarca().getNombre(),
							articulo.getFamilia().getNombre(), articulo.getGrupo().getNombre());
					articulosVo.add(articuloVo);
				}
			} catch (Exception e) {

			}
		}

		return articulosVo;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findByNombre(String term) {
		List<Articulo> articulos = (List<Articulo>) articuloDao.findByNombre(term.toUpperCase());
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {
				PrecioArticulo precio = metodoService.findByCod(articulo.getCodigo());
				ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(), precio.getPrecio(),
						precio.getDescuento(), articulo.getMarca().getNombre(), articulo.getFamilia().getNombre(),
						articulo.getGrupo().getNombre());
				articulosVo.add(articuloVo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return articulosVo;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ArticuloVo> findByAgrupacion(String fami, String grup) {
		List<Articulo> articulos = (List<Articulo>) articuloDao.findByAgrupacion(fami, grup);
		List<ArticuloVo> articulosVo = new ArrayList<ArticuloVo>();
		for (Articulo articulo : articulos) {
			try {
				PrecioArticulo precio = metodoService.findByCod(articulo.getCodigo());
				ArticuloVo articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(), precio.getPrecio(),
						precio.getDescuento(), articulo.getMarca().getNombre(), articulo.getFamilia().getNombre(),
						articulo.getGrupo().getNombre());
				articulosVo.add(articuloVo);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return articulosVo;
	}

	@Override
	@Transactional(readOnly = true)
	public ArticuloVo findById(String term) {
		Articulo articulo = (Articulo) articuloDao.findById(term);
		ArticuloVo articuloVo = new ArticuloVo(null, null, null, null, null, null, null);
		System.err.println(term);
		try {
			if (articulo.getEstado().equals("A")) {
				PrecioArticulo precio = metodoService.findByCod(articulo.getCodigo());
				articuloVo = new ArticuloVo(articulo.getNombre(), articulo.getCodigo(), precio.getPrecio(),
						precio.getDescuento(), articulo.getMarca().getNombre(), articulo.getFamilia().getNombre(),
						articulo.getGrupo().getNombre());

			}
		} catch (Exception e) {

		}
		return articuloVo;
	}
}
