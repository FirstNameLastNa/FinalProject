package com.cerner.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cerner.FinalProject.exception.ResourceAlreadyExists;
import com.cerner.FinalProject.exception.ResourceNotFoundException;
import com.cerner.FinalProject.model.Statement;
import com.cerner.FinalProject.service.StatementService;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Validated
@RestController
public class StatementController {
	
	@Autowired
	private StatementService service;
	
	
	@GetMapping(path= "/statements1")
    public ResponseEntity<List<Statement>> getStatement(){       
		List<Statement> list = service.getStatement();        
       return new ResponseEntity<List<Statement>>(list, HttpStatus.OK);
    }
	
	@GetMapping(path= "/statements1/{id}")
    public ResponseEntity<Statement> getStatementById(@PathVariable("id") Long id) throws ResourceNotFoundException{       
        Statement entity = service.getStatementById(id);        
       return new ResponseEntity<Statement>(entity, HttpStatus.OK);
    }
	
	 @PostMapping(path="/statements")
	 public ResponseEntity<Statement> createStatement(@RequestBody Statement statement)throws ResourceAlreadyExists{
		 Statement create = service.createStatement(statement);
		 return new ResponseEntity<Statement>(create, HttpStatus.OK);
	 }
	 
	 @DeleteMapping(path="/statements/{id}")
	 public ResponseEntity<Void> deleteStatementById(@PathVariable("id") Long id){
		 service.deleteStatementById(id);
		 return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	 }
	 
	 @PutMapping(path="/statements")
	 public ResponseEntity<Statement> updateStatement( @RequestBody Statement statement){
		 Statement updatedStatement = service.updateStatement(statement);
	 return new ResponseEntity<Statement>(updatedStatement, HttpStatus.CREATED);
		 
	 }	 
	 
	 @GetMapping("/statements")
	 public ResponseEntity<Statement> getPaginationValues(@RequestParam(required = false, name="id") Long id,
			 @RequestParam(required = true, name="statementDisplay") String statementDisplay,
			 @RequestParam(required = true, name="offset", defaultValue = "0") @Min(0) Integer offset,
			 @RequestParam(required = true, name="limit", defaultValue = "50")  @Min(1) @Max(75) Integer limit) {
		 String location = ServletUriComponentsBuilder.fromCurrentContextPath().build().toString();
		 Statement statement = service.findStatementWithPagination(id,statementDisplay, offset, limit, location);
		 
		 if(statement!=null) {
			// return ResponseEntity.ok().build(statement);
			 return ResponseEntity.status(HttpStatus.OK).body(statement);
		 }
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		 
	 }
	 
	 @GetMapping(path= "/statements/search/settings/{settingId}")
	 public ResponseEntity<Statement> getStatementBySettingId(@PathVariable("settingId") Long settingId) throws ResourceNotFoundException{ 
		 long statementId = service.getStatementIdBySettinginId(settingId);
		 Statement entity = service.getStatementById(statementId);        
		 return new ResponseEntity<Statement>(entity, HttpStatus.OK);
   }
	 
	 @GetMapping(path= "/statements/search/functions/{functionId}")
	 public ResponseEntity<Statement> getStatementByFunctionId(@PathVariable("functionId") Long functionId) throws ResourceNotFoundException{ 
		 long statementId = service.getStatementByFunctionId(functionId);
		 Statement entity = service.getStatementById(statementId);        
		 return new ResponseEntity<Statement>(entity, HttpStatus.OK);
   }
	 
	 
}


