package com.cerner.FinalProject.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cerner.FinalProject.exception.CustomException;
import com.cerner.FinalProject.exception.ResourceNotFoundException;
import com.cerner.FinalProject.model.Statement;
import com.cerner.FinalProject.repository.StatementFunctionRepository;
import com.cerner.FinalProject.repository.StatementRepository;
import com.cerner.FinalProject.repository.StatementSettingRepository;
import com.cerner.FinalProject.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService{
	
	@Autowired
	private StatementRepository repository;
	
	@Autowired
	private StatementSettingRepository settingRepository;
	
	@Autowired
	private StatementFunctionRepository functionRepository;
	
	
	@Override
	public List<Statement> getStatement() {
		return repository.findAll();
	}
	
	@Override
	public Statement getStatementById(Long id) {
		
		Optional<Statement> statement = repository.findById(id);
		
		if(statement.isPresent()) {
			return statement.get();
		}else {
			 throw new ResourceNotFoundException("404");
		}
	}
	
	@Override
	public long getStatementIdBySettinginId(Long settingId) {
		
		return settingRepository.findStatementIdBySettingId(settingId);
	}


	@Override
	public long getStatementByFunctionId(Long functionId) {
		
		return functionRepository.findStatementIdByFunctionId(functionId);
	}

	@Override
	public Statement createStatement(Statement statement) {
		
		
		Statement savedStatement = repository.save(statement);
		return savedStatement;
	}
	

	@Override
	public void deleteStatementById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Statement updateStatement(@RequestBody Statement statement) {
		Statement updateStatement = repository.findById(statement.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Statement not exist with id: " + statement.getId()));
		if(updateStatement!=null) {
		updateStatement.setAuthor(statement.getAuthor());
		updateStatement.setId(statement.getId());
		updateStatement.setBaseVersion(statement.getBaseVersion());
		updateStatement.setCardinality(statement.getCardinality());
		updateStatement.setCreatedAt(statement.getCreatedAt());
		updateStatement.setCreatedBy(statement.getCreatedBy());
		updateStatement.setFrequencyType(statement.getFrequencyType());
		updateStatement.setFrequencyValue(statement.getFrequencyValue());
		updateStatement.setRecordName(statement.getRecordName());
		updateStatement.setSelector(statement.getSelector());
		updateStatement.setStatementDependencyAlias(statement.getStatementDependencyAlias());
		updateStatement.setStatementDisplay(statement.getStatementDisplay());
		updateStatement.setStatementText(statement.getStatementText());
		updateStatement.setStatus(statement.getStatus());
		updateStatement.setTags(statement.getTags());
		updateStatement.setUpdatedAt(statement.getUpdatedAt());
		updateStatement.setUpdatedBy(statement.getUpdatedBy());
		updateStatement.setVersion(statement.getVersion());
		updateStatement.setWithDistinct(statement.getWithDistinct());
		updateStatement.setNegateStatement(statement.getNegateStatement());
	
        return repository.save(updateStatement);
		}
		else {
			repository.save(statement);
			return statement;
		}
    }

	@Override
	public Statement findStatementWithPagination(Long id, String statementDisplay, Integer offset, Integer limit,
			String location) {
		
		Statement statement = null;
		
		if(id!=null) {
			
			Page<Statement> statements = repository.findByIdContaining(id,PageRequest.of(offset, limit));
			List<Statement> statements2 = statements.toList();
			
			if(statements2!=null) {
				statement = new Statement();
				statement.setTotalResults(statements.getNumberOfElements());				
			}
			
			if(offset<(statements.getTotalPages())-1) {
				
				statement.setNextLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
			}
			if(offset==0 && statements.getNumberOfElements()==0) {
			}
			else {
			statement.setFirstLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
			}
			System.out.println(statements.getTotalPages());
			if(offset>0) {				
				statement.setPrevLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
			}
			
			if(offset==0 ) {
				
			}else {
				
				statement.setLastLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);				
			}
		}
		else {
				
				Page<Statement> statements= repository.findAll(PageRequest.of(offset, limit));
				List<Statement> statements2 = statements.toList();
				
				if(statements2!=null) {
					
					statement = new Statement();
				}
				System.out.println(statements.getTotalPages());
				
				if(offset<(statements.getTotalPages())-1) {
					statement.setNextLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
				}
				if(offset==0 && statements.getNumberOfElements()==0) {
				}
				else {
				statement.setFirstLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
				}
				
				if(offset>0) {
					statement.setPrevLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
				}
				if(offset==0 ) {
					
				}
				else {
					statement.setLastLink(location+(id!=null?"id="+id+"&":"")+"statementDisplay="+statementDisplay+"offset="+(offset+1)+"&limit="+limit);
					
				}
			}
				
		return statement;
	}

}

