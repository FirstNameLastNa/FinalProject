package com.cerner.FinalProject.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="statement")
public class Statement {
	
	private long id;
	@Column(name="recordName", nullable = false, columnDefinition = "Text")
	private String recordName;
	private Scope scope;
	@Column(name="statementDisplay", nullable = false, columnDefinition = "Text")
	private String statementDisplay;
	@Column(name="statementText", nullable = false, columnDefinition = "Text")
	private String statementText;
	@Column(name="statementDependencyAlias", nullable = false, columnDefinition = "Text")
	private String statementDependencyAlias;
	@Column(name="recordOperations", nullable = false, columnDefinition = "Text")
	private String recordOperations;
	@Column(name="dateOperations", nullable = false, columnDefinition = "Text")
	private String dateOperations;
	@Column(name="requiredOperations", nullable = false, columnDefinition = "Text")
	private String requiredOperations;
	@Column(name="selector", nullable = false, columnDefinition = "Text")
	private String selector;
	@Column(name="cardinality", nullable = false)
	private long cardinality;
	@Column(name="withDistinct",columnDefinition = "Text")
	private String withDistinct;
	@Column(name="negateStatement", nullable = false)
	private boolean negateStatement;
	@Column(name="tags", nullable = false, columnDefinition = "Text")
	private String tags;
	@Column(name="frequencyType")
	private String frequencyType;
	@Column(name="frequencyValue")
	private long frequencyValue;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="version", nullable = false)
	private String version;
	@Column(name="baseVersion", nullable = false)
	private String baseVersion;
	@Column(name="author", nullable = false, length = 36)
	private String author;
	@Column(name = "created_by", nullable = false)
	private Date createdBy;
	@Column(name = "created_at", nullable = false)
	private Date createdAt;
	@Column(name = "updated_at")
	private Date updatedAt;
	@Column(name = "updated_by")
	private Date updatedBy;
	private String firstLink;
	private String nextLink;
	private String prevLink;
	private String lastLink;
	private int totalResults;
	
	List<Model> models;
	
	 public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	public String getFirstLink() {
		return firstLink;
	}

	public void setFirstLink(String firstLink) {
		this.firstLink = firstLink;
	}

	public String getNextLink() {
		return nextLink;
	}

	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}

	public String getPrevLink() {
		return prevLink;
	}

	public void setPrevLink(String prevLink) {
		this.prevLink = prevLink;
	}

	public String getLastLink() {
		return lastLink;
	}

	public void setLastLink(String lastLink) {
		this.lastLink = lastLink;
	}

	@Id
	 @Column(name = "STATEMENT_ID")
	 @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public String getStatementDisplay() {
		return statementDisplay;
	}

	public void setStatementDisplay(String statementDisplay) {
		this.statementDisplay = statementDisplay;
	}

	public String getStatementText() {
		return statementText;
	}

	public void setStatementText(String statementText) {
		this.statementText = statementText;
	}

	public String getStatementDependencyAlias() {
		return statementDependencyAlias;
	}

	public void setStatementDependencyAlias(String statementDependencyAlias) {
		this.statementDependencyAlias = statementDependencyAlias;
	}

	public String getSelector() {
		return selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public long getCardinality() {
		return cardinality;
	}

	public void setCardinality(long cardinality) {
		this.cardinality = cardinality;
	}

	public String getWithDistinct() {
		return withDistinct;
	}

	public void setWithDistinct(String withDistinct) {
		this.withDistinct = withDistinct;
	}

	public boolean getNegateStatement() {
		return negateStatement;
	}

	public void setNegateStatement(boolean negateStatement) {
		this.negateStatement = negateStatement;
	}

	public String getFrequencyType() {
		return frequencyType;
	}

	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public long getFrequencyValue() {
		return frequencyValue;
	}

	public void setFrequencyValue(long frequencyValue) {
		this.frequencyValue = frequencyValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBaseVersion() {
		return baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public Statement() {
		super();
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	@OneToMany(targetEntity = Model.class, mappedBy = "statement", fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public String getRecordOperations() {
		return recordOperations;
	}

	public void setRecordOperations(String recordOperations) {
		this.recordOperations = recordOperations;
	}

	public String getDateOperations() {
		return dateOperations;
	}

	public void setDateOperations(String dateOperations) {
		this.dateOperations = dateOperations;
	}

	public String getRequiredOperations() {
		return requiredOperations;
	}

	public void setRequiredOperations(String requiredOperations) {
		this.requiredOperations = requiredOperations;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Statement [id=" + id + ", recordName=" + recordName + ", scope=" + scope + ", statementDisplay="
				+ statementDisplay + ", statementText=" + statementText + ", statementDependencyAlias="
				+ statementDependencyAlias + ", recordOperations=" + recordOperations + ", dateOperations="
				+ dateOperations + ", requiredOperations=" + requiredOperations + ", selector=" + selector
				+ ", cardinality=" + cardinality + ", withDistinct=" + withDistinct + ", negateStatement="
				+ negateStatement + ", tags=" + tags + ", frequencyType=" + frequencyType + ", frequencyValue="
				+ frequencyValue + ", status=" + status + ", version=" + version + ", baseVersion=" + baseVersion
				+ ", author=" + author + ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", updatedBy=" + updatedBy + ", models=" + models + ", firstLink=" + firstLink
				+ ", nextLink=" + nextLink + ", prevLink=" + prevLink + ", lastLink=" + lastLink + ", totalResults="
				+ totalResults + "]";
	}

	public Statement(long id, String recordName, Scope scope, String statementDisplay, String statementText,
			String statementDependencyAlias, String recordOperations, String dateOperations, String requiredOperations,
			String selector, long cardinality, String withDistinct, boolean negateStatement, String tags,
			String frequencyType, long frequencyValue, String status, String version, String baseVersion, String author,
			Date createdBy, Date createdAt, Date updatedAt, Date updatedBy, List<Model> models, String firstLink,
			String nextLink, String prevLink, String lastLink, int totalResults) {
		super();
		this.id = id;
		this.recordName = recordName;
		this.scope = scope;
		this.statementDisplay = statementDisplay;
		this.statementText = statementText;
		this.statementDependencyAlias = statementDependencyAlias;
		this.recordOperations = recordOperations;
		this.dateOperations = dateOperations;
		this.requiredOperations = requiredOperations;
		this.selector = selector;
		this.cardinality = cardinality;
		this.withDistinct = withDistinct;
		this.negateStatement = negateStatement;
		this.tags = tags;
		this.frequencyType = frequencyType;
		this.frequencyValue = frequencyValue;
		this.status = status;
		this.version = version;
		this.baseVersion = baseVersion;
		this.author = author;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.models = models;
		this.firstLink = firstLink;
		this.nextLink = nextLink;
		this.prevLink = prevLink;
		this.lastLink = lastLink;
		this.totalResults = totalResults;
	}
}
