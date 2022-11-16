package com.cerner.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;
import com.cerner.FinalProject.model.Statement;
import com.cerner.FinalProject.service.StatementService;


@RestController
public class StatementController {
	
	@Autowired
	private StatementService service;
	
	
	@GetMapping(path= "/statements")
    public ResponseEntity<Page<Statement>> getStatement(Pageable pageable){       
        Page<Statement> list = service.getStatement(pageable);        
       return new ResponseEntity<Page<Statement>>(list, HttpStatus.OK);
    }
	
	
	@GetMapping(path= "/statements/{id}")
    public ResponseEntity<Statement> getStatementById(@PathVariable("id") String id){       
        Statement entity = service.getStatementById(id);        
       return new ResponseEntity<Statement>(entity, HttpStatus.OK);
    }
	
	
	 @PostMapping(path="/statements")
	 public ResponseEntity<Statement> createStatement(@RequestBody Statement statement){
		 Statement create = service.createStatement(statement);
		 return new ResponseEntity<Statement>(create, HttpStatus.OK);
		 
	 }
	
	 
	 @DeleteMapping(path="/statements/{id}")
	 public ResponseEntity<Void> deleteStatementById(@PathVariable("id") String id){
		 service.deleteStatementById(id);
		 return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		 
	 }
	 
//	 
//	 @PutMapping(path="/statements/{statementId}")
//	 public ResponseEntity<Statement> updateStatement(@RequestBody Statement statement){
//		 Statement updated = service.updateStatement(statement);
//	 return new ResponseEntity<Statement>(updated, HttpStatus.CREATED);
//		 
//	 }	 
	 

}
