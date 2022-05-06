package com.dio.santander.banklineapi.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

import com.dio.santander.banklineapi.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer>{
	
}
