package com.dio.santander.banklineapi.model;

public class AccountHolder {
	
	private Integer id;
	private String cpf; 
	private String name;
	private Account conta;
	
	//Conta do Cliente //
	
	public Account getConta() {
		return conta;
	}
	public void setConta(Account conta) {
		this.conta = conta;
	}
	
	//Conta do Cliente //
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	
}
