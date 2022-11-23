package com.cerner.FinalProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AdditionalChecks")
public class AdditionalChecks {
	
	private long  id; 
	@Column(name="type", nullable = false)
	private String type;
	@Column(name="contextId", nullable = false)
	private String contextId; 
	@Column(name="conceptAlias", nullable = false)
	private String conceptAlias;
	@Column(name="modelId", nullable = false)
	private boolean modalId;
	private Model model;
	
	@ManyToOne
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	@Id
    @Column(name = "ADDITIONAL_CHECKS_ID")
    @GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public boolean isModalId() {
		return modalId;
	}
	public void setModalId(boolean modelId) {
		this.modalId = modelId;
	}
	public AdditionalChecks(long id, String type, String contextId, String conceptAlias, boolean modalId) {
		super();
		this.id = id;
		this.type = type;
		this.contextId = contextId;
		this.conceptAlias = conceptAlias;
		this.modalId = modalId;
	}
	public AdditionalChecks() {
		super();
	}
} 
	