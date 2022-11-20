package com.cerner.FinalProject.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="StatementFunctionsRelationship")
public class StatementFunctionsRelationship {
	
	@Id
	private String id;
	@Embedded
	private StatementFunctionsRelationshipId statementFunctionsRelationshipId;
	@Column(name = "functionId", nullable = false)
	private String functionId;
	@Column(name = "created_at", nullable = false)
	private Date createdAt;
	@Column(name = "created_by", nullable = false)
	private Date createdBy;
	@Column(name = "updated_at")
	private Date updatedAt;
	@Column(name = "updated_by")
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
	public StatementFunctionsRelationship(String id, StatementFunctionsRelationshipId statementFunctionsRelationshipId,
			String functionId, Date createdAt, Date createdBy, Date updatedAt, String updatedBy) {
		super();
		this.id = id;
		this.statementFunctionsRelationshipId = statementFunctionsRelationshipId;
		this.functionId = functionId;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}
	public StatementFunctionsRelationship() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdAt, createdBy, functionId, id, statementFunctionsRelationshipId, updatedAt,
				updatedBy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatementFunctionsRelationship other = (StatementFunctionsRelationship) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(createdBy, other.createdBy)
				&& Objects.equals(functionId, other.functionId) && Objects.equals(id, other.id)
				&& Objects.equals(statementFunctionsRelationshipId, other.statementFunctionsRelationshipId)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(updatedBy, other.updatedBy);
	}
	@Override
	public String toString() {
		return "StatementFunctionsRelationship [id=" + id + ", statementFunctionsRelationshipId="
				+ statementFunctionsRelationshipId + ", functionId=" + functionId + ", createdAt=" + createdAt
				+ ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + "]";
	}
}
