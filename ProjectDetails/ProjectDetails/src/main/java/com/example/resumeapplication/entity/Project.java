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

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Integer getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(Integer projectDuration) {
		this.projectDuration = projectDuration;
	}

	public String getProjectRoles() {
		return projectRoles;
	}

	public void setProjectRoles(String projectRoles) {
		this.projectRoles = projectRoles;
	}

	public String getProjectResponsibilities() {
		return projectResponsibilities;
	}

	public void setProjectResponsibilities(String projectResponsibilities) {
		this.projectResponsibilities = projectResponsibilities;
	}

	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}

	public String getProjectFeatures() {
		return projectFeatures;
	}

	public void setProjectFeatures(String projectFeatures) {
		this.projectFeatures = projectFeatures;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getProjectRoleId() {
		return projectRoleId;
	}

	public void setProjectRoleId(Long projectRoleId) {
		this.projectRoleId = projectRoleId;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}


	
	
}
