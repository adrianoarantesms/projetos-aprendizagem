package com.aprendizagem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_pedido", nullable=false)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_cardapio_item", nullable=false)
	private CardapioItem item;
	
	@Column(name="cd_mesa", nullable=false)
	private Integer codigoMesa;
	
	@Column(name="dt_pedido", nullable=false)
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CardapioItem getItem() {
		return item;
	}

	public void setItem(CardapioItem item) {
		this.item = item;
	}

	public Integer getCodigoMesa() {
		return codigoMesa;
	}

	public void setCodigoMesa(Integer codigoMesa) {
		this.codigoMesa = codigoMesa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
    public Pedido() {
    	this.data = new Date();
    }

}
