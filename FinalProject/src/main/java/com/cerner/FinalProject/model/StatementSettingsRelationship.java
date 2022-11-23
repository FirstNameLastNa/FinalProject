package com.cerner.FinalProject.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StatementSettingsRelationship")
public class StatementSettingsRelationship {
	
	@Id
	private long id;
	@Embedded
	private StatementSettingsRelationshipId statementSettingsRelationshipId;
	@Column(name = "settingId", nullable = false)
	private String settingId;
	@Column(name = "created_at", nullable = false)
	private Date createdAt;
	@Column(name = "created_by", nullable = false)
	private String createdBy;
	@Column(name = "updated_at")
	private Date updatedAt;
	@Column(name = "updated_by")
	private String updatedBy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public StatementSettingsRelationship(long id, StatementSettingsRelationshipId statementSettingsRelationshipId,
			String settingId, Date createdAt, String createdBy, Date updatedAt, String updatedBy) {
		super();
		this.id = id;
		this.statementSettingsRelationshipId = statementSettingsRelationshipId;
		this.settingId = settingId;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}
	public StatementSettingsRelationship() {
		super();
	}
	@Override
	public String toString() {
		return "StatementSettingsRelationship [id=" + id + ", statementSettingsRelationshipId="
				+ statementSettingsRelationshipId + ", settingId=" + settingId + ", createdAt=" + createdAt
				+ ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + "]";
	}
}
