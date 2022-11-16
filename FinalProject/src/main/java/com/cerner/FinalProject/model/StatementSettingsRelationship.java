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
@Table(name="StatementSettingsRelationship")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class StatementSettingsRelationship {
	@Id
	private String id;
	//private CompositeKey statementUid; //(statementId + Version + Author)	varchar(36)	TRUE	The id for the statement.
	
	@Embedded
	private StatementSettingsRelationshipId statementSettingsRelationshipId ;
	private String settingId ;
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StatementSettingsRelationshipId getStatementSettingsRelationshipId() {
		return statementSettingsRelationshipId;
	}
	public void setStatementSettingsRelationshipId(StatementSettingsRelationshipId statementSettingsRelationshipId) {
		this.statementSettingsRelationshipId = statementSettingsRelationshipId;
	}
	public String getSettingId() {
		return settingId;
	}
	public void setSettingId(String settingId) {
		this.settingId = settingId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
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
