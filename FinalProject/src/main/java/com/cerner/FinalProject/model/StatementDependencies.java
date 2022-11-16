package com.cerner.FinalProject.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="StatementDependencies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatementDependencies {
	
	@Id
	private String id;  
	
	//private CompositeKey statementUid; 
	
	@Embedded
	private StatementDependenciesId statementDependenciesId ;
	
	private String dependencyStatementId;
	private Date createdAt;	
	private Date updatedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StatementDependenciesId getStatementDependenciesId() {
		return statementDependenciesId;
	}
	public void setStatementDependenciesId(StatementDependenciesId statementDependenciesId) {
		this.statementDependenciesId = statementDependenciesId;
	}
	public String getDependencyStatementId() {
		return dependencyStatementId;
	}
	public void setDependencyStatementId(String dependencyStatementId) {
		this.dependencyStatementId = dependencyStatementId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
	

}
