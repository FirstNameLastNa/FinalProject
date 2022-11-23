package com.cerner.FinalProject.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
		Statement statementDBObject = repository.findById(statement.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Statement not exist with id: " + statement.getId()));
	
		if(statementDBObject!=null) {
			statementDBObject.setAuthor(statement.getAuthor());
			statementDBObject.setId(statement.getId());
			statementDBObject.setBaseVersion(statement.getBaseVersion());
			statementDBObject.setCardinality(statement.getCardinality());
			statementDBObject.setCreatedAt(statement.getCreatedAt());
			statementDBObject.setCreatedBy(statement.getCreatedBy());
			statementDBObject.setFrequencyType(statement.getFrequencyType());
			statementDBObject.setFrequencyValue(statement.getFrequencyValue());
			statementDBObject.setRecordName(statement.getRecordName());
			statementDBObject.setSelector(statement.getSelector());
			statementDBObject.setStatementDependencyAlias(statement.getStatementDependencyAlias());
			statementDBObject.setStatementDisplay(statement.getStatementDisplay());
			statementDBObject.setStatementText(statement.getStatementText());
			statementDBObject.setStatus(statement.getStatus());
			statementDBObject.setTags(statement.getTags());
			statementDBObject.setUpdatedAt(statement.getUpdatedAt());
			statementDBObject.setUpdatedBy(statement.getUpdatedBy());
			statementDBObject.setVersion(statement.getVersion());
			statementDBObject.setWithDistinct(statement.getWithDistinct());
			statementDBObject.setNegateStatement(statement.getNegateStatement());
	
        return repository.save(statementDBObject);
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
				statement = statements2.get(0);
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
					
					statement = statements2.get(0);
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

