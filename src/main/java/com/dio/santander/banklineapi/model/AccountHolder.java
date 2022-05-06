package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tab_correntista")
public class AccountHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 20)
	private String cpf; 
	
	@Column(length = 60)
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "especialidade_id")
	private Specialty especialidade;
	
	@Embedded
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Specialty getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Specialty especialidade) {
		this.especialidade = especialidade;
	}



}
