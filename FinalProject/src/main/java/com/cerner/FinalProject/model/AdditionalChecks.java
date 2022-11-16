package com.cerner.FinalProject.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="AdditionalChecks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalChecks {

	@Id
	private String id;  
	private String type;
	private String contextId;             
	private String conceptAlias;
	private boolean modelId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContextId() {
		return contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public String getConceptAlias() {
		return conceptAlias;
	}
	public void setConceptAlias(String conceptAlias) {
		this.conceptAlias = conceptAlias;
	}
	public boolean isModelId() {
		return modelId;
	}
	public void setModelId(boolean modelId) {
		this.modelId = modelId;
	}
	public AdditionalChecks(String id, String type, String contextId, String conceptAlias, boolean modelId) {
		super();
		this.id = id;
		this.type = type;
		this.contextId = contextId;
		this.conceptAlias = conceptAlias;
		this.modelId = modelId;
	}
	public AdditionalChecks() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(conceptAlias, contextId, id, modelId, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdditionalChecks other = (AdditionalChecks) obj;
		return Objects.equals(conceptAlias, other.conceptAlias) && Objects.equals(contextId, other.contextId)
				&& Objects.equals(id, other.id) && modelId == other.modelId && Objects.equals(type, other.type);
	}
	
	
	
	
	} 
	