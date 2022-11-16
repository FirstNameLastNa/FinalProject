
package com.cerner.FinalProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ModifierConcept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModifierConcept {

	@Id
	private String id;                    
	private String contextId;             
	private String conceptAlias;
	private boolean modelId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	
	
	
	
	
}
