package com.curso.tienda.model;

public class DetalleOrden {
	private Integer Id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}

	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		Id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [Id=" + Id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	

}
