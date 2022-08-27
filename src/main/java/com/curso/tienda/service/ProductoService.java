package com.curso.tienda.service;

import java.util.List;
import java.util.Optional;

import com.curso.tienda.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer Id);
	public void update(Producto producto);
	public void delete(Integer Id);
	public List<Producto> findAll();
	

}
