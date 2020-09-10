package com.bolsadeideas.springboot.backend.apirest.models.vo;

public class ArticuloVo {

	private String nombre;
	private String codigo;
	private String precio;
	private String descuento;
	private String nombremarca;
	private String nombrefamilia;
	private String nombregrupo;

	public ArticuloVo(String nombre, String codigo, String precio, String descuento, String nombremarca,
			String nombrefamilia, String nombregrupo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
		this.nombremarca = nombremarca;
		this.nombrefamilia = nombrefamilia;
		this.nombregrupo = nombregrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getNombremarca() {
		return nombremarca;
	}

	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}

	public String getNombrefamilia() {
		return nombrefamilia;
	}

	public void setNombrefamilia(String nombrefamilia) {
		this.nombrefamilia = nombrefamilia;
	}

	public String getNombregrupo() {
		return nombregrupo;
	}

	public void setNombregrupo(String nombregrupo) {
		this.nombregrupo = nombregrupo;
	}

}
