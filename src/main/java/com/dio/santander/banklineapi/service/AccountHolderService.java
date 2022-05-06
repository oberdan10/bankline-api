package com.dio.santander.banklineapi.service;

import java.io.Console;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklineapi.dto.NewAccountHolder;
import com.dio.santander.banklineapi.model.Account;
import com.dio.santander.banklineapi.model.AccountHolder;
import com.dio.santander.banklineapi.model.Specialty;
import com.dio.santander.banklineapi.repository.AccountHolderRepository;
import com.dio.santander.banklineapi.repository.SpecialtyRepository;

@Service
public class AccountHolderService {
	
	@Autowired
	private AccountHolderRepository accountholderRepo;
	
	@Autowired
	private SpecialtyRepository specialtyRepo;
	
	
	public void save(NewAccountHolder newaccountholder) {
		
		AccountHolder accountholder = new AccountHolder();
		accountholder.setCpf(newaccountholder.getCpf());
		accountholder.setNome(newaccountholder.getNome());
		Account account = new Account();
		account.setSaldo(0.0);
		account.setNumero(new Date().getTime());
		
		Specialty specialty = new Specialty();
		specialty.setId(newaccountholder.getEspecialidade_id());
		
		accountholder.setConta(account);
		
		Specialty specialtyId = specialtyRepo.findById(newaccountholder.getEspecialidade_id()).orElse(null);
		if(specialtyId != null) {

		}
		
		accountholder.setEspecialidade(specialty);
		accountholderRepo.save(accountholder);
	}
}
