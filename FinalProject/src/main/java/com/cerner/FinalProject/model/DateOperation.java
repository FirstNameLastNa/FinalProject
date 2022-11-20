package com.cerner.FinalProject.model;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonType;

@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonType.class)
})
public class DateOperation implements Serializable{
	private final static long serialVersionUID = 1L;
	
	private String fnName;
	private String arguments;
	
	public String getFnName() {
		return fnName;
	}
	public void setFnName(String fnName) {
		this.fnName = fnName;
	}
	public String getArguments() {
		return arguments;
	}
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
	public DateOperation(String fnName, String arguments) {
		super();
		this.fnName = fnName;
		this.arguments = arguments;
	}
	public DateOperation() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(arguments, fnName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateOperation other = (DateOperation) obj;
		return Objects.equals(arguments, other.arguments) && Objects.equals(fnName, other.fnName);
	}
	@Override
	public String toString() {
		return "DateOperation [fnName=" + fnName + ", arguments=" + arguments + "]";
	}
	
	

}
