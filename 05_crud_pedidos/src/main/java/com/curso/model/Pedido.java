package com.curso.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {

	
	@Id
	@Column(name="idpedidos")
	private int idPedidos;
	@Column(name="codigoproducto")
	private int codigoProducto;
	@Column(name="unidades")
	private int unidades;
	@Column(name="total")
	private double total;
	@Column(name="fechapedido")
	private Date fechaPedido;
	
	public Pedido() {

	}
	
	public Pedido(int idPedidos, int codigoProducto, int unidades) {
		this.idPedidos = idPedidos;
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	


}
