package com.dio.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

	
}
