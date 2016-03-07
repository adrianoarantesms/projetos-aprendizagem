package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Veiculo;
import com.spring.repository.Veiculos;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {
	
	@Autowired
	private Veiculos veiculos;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroVeiculo";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Veiculo veiculo) {
		
		veiculos.save(veiculo);
		return "CadastroVeiculo";
	}
	
}
