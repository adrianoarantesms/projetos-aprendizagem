package com.spring.model;

public enum MarcaVeiculo {

	HONDA("Honda"),
	YAMAHA("Yamaha"),
	SUZUKI("Suzuki");
	
	private String descricao;
	
	MarcaVeiculo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
