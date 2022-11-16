package com.cerner.FinalProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scope {
	
	private String id;
	private String name;
	private String statementAlias;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatementAlias() {
		return statementAlias;
	}
	public void setStatementAlias(String statementAlias) {
		this.statementAlias = statementAlias;
	}
	
	
	
	
}
