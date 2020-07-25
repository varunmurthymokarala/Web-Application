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
	 
}
