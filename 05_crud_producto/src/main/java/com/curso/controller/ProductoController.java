package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductoServiceImpl;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl service;

	//http://localhost:8000/producto
	@GetMapping(value="producto", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listaProducto() {
		return service.listaProductos();
	}
	
	//http://localhost:8000/producto/1
	@GetMapping(value="producto/{idproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Producto unProducto(@PathVariable("idproducto")int idProducto) {
		return service.buscarProducto(idProducto);
	}

	//http://localhost:8000/producto
	@PostMapping(value="producto", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregarProducto(@RequestBody Producto producto) {
		service.crearProducto(producto);
	}
	
	//http://localhost:8000/producto
	@PutMapping(value="producto", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPorducto(@RequestBody Producto producto) {
		service.actualizarProducto(producto);
	}
	
	//http://localhost:8000/producto/1
	@DeleteMapping(value="producto/{idproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void  eliminarProducto(@PathVariable("idproducto")int idProducto) {
		service.eliminarProducto(idProducto);
	}	
	
	//http://localhost:8000/producto/1/12
	@PutMapping(value="producto/{codigoproducto}/{stock}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void  actualizarStock(@PathVariable("codigoproducto") int codigoProducto, @PathVariable("stock") int stock) {
		service.actualizarStock(codigoProducto, stock);
	}
	
	//http://localhost:8000/producto/precio/1
	@GetMapping(value="producto/precio/{codigoproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double obtenerPrecio(@PathVariable("codigoproducto") int codigoProducto) {
		return service.obtenerPrecio(codigoProducto);
	}
}
