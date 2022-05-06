package com.dio.santander.banklineapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklineapi.dto.NewSpecialty;
import com.dio.santander.banklineapi.model.Specialty;
import com.dio.santander.banklineapi.repository.SpecialtyRepository;

@Service
public class SpecialtyService {

	@Autowired
	private SpecialtyRepository specialtyrepo;
	
	public void save(NewSpecialty newspecialty) {
		Specialty specialty = new Specialty();
		
		specialty.setEspecialidade(newspecialty.getEspecialidade());
		specialty.setDescricao(newspecialty.getDescricao());
		
		specialtyrepo.save(specialty);
	}
}
