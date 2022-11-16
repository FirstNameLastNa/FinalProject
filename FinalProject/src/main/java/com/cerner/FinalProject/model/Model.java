package com.cerner.FinalProject.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Model")
public class Model {
	@Id
	private String id;
	private String modal;
	
	//private String statementUid;
	
	@Embedded
	private ModelComposite modelComposite;
	
//	@OneToOne(mappedBy = "Model", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//	List<PrimaryConcept> primaryConcepts;
//	
//	@OneToOne(mappedBy = "Model", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//	List<ModifierConcept> modifierConcepts;
//	
//	
//	@OneToOne(mappedBy = "Model", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//	List<AdditionalChecks> additionalChecks;
	
	
	private boolean negateModifier;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public ModelComposite getModelComposite() {
		return modelComposite;
	}

	public void setModelComposite(ModelComposite modelComposite) {
		this.modelComposite = modelComposite;
	}

	public boolean isNegateModifier() {
		return negateModifier;
	}

	public void setNegateModifier(boolean negateModifier) {
		this.negateModifier = negateModifier;
	}
		


	
	
	
	
	
}
