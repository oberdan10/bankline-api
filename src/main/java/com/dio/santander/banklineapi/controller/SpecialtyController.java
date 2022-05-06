package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.dto.NewSpecialty;
import com.dio.santander.banklineapi.model.Specialty;
import com.dio.santander.banklineapi.repository.SpecialtyRepository;
import com.dio.santander.banklineapi.service.SpecialtyService;

@RestController
@RequestMapping("/especialidades")
public class SpecialtyController {

	@Autowired
	private SpecialtyRepository specialtyRepo;
	
	@Autowired
	private SpecialtyService specialtyservice;
	
	@GetMapping
	public List<Specialty> findAll(){
		return specialtyRepo.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewSpecialty specialty) {
		specialtyservice.save(specialty);
	}
}
