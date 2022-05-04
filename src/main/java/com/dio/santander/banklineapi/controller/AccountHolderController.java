package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.dto.NewAccountHolder;
import com.dio.santander.banklineapi.model.AccountHolder;
import com.dio.santander.banklineapi.repository.AccountHolderRepository;
import com.dio.santander.banklineapi.service.AccountHolderService;

@RestController
@RequestMapping("/correntistas")
public class AccountHolderController {
	
	@Autowired
	private AccountHolderRepository accountHolderRepo;
	
	@Autowired
	private AccountHolderService accountholderservice;
	
	@GetMapping
	public List<AccountHolder> findAll(){
		return accountHolderRepo.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewAccountHolder accountholder) {
		accountholderservice.save(accountholder);
	}
}
