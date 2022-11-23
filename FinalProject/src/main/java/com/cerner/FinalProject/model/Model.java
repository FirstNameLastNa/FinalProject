package com.cerner.FinalProject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Model")
public class Model {
	
	private long id;
	@Column(name="model", nullable = false, columnDefinition = "Text")
	private String modal;
	@Embedded
	private ModelComposite modelComposite;
	@Column(name="negateModifier", nullable = false)
	private boolean negateModifier;
	private Statement statement;
	
	List<PrimaryConcept> primaryConcepts;
	List<ModifierConcept> modifierConcepts;
	List<AdditionalChecks> additionalChecks;
	
	@Id
    @Column(name = "modalId")
    @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	@ManyToOne
	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", modal=" + modal + ", modelComposite=" + modelComposite + ", negateModifier="
				+ negateModifier + "]";
	}

	@OneToMany(targetEntity = PrimaryConcept.class,    mappedBy = "model",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<PrimaryConcept> getPrimaryConcepts() {
		return primaryConcepts;
	}

	public void setPrimaryConcepts(List<PrimaryConcept> primaryConcepts) {
		this.primaryConcepts = primaryConcepts;
	}

	@OneToMany(targetEntity = ModifierConcept.class, mappedBy = "model", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<ModifierConcept> getModifierConcepts() {
		return modifierConcepts;
	}

	public void setModifierConcepts(List<ModifierConcept> modifierConcepts) {
		this.modifierConcepts = modifierConcepts;
	}

	@OneToMany(targetEntity = AdditionalChecks.class, mappedBy = "model", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<AdditionalChecks> getAdditionalChecks() {
		return additionalChecks;
	}

	public void setAdditionalChecks(List<AdditionalChecks> additionalChecks) {
		this.additionalChecks = additionalChecks;
	}
}
