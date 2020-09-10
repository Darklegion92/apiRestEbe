package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "precios_articulo")
public class PrecioArticulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "lipr_cod")
	private Integer lipr_cod;

	@Column(name = "prar_fijo")
	private String precio;

	@Column(name = "prar_dto1")
	private String descuento;

	/*
	 * RELACIONES
	 */

	@ManyToOne
	@JoinColumn(name = "arti_cod", referencedColumnName = "arti_cod")
	private Articulo articulo;

	// ** metodo get and set //

	public Integer getLipr_cod() {
		return lipr_cod;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setLipr_cod(Integer lipr_cod) {
		this.lipr_cod = lipr_cod;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

}
