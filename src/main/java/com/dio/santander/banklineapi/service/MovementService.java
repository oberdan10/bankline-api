package com.dio.santander.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklineapi.dto.NewMovement;
import com.dio.santander.banklineapi.model.AccountHolder;
import com.dio.santander.banklineapi.model.Movement;
import com.dio.santander.banklineapi.model.MovementType;
import com.dio.santander.banklineapi.repository.AccountHolderRepository;
import com.dio.santander.banklineapi.repository.MovementRepository;

@Service
public class MovementService {
	@Autowired
	private MovementRepository movementRepo;
	
	@Autowired
	private AccountHolderRepository accountHolderRepo;
	
	public void save(NewMovement newmovement) {
		Movement movement = new Movement();
		Double valor = newmovement.getTipo() == MovementType.Receita ? newmovement.getValor() : newmovement.getValor()*(-1);
		
		movement.setDataHora(LocalDateTime.now());
		movement.setDescricao(newmovement.getDescricao());
		movement.setIdConta(newmovement.getIdConta());
		movement.setTipo(newmovement.getTipo());
		movement.setValor(valor);
		
		AccountHolder accountholder = accountHolderRepo.findById(newmovement.getIdConta()).orElse(null);
		if(accountholder != null) {
			accountholder.getConta().setSaldo(accountholder.getConta().getSaldo() + valor);
			accountHolderRepo.save(accountholder);
		}
		movementRepo.save(movement);
		
	}
}
