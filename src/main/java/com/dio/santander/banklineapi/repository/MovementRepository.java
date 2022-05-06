package com.dio.santander.banklineapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Integer> {
	
	public List<Movement>findByIdConta(Integer idConta);
}
