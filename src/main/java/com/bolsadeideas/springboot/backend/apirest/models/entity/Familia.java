package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("unused")
@Entity
@Table(name = "familia_inventario")
public class Familia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fain_cod")
	private String codigo;

	@Column(name = "fain_nom")
	private String nombre;

	@OneToMany(mappedBy = "familia")
	private List<Grupo> grupos;

	@OneToMany(mappedBy = "familia")
	private List<Articulo> articulos;

	/***** metodo gets and sets ***/

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}
