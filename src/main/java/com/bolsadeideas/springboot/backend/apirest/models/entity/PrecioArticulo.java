package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "precios_articulo")
public class PrecioArticulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "arti_cod")
	private String arti_cod;

	@Column(name = "lipr_cod")
	private Integer lipr_cod;

	@Column(name = "prar_fijo")
	private Double precio;

	@Column(name = "prar_dto1")
	private Double descuento;

	/*
	 * RELACIONES
	 */

	// ** metodo get and set //

	public Integer getLipr_cod() {
		return lipr_cod;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setLipr_cod(Integer lipr_cod) {
		this.lipr_cod = lipr_cod;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public String getArti_cod() {
		return arti_cod;
	}

	public void setArti_cod(String arti_cod) {
		this.arti_cod = arti_cod;
	}

}
