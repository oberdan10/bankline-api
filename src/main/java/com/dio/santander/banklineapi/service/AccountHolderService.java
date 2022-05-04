package com.dio.santander.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklineapi.dto.NewAccountHolder;
import com.dio.santander.banklineapi.model.Account;
import com.dio.santander.banklineapi.model.AccountHolder;
import com.dio.santander.banklineapi.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	
	@Autowired
	private AccountHolderRepository accountholderrepo;
	
	public void save(NewAccountHolder newaccountholder) {
		
		AccountHolder accountholder = new AccountHolder();
		accountholder.setCpf(newaccountholder.getCpf());
		accountholder.setName(newaccountholder.getNome());
		
		Account account = new Account();
		account.setSaldo(0.0);
		account.setNumero(new Date().getTime());
		
		accountholder.setConta(account);
		accountholderrepo.save(accountholder);
	}
}
