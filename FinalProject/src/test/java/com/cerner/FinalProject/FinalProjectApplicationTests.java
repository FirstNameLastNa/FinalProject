package com.cerner.FinalProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cerner.FinalProject.model.Scope;
import com.cerner.FinalProject.model.Statement;
import com.cerner.FinalProject.repository.StatementRepository;
import com.cerner.FinalProject.serviceimpl.StatementServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class FinalProjectApplicationTests {
	
	@Autowired
	private StatementServiceImpl service;
	
	@MockBean
	private StatementRepository repository;

	@Test
	public void getStatementTest() {
		when(repository.findAll()).thenReturn(List.of(new Statement(1, "recordName", new Scope("1","testscope", "testAlieas"), "statementDisplay", "statementText",
				"statementDependencyAlias", "recordOperations", "dateOperations", "requiredOperations",
				"selector", 5, "withDistinct", false, " tags",
				"frequencyType", 6, "status", "version", "baseVersion", "author",
				new Date() , new Date() , new Date() ,new  Date(), null, "firstLink",
				"nextLink", "prevLink", "lastLink", 10),
				new Statement(2, "recordName", new Scope("1","testscope", "testAlieas"), "statementDisplay", "statementText",
				"statementDependencyAlias", "recordOperations", "dateOperations", "requiredOperations",
				"selector", 5, "withDistinct", false, " tags",
				"frequencyType", 6, "status", "version", "baseVersion", "author",
				new Date() , new Date() , new Date() ,new  Date(), null, "firstLink",
				"nextLink", "prevLink", "lastLink", 10)));
				assertEquals(2, service.getStatement().size());
	}
	
	@Test
	public void getStatementByIdTest() {
		Statement ss = new Statement(1, "recordName", new Scope("1","testscope", "testAlieas"), "statementDisplay", "statementText",
				"statementDependencyAlias", "recordOperations", "dateOperations", "requiredOperations",
				"selector", 5, "withDistinct", false, " tags",
				"frequencyType", 6, "status", "version", "baseVersion", "author",
				new Date() , new Date() , new Date() ,new  Date(), null, "firstLink",
				"nextLink", "prevLink", "lastLink", 10);
				when(repository.findById(ss.getId())).thenReturn(Optional.of(ss));
				assertEquals(ss, service.getStatementById(ss.getId()));
	}
	
	@Test
	public void saveStatementTest() {
				Statement statement = new Statement(1, "recordName", new Scope("1","testscope", "testAlieas"), "statementDisplay", "statementText",
				"statementDependencyAlias", "recordOperations", "dateOperations", "requiredOperations",
				"selector", 5, "withDistinct", false, " tags",
				"frequencyType", 6, "status", "version", "baseVersion", "author",
				new Date() , new Date() , new Date() ,new  Date(), null, "firstLink",
				"nextLink", "prevLink", "lastLink", 10);
				when(repository.save(statement)).thenReturn(statement);
				assertEquals(statement, service.createStatement(statement));
	}
	
	@Test
	public void deleteStatementTest() {
				Statement s = new Statement(1, "recordName", new Scope("1","testscope", "testAlieas"), "statementDisplay", "statementText",
				"statementDependencyAlias", "recordOperations", "dateOperations", "requiredOperations",
				"selector", 5, "withDistinct", false, " tags",
				"frequencyType", 6, "status", "version", "baseVersion", "author",
				new Date() , new Date() , new Date() ,new  Date(), null, "firstLink",
				"nextLink", "prevLink", "lastLink", 10);
				service.deleteStatementById(s.getId());
				verify(repository, times(1)).deleteById(s.getId());
	}	
}


