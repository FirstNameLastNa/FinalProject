package com.cerner.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerner.FinalProject.model.StatementFunctionsRelationship;

@Repository
public interface StatementFunctionRepository extends JpaRepository<StatementFunctionsRelationship, Long>{

	long findStatementIdByFunctionId(Long functionId);
}
