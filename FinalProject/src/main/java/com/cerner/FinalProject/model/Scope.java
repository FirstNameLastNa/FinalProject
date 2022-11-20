package com.cerner.FinalProject.model;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Scope {
	
	private String scopeId;
	private String scopeName;
	private String statementAlias;
	
	public String getScopeId() {
		return scopeId;
	}
	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}
	public String getScopeName() {
		return scopeName;
	}
	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}
	public String getStatementAlias() {
		return statementAlias;
	}
	public void setStatementAlias(String statementAlias) {
		this.statementAlias = statementAlias;
	}
	@Override
	public String toString() {
		return "Scope [scopeId=" + scopeId + ", scopeName=" + scopeName + ", statementAlias=" + statementAlias + "]";
	}
	public Scope(String scopeId, String scopeName, String statementAlias) {
		super();
		this.scopeId = scopeId;
		this.scopeName = scopeName;
		this.statementAlias = statementAlias;
	}
	public Scope() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(scopeId, scopeName, statementAlias);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scope other = (Scope) obj;
		return Objects.equals(scopeId, other.scopeId) && Objects.equals(scopeName, other.scopeName)
				&& Objects.equals(statementAlias, other.statementAlias);
	}
}
