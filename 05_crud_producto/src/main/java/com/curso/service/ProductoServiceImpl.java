package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductoDao;
import com.curso.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoDao dao;
	
	@Override
	public List<Producto> listaProductos() {
		return dao.findAll();
	}

	@Override
	public Producto buscarProducto(int codigoProducto) {
		return dao.findById(codigoProducto).orElse(null);
	}

	@Override
	public void eliminarProducto(int codigoProducto) {
		dao.deleteById(codigoProducto);

	}

	@Override
	public void crearProducto(Producto producto) {
		dao.save(producto);

	}

	@Override
	public void actualizarProducto(Producto producto) {
		dao.save(producto);

	}

	@Override
	public void actualizarStock(int codigoProducto, int stock) {
		Producto producto=dao.findById(codigoProducto).orElse(null);
		if(producto!=null) {
			producto.setStock(stock);
			dao.save(producto);
		}
	}

	@Override
	public double obtenerPrecio(int codigoProducto) {
		Producto producto=dao.findById(codigoProducto).orElse(null);
		if(producto!=null) {
			return producto.getPrecioUnitario();
		}else {
			return 0.0;
		}
		
	}
}
