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
@Table(name="StatementSettingsRelationship")
public class StatementSettingsRelationship {
	
	@Id
	private String id;
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
	public StatementSettingsRelationship(String id, StatementSettingsRelationshipId statementSettingsRelationshipId,
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
	public int hashCode() {
		return Objects.hash(createdAt, createdBy, id, settingId, statementSettingsRelationshipId, updatedAt, updatedBy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatementSettingsRelationship other = (StatementSettingsRelationship) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(createdBy, other.createdBy)
				&& Objects.equals(id, other.id) && Objects.equals(settingId, other.settingId)
				&& Objects.equals(statementSettingsRelationshipId, other.statementSettingsRelationshipId)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(updatedBy, other.updatedBy);
	}
	@Override
	public String toString() {
		return "StatementSettingsRelationship [id=" + id + ", statementSettingsRelationshipId="
				+ statementSettingsRelationshipId + ", settingId=" + settingId + ", createdAt=" + createdAt
				+ ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + "]";
	}
}
