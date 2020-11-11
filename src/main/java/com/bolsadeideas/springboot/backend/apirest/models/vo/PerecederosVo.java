package com.bolsadeideas.springboot.backend.apirest.models.vo;

public class PerecederosVo {

	private String codigo;
	private String descripcion;
	private Double invinicial;
	private Double invinicialval;
	private Double compras;
	private Double comprasval;
	private Double ventas;
	private Double ventasval;
	private Double merma;
	private Double mermaval;
	private Double invfinal;
	private Double invfinalval;
	private Double diferencia;
	private Double diferenciaval;
	private Double costo;

	public PerecederosVo(String codigo, String descripcion, Double invinicial, Double invinicialval, Double compras,
			Double comprasval, Double ventas, Double ventasval, Double merma, Double mermaval, Double invfinal,
			Double invfinalval, Double diferencia, Double diferenciaval, Double costo) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.invinicial = invinicial;
		this.invinicialval = invinicialval;
		this.compras = compras;
		this.comprasval = comprasval;
		this.ventas = ventas;
		this.ventasval = ventasval;
		this.merma = merma;
		this.mermaval = mermaval;
		this.invfinal = invfinal;
		this.invfinalval = invfinalval;
		this.diferencia = diferencia;
		this.diferenciaval = diferenciaval;
		this.costo = costo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getInvinicial() {
		return invinicial;
	}

	public void setInvinicial(Double invinicial) {
		this.invinicial = invinicial;
	}

	public Double getInvinicialval() {
		return invinicialval;
	}

	public void setInvinicialval(Double invinicialval) {
		this.invinicialval = invinicialval;
	}

	public Double getCompras() {
		return compras;
	}

	public void setCompras(Double compras) {
		this.compras = compras;
	}

	public Double getComprasval() {
		return comprasval;
	}

	public void setComprasval(Double comprasval) {
		this.comprasval = comprasval;
	}

	public Double getVentas() {
		return ventas;
	}

	public void setVentas(Double ventas) {
		this.ventas = ventas;
	}

	public Double getVentasval() {
		return ventasval;
	}

	public void setVentasval(Double ventasval) {
		this.ventasval = ventasval;
	}

	public Double getMerma() {
		return merma;
	}

	public void setMerma(Double merma) {
		this.merma = merma;
	}

	public Double getMermaval() {
		return mermaval;
	}

	public void setMermaval(Double mermaval) {
		this.mermaval = mermaval;
	}

	public Double getInvfinal() {
		return invfinal;
	}

	public void setInvfinal(Double invfinal) {
		this.invfinal = invfinal;
	}

	public Double getInvfinalval() {
		return invfinalval;
	}

	public void setInvfinalval(Double invfinalval) {
		this.invfinalval = invfinalval;
	}

	public Double getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(Double diferencia) {
		this.diferencia = diferencia;
	}

	public Double getDiferenciaval() {
		return diferenciaval;
	}

	public void setDiferenciaval(Double diferenciaval) {
		this.diferenciaval = diferenciaval;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

}
