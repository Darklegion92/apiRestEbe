package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "puntos_cliente")
public class Punto implements Serializable {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
	 */

	@Id
	@Column(name = "ptcl_nit")
	private String documento;

	@Column(name = "ptcl_saldo")
	private String puntos;
	
	 /** metodo get and set*/

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	private static final long serialVersionUID = 1L;
}
