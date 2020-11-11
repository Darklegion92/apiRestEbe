package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ajustes")
public class Ajuste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "arti_cod")
	private String codigo;

	@Column(name = "inventario")
	private Double inventario;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getInventario() {
		return inventario;
	}

	public void setInventario(Double inventario) {
		this.inventario = inventario;
	}

}
