package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.dto.NewMovement;
import com.dio.santander.banklineapi.model.Movement;
import com.dio.santander.banklineapi.repository.MovementRepository;
import com.dio.santander.banklineapi.service.MovementService;

@RestController
@RequestMapping("/movimentacao")
public class MovementController {

	@Autowired
	private MovementRepository movementRepo;
	
	@Autowired
	private MovementService movementservice;
	
	@GetMapping
	public List<Movement> findAll(){
		return movementRepo.findAll();
	}
	
	@GetMapping("/{idConta}")
	public List<Movement> findAll(@PathVariable("idConta") Integer idConta){
		return movementRepo.findByIdConta(idConta);
	}
	
	@PostMapping
	public void save(@RequestBody NewMovement movement) {
		movementservice.save(movement);
	}
}
