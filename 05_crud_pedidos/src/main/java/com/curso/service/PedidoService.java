package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;



public interface PedidoService {
	List<Pedido> listaPedidos();
	void crearPedido(Pedido pedido);
	void actualizarStock(int codigoPorducto, int  stock);
	double obtenerPrecio(int codigoPorducto);
}
