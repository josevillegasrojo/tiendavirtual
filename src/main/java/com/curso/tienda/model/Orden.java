package com.curso.tienda.model;

import java.util.Date;

public class Orden {
	private Integer Id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		Id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}
	
public Orden() {
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Date getFechaRecibida() {
	return fechaRecibida;
}

public void setFechaRecibida(Date fechaRecibida) {
	this.fechaRecibida = fechaRecibida;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

@Override
public String toString() {
	return "Orden [Id=" + Id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
			+ fechaRecibida + ", total=" + total + "]";
}


}
