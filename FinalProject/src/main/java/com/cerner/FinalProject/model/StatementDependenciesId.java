package com.cerner.FinalProject.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class StatementDependenciesId implements Serializable{
	
	private String statementId;
	private String version;
	private String author;
	
	public StatementDependenciesId() {
		super();
	}
	@Override
	public String toString() {
		return "StatementDependenciesId [statementId=" + statementId + ", version=" + version + ", author=" + author
				+ "]";
	}
	public StatementDependenciesId(String statementId, String version, String author) {
		super();
		this.statementId = statementId;
		this.version = version;
		this.author = author;
	}
	
	public String getStatementId() {
		return statementId;
	}
	public void setStatementId(String statementId) {
		this.statementId = statementId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, statementId, version);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatementDependenciesId other = (StatementDependenciesId) obj;
		return Objects.equals(author, other.author) && Objects.equals(statementId, other.statementId)
				&& Objects.equals(version, other.version);
	}
}
