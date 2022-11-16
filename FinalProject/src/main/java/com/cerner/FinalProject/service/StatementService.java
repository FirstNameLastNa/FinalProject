package com.cerner.FinalProject.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cerner.FinalProject.model.Statement;

public interface StatementService {

	Page<Statement> getStatement(Pageable pageable);

	Statement createStatement(Statement statement);

	Statement getStatementById(String id);

	void deleteStatementById(String id);

	//Statement updateStatement(Statement statement);

}
