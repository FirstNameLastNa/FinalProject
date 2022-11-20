package com.cerner.FinalProject.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cerner.FinalProject.model.Statement;

public interface StatementService {

	List<Statement> getStatement();

	Statement createStatement(Statement statement);

	Statement getStatementById(Long id);

	void deleteStatementById(Long id);

	Statement updateStatement(Statement statement);

	Statement findStatementWithPagination(Long id, String statementDisplay, Integer offset, Integer limit,
			String location);

	long getStatementIdBySettinginId(Long settingId);

	long getStatementByFunctionId(Long functionId);

}
