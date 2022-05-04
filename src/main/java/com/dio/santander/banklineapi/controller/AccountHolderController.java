package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.model.AccountHolder;
import com.dio.santander.banklineapi.repository.AccountHolderRepository;

@RestController
@RequestMapping("/correntistas")
public class AccountHolderController {
	
	@Autowired
	private AccountHolderRepository accountHolderRepo;
	
	@GetMapping
	public List<AccountHolder> findAll(){
		return accountHolderRepo.findAll();
	}
}
