package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "arti_cod")
	private String codigo;

	@Column(name = "arti_des")
	private String nombre;

	@Column(name = "esar_cod")
	private String estado;

	/* RELACIONES */
	@ManyToOne
	@JoinColumn(name = "fain_cod", referencedColumnName = "fain_cod")
	private Familia familia;

	@ManyToOne
	@JoinColumn(name = "grin_cod", referencedColumnName = "grin_cod")
	private Grupo grupo;

	@ManyToOne
	@JoinColumn(name = "marc_cod", referencedColumnName = "marc_cod")
	private Marca marca;

	/* Getter and setter */

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

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
