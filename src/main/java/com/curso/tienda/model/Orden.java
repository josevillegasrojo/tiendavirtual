package com.curso.tienda.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;

	@ManyToOne
	public Usuario usuario;
	
	@OneToOne(mappedBy="orden")
	private DetalleOrden detalle;
	
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

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public DetalleOrden getDetalle() {
	return detalle;
}

public void setDetalle(DetalleOrden detalle) {
	this.detalle = detalle;
}


}
