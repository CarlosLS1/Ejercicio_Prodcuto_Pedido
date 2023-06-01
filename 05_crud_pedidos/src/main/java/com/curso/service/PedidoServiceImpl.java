package com.curso.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;
import com.curso.model.ProductoAux;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	RestTemplate template;
	@Autowired
	PedidoDao dao;
	
	private String url="http://localhost:8000/";
	
	@Override
	public List<Pedido> listaPedidos() {
		return dao.findAll();
	}


	@Override
	public void actualizarStock(int codigoPorducto, int stock) {
		List<ProductoAux> productoAux = Arrays.asList(template.getForObject(url + "producto", ProductoAux[].class));
		for (ProductoAux producto : productoAux) {
			if(producto.getCodigoProducto()== codigoPorducto) {
				producto.setStock(stock);
				template.postForLocation(url+"producto", producto);
				break;
			}
		}
	}


	@Override
	public double obtenerPrecio(int codigoPorducto) {
		List<ProductoAux> productos = Arrays.asList(template.getForObject(url + "producto", ProductoAux[].class));
		double result=0.0;
		for (ProductoAux productoAux : productos) {
			if(productoAux.getCodigoProducto() == codigoPorducto) {
				result = productoAux.getPrecioUnitario();
			}
	}
		return result;
}


	@Override
	public void crearPedido(Pedido pedido) {
		List<ProductoAux> productos = Arrays.asList(template.getForObject(url + "producto", ProductoAux[].class));

		for (ProductoAux productoId : productos) {
			if(productoId.getCodigoProducto()==pedido.getCodigoProducto()) {
				Date date = Date.from(Instant.now());
				pedido.setTotal(pedido.getUnidades()*productoId.getPrecioUnitario());
				pedido.setFechaPedido(date);
				dao.save(pedido);
			}
		}
		
	}
	
	


}
