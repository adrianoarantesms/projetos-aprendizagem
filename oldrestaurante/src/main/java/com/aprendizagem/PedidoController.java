package com.aprendizagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PedidoController {
	@Autowired
	private RestauranteRepository repository;
	
	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	@ResponseBody
	
	public void fazerPedido(@RequestBody Pedido pedido) {
		repository.salvarPedido(pedido);
	}
}
