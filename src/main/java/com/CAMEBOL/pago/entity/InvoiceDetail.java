package com.CAMEBOL.pago.entity;

public class InvoiceDetail {
	 private int id_concepto;//Identificador del concepto.
	 private String descripcion;//Descripción del ítem.
	 private int cantidad;//Cantidad de unidades del ítem. Se toma en cuenta los dos últimos como decimales. (1,50 se representa con 150)
	 private double precio_unitario;//Precio por unidad de medida del ítem. Se toma en cuenta los dos últimos como decimales. (35,50 se representa con 3550)
	 private String aplica_descuento;//Valor que define si el ítem cuenta con descuento. (Valores aceptados: N – S)
	 private double porcentaje_descuento; //Valor que define el porcentaje de descuento a aplicar en el ítem. Se toma en cuenta los dos últimos como decimales.
	 private String importe_descuento;//Valor que define el monto de descuento a aplicar en el ítem. Se toma en cuenta los dos últimos como decimales.
	public InvoiceDetail() {
		super();
	}
	public int getId_concepto() {
		return id_concepto;
	}
	public void setId_concepto(int id_concepto) {
		this.id_concepto = id_concepto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public String getAplica_descuento() {
		return aplica_descuento;
	}
	public void setAplica_descuento(String aplica_descuento) {
		this.aplica_descuento = aplica_descuento;
	}
	public double getPorcentaje_descuento() {
		return porcentaje_descuento;
	}
	public void setPorcentaje_descuento(double porcentaje_descuento) {
		this.porcentaje_descuento = porcentaje_descuento;
	}
	public String getImporte_descuento() {
		return importe_descuento;
	}
	public void setImporte_descuento(String importe_descuento) {
		this.importe_descuento = importe_descuento;
	}

}
