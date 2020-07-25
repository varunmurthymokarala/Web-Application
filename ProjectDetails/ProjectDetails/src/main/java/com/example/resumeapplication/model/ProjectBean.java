package com.example.resumeapplication.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectBean {
	
	private Long projectId;
	private Long userId;
	private Long projectRoleId;
	private String projectTitle;
	private String projectDescription;
	private int projectDuration;
	private String projectRoles;
	private String projectResponsibilities;
	private String technologyUsed;
	private String projectFeatures;
	private String projectLocation;
	private String projectType;
	private String clientName;
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProjectRoleId() {
		return projectRoleId;
	}
	public void setProjectRoleId(Long projectRoleId) {
		this.projectRoleId = projectRoleId;
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
	public int getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(int projectDuration) {
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
	
	 
}
