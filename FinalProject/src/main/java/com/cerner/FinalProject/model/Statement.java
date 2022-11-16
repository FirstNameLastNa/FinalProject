package com.cerner.FinalProject.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="statement")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Statement {
	@Column(unique=true)
	@Id
	private String Id;
	
	private String recordName;
	
	//private Scope scope;
	private String statementDisplay;
	private String statementText;
	private String statementDependencyAlias;
	
//	@Type(type = "json")
//	@Column(columnDefinition = "json")
//	private RecordOperation recordOperations;	
//	
//	@Type(type = "json")
//	@Column(columnDefinition = "json")
//	private DateOperation dateOperations;
//	
//	@Type(type = "json")
//	@Column(columnDefinition = "json")
//	private RequiredOperation requiredOperations;
	
	private String selector;
	private long cardinality;
	private String withDistinct;
	private boolean negateStatement;
	private String[] tags;
	private String frequencyType;
	private long frequencyValue;
	
	private String status;
	private String version;
	private String baseVersion;
	private String author;
	
	private Date createdBy;
	private Date createdAt;
	private Date updatedAt;
	private Date updatedBy;
	
//	@OneToOne(mappedBy = "Statement", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//	List<Model> models;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
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
	public boolean isNegateStatement() {
		return negateStatement;
	}
	public void setNegateStatement(boolean negateStatement) {
		this.negateStatement = negateStatement;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
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
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUopdatedAt() {
		return updatedAt;
	}
	public void setUopdatedAt(Date uopdatedAt) {
		this.updatedAt = uopdatedAt;
	}
	public Date getUpdatedBy() {
		return updatedBy;
	}
	public void setUopdatedBy(Date uopdatedBy) {
		this.updatedBy = uopdatedBy;
	}
	public Statement(String id, String recordName, String statementDisplay, String statementText,
			String statementDependencyAlias, String selector, long cardinality, String withDistinct,
			boolean negateStatement, String[] tags, String frequencyType, long frequencyValue, String status,
			String version, String baseVersion, String author, Date createdBy, Date createdAt, Date uopdatedAt,
			Date uopdatedBy) {
		super();
		Id = id;
		this.recordName = recordName;
		this.statementDisplay = statementDisplay;
		this.statementText = statementText;
		this.statementDependencyAlias = statementDependencyAlias;
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
		this.updatedAt = uopdatedAt;
		this.updatedBy = uopdatedBy;
	}
	public Statement() {
		super();
	}
	@Override
	public String toString() {
		return "Statement [Id=" + Id + ", recordName=" + recordName + ", statementDisplay=" + statementDisplay
				+ ", statementText=" + statementText + ", statementDependencyAlias=" + statementDependencyAlias
				+ ", selector=" + selector + ", cardinality=" + cardinality + ", withDistinct=" + withDistinct
				+ ", negateStatement=" + negateStatement + ", tags=" + Arrays.toString(tags) + ", frequencyType="
				+ frequencyType + ", frequencyValue=" + frequencyValue + ", status=" + status + ", version=" + version
				+ ", baseVersion=" + baseVersion + ", author=" + author + ", createdBy=" + createdBy + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + "]";
	}
	
	


}
