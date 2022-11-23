package com.cerner.FinalProject.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StatementDependencies")
public class StatementDependencies {
	
	@Id
	private String id;  
	@Embedded
	private StatementDependenciesId statementDependenciesId ;
	@Column(name="dependencyStatementId")
	private String dependencyStatementId;
	@Column(name = "created_at", nullable = false)
	private Date createdAt;	
	@Column(name = "updated_at")
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
	public StatementDependencies(String id, StatementDependenciesId statementDependenciesId,
			String dependencyStatementId, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.statementDependenciesId = statementDependenciesId;
		this.dependencyStatementId = dependencyStatementId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public StatementDependencies() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdAt, dependencyStatementId, id, statementDependenciesId, updatedAt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatementDependencies other = (StatementDependencies) obj;
		return Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(dependencyStatementId, other.dependencyStatementId) && Objects.equals(id, other.id)
				&& Objects.equals(statementDependenciesId, other.statementDependenciesId)
				&& Objects.equals(updatedAt, other.updatedAt);
	}
	@Override
	public String toString() {
		return "StatementDependencies [id=" + id + ", statementDependenciesId=" + statementDependenciesId
				+ ", dependencyStatementId=" + dependencyStatementId + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
}
