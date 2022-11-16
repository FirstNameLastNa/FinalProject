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
@Table(name="StatementFunctionsRelationship")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatementFunctionsRelationship {
	@Id
	private String id;
	//private CompositeKey statementUid;
	@Embedded
	private StatementFunctionsRelationshipId statementFunctionsRelationshipId ;
	private String functionId;
	private Date createdAt;
	private Date createdBy;
	private Date updatedAt;
	private String updatedBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StatementFunctionsRelationshipId getStatementFunctionsRelationshipId() {
		return statementFunctionsRelationshipId;
	}
	public void setStatementFunctionsRelationshipId(StatementFunctionsRelationshipId statementFunctionsRelationshipId) {
		this.statementFunctionsRelationshipId = statementFunctionsRelationshipId;
	}
	public String getFunctionId() {
		return functionId;
	}
	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
	
	
	
}
