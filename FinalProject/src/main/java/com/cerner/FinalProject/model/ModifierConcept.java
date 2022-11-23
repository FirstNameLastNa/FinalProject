package com.cerner.FinalProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ModifierConcept")
public class ModifierConcept {
	
	private long id;
	@Column(name="contextId", nullable = false)
	private String contextId;
	@Column(name="conceptAlias", nullable = false)
	private String conceptAlias;
	@Column(name="modelId", nullable = false)
	private boolean modelId;
	private Model model;
	
	@ManyToOne
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	@Id
    @Column(name = "MODIFIER_CONCEPT_ID")
    @GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public ModifierConcept(long id, String contextId, String conceptAlias, boolean modelId) {
		super();
		this.id = id;
		this.contextId = contextId;
		this.conceptAlias = conceptAlias;
		this.modelId = modelId;
	}
	public ModifierConcept() {
		super();
	}
	
	@Override
	public String toString() {
		return "ModifierConcept [id=" + id + ", contextId=" + contextId + ", conceptAlias=" + conceptAlias
				+ ", modelId=" + modelId + "]";
	}
}
