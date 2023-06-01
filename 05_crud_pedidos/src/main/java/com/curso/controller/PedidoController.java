package com.curso.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidoServiceImpl;

@RestController
public class PedidoController {


	@Autowired
	PedidoServiceImpl service;
	
	//https://localhost:7000/pedido
	@GetMapping(value="pedido", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> listaPedidos(){
		return service.listaPedidos();
	}
	
	//https://localhost:7000/pedido
	@PostMapping(value="pedido", produces=MediaType.APPLICATION_JSON_VALUE)
	public void crearPedido(@RequestBody Pedido pedido) {
		service.crearPedido(pedido);
	}
	
	//https://localhost:7000/pedido/1
	@GetMapping(value="pedido/{codigoproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public double obtenerPrecioProducto(@PathVariable("codigoproducto") int codigoProducto) {
		return service.obtenerPrecio(codigoProducto);
	}
	
	//https://localhost:7000/pedido/1/10
	@PutMapping(value="pedido/{codigoproducto}/{stock}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarStock(@PathVariable("codigoproducto") int codigoProducto, @PathVariable("stock") int stock) {
		service.actualizarStock(codigoProducto, stock);
	}
}
