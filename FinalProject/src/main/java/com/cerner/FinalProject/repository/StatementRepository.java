package com.cerner.FinalProject.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerner.FinalProject.model.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Long>{

	Page<Statement> findByIdContaining(Long id, PageRequest of);
}
