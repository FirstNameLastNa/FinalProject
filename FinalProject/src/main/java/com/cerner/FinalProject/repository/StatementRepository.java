package com.cerner.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerner.FinalProject.model.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, String>{
	

	

	

}
