package com.example.resumeapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "identifier")
public class Identifier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Identifier_Id")
	private Long identifierId;
	
	@Column(name = "Identifier_Name")
	private String identifierName;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Status")
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
