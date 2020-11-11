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
import com.bolsadeideas.springboot.backend.apirest.models.services.IPerecederosService;
import com.bolsadeideas.springboot.backend.apirest.models.services.IPrecioArticuloService;
import com.bolsadeideas.springboot.backend.apirest.models.vo.ArticuloVo;
import com.bolsadeideas.springboot.backend.apirest.models.vo.PerecederosVo;

@Service
public class PerecederosServiceImpl implements IPerecederosService{

	@Autowired
	private IArticuloDao articuloDao;

	@Autowired
	private IPrecioArticuloService metodoService;

	@Override
	@Transactional(readOnly = true)
	public List<PerecederosVo> find() {

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

		return null;
	}
}
