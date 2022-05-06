package com.dio.santander.banklineapi.dto;

public class NewAccountHolder {
	private String nome;
	private String cpf;
	private Integer especialidade_id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getEspecialidade_id() {
		return especialidade_id;
	}
	public void setEspecialidade_id(Integer especialidade_id) {
		this.especialidade_id = especialidade_id;
	}

}
