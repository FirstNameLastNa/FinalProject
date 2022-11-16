package com.cerner.FinalProject.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cerner.FinalProject.model.Statement;
import com.cerner.FinalProject.repository.StatementRepository;
import com.cerner.FinalProject.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService{
	
	@Autowired
	private StatementRepository repository;
	
	@Override
	public Page<Statement> getStatement(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Statement createStatement(Statement statement) {
		return repository.save(statement);
	}

	@Override
	public Statement getStatementById(String id) {
		
		Optional<Statement> statement = repository.findById(id);
		if(statement.isPresent()) {
			return statement.get();
		}else {
			return null;
		}
		
	
	}

	@Override
	public void deleteStatementById(String id) {
		Optional<Statement> statement = repository.findById(id);
		Statement deletedStatementid = statement.get();
		repository.deleteById(id);
		
	}
	
//	@Override
//	public Statement updateStatement(Statement statement) {
//		
//		Optional<Statement> statement = repository.findById(statement.get());
//		if(statement.isPresent()) {
//			Statement newStatement = statement.get();
//			newStatement.setId(statement.getId());
//			newStatement.setAuthor(statement.getAuthor());
//			newStatement.setBaseVersion(statement.getBaseVersion());
//			newStatement.getCardinality(statement.getCardinality());
//			newStatement.getCreatedAt(statement.getCreatedAt());
//			newStatement.getCreatedBy(statement.getCreatedBy());
//			newStatement.getFrequencyType(statement.getFrequencyType());
//			return newStatement;
//		}
//		return null;
//		
		
	}


