package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductoService {
	List<Producto> listaProductos();
	Producto buscarProducto(int codigoProducto);
	void eliminarProducto(int codigoProducto);
	void crearProducto(Producto producto);
	void actualizarProducto(Producto producto);
	void actualizarStock(int codigoPorducto, int  stock);
	double obtenerPrecio(int codigoPorducto);

}

