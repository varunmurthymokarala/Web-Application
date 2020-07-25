package com.example.resumeapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "project_details")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Project_Id")
	private Long projectId;
	
	@Column(name = "Project_Title")
	private String projectTitle;
	
	@Column(name = "Project_Description")
	private String projectDescription;
	
	@Column(name = "Project_Duration")
	private Integer projectDuration;
	
	@Column(name = "Project_Roles")
	private String projectRoles;
	
	@Column(name = "Project_Responsibilities")
	private String projectResponsibilities;
	
	@Column(name = "Technology_Used")
	private String technologyUsed;
	
	@Column(name = "Project_Features")
	private String projectFeatures;
	
	@Column(name = "Project_Location")
	private String projectLocation;
	
	@Column(name = "Project_Type")
	private String projectType;
	
	@Column(name = "Client_Name")
	private String clientName;
	
	@Column(name = "User_Id")
	  private Long userId;

	    @JoinColumn(name = "User_Id", insertable = false, updatable = false)
	    @ManyToOne
	    private User user;
	
	@Column(name = "Project_Role_Id")
	private Long projectRoleId;
	
	  @JoinColumn(name = "Identifier_Id", insertable = false, updatable = false)
	    @ManyToOne
	    private Identifier identifier;


	
	
}
