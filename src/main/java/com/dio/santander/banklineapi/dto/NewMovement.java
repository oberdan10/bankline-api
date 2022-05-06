package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovementType;

public class NewMovement {
	private String descricao;
	private Double valor;
	private Integer idConta;
	private MovementType tipo;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public MovementType getTipo() {
		return tipo;
	}
	public void setTipo(MovementType tipo) {
		this.tipo = tipo;
	}
	
}