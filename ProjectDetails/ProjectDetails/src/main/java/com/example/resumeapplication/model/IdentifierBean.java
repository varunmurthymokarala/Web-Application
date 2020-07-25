package com.example.resumeapplication.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdentifierBean {
	
	private Long identifierId;
	private String identifierName;
	private String type;
	private String status;
	public Long getIdentifierId() {
		return identifierId;
	}
	public void setIdentifierId(Long identifierId) {
		this.identifierId = identifierId;
	}
	public String getIdentifierName() {
		return identifierName;
	}
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
