package com.example.resumeapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumeapplication.entity.Project;
import com.example.resumeapplication.model.ProjectBean;
import com.example.resumeapplication.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
public ProjectBean saveProject(ProjectBean projectBean) {
		
		Project project = new Project();
		
		project.setProjectTitle(projectBean.getProjectTitle());
		project.setProjectDescription(projectBean.getProjectDescription());
		project.setProjectDuration(projectBean.getProjectDuration());
		project.setProjectRoles(projectBean.getProjectRoles());
		project.setProjectResponsibilities(projectBean.getProjectResponsibilities());
		project.setTechnologyUsed(projectBean.getTechnologyUsed());
		project.setProjectFeatures(projectBean.getProjectFeatures());
		project.setProjectLocation(projectBean.getProjectLocation());
		project.setUserId(projectBean.getUserId());
		project.setProjectRoleId(projectBean.getProjectRoleId());
		
		projectRepository.save(project);
		
		projectBean.setProjectId(project.getProjectId());
		
		return projectBean;
	}

	public List<ProjectBean> getProjectList() {
	
	List<ProjectBean> list=new ArrayList<>();
	
	Iterable<Project> projectList= projectRepository.findAll();
	
	  for(Project projectObj:projectList) {
		  
		  ProjectBean projectBean = new ProjectBean();		  
		  	
		  	projectBean.setProjectId(projectObj.getProjectId());
			projectBean.setProjectTitle(projectObj.getProjectTitle());
			projectBean.setProjectDescription(projectObj.getProjectDescription());
			projectBean.setProjectDuration(projectObj.getProjectDuration());
			projectBean.setProjectRoles(projectObj.getProjectRoles());
			projectBean.setProjectResponsibilities(projectObj.getProjectResponsibilities());
			projectBean.setTechnologyUsed(projectObj.getTechnologyUsed());
			projectBean.setProjectFeatures(projectObj.getProjectFeatures());
			projectBean.setProjectLocation(projectObj.getProjectLocation());
			projectBean.setUserId(projectObj.getUserId());
			projectBean.setProjectRoleId(projectObj.getProjectRoleId());
		  
		  list.add(projectBean);
}
	  
	  return list;

}
	

	public ProjectBean getProjectById(Long projectId) {
		
		ProjectBean projectBean = new ProjectBean();
		
		Project projectbyId = projectRepository.findById(projectId).orElse(null);
		
		if(projectbyId!=null) {
				
				projectBean.setProjectId(projectbyId.getProjectId());
			    projectBean.setProjectTitle(projectbyId.getProjectTitle());
			    projectBean.setProjectDescription(projectbyId.getProjectDescription());
				projectBean.setProjectDuration(projectbyId.getProjectDuration());
				projectBean.setProjectRoles(projectbyId.getProjectRoles());
				projectBean.setProjectResponsibilities(projectbyId.getProjectResponsibilities());
				projectBean.setTechnologyUsed(projectbyId.getTechnologyUsed());
				projectBean.setProjectFeatures(projectbyId.getProjectFeatures());
				projectBean.setProjectLocation(projectbyId.getProjectLocation());
				projectBean.setUserId(projectbyId.getUserId());
				projectBean.setProjectRoleId(projectbyId.getProjectRoleId());
		}
		
		return projectBean;
	}
	

	public ProjectBean updateProject(ProjectBean projectBean) {
	
		Project project = projectRepository.findById(projectBean.getProjectId()).orElse(null);
		

		if(projectBean.getUserId()!=null) {
			project.setUserId(projectBean.getUserId());
		}
		
		project.setProjectTitle(projectBean.getProjectTitle());
		project.setProjectDescription(projectBean.getProjectDescription());
		project.setProjectDuration(projectBean.getProjectDuration());
		project.setProjectRoles(projectBean.getProjectRoles());
		project.setProjectResponsibilities(projectBean.getProjectResponsibilities());
		project.setTechnologyUsed(projectBean.getTechnologyUsed());
		project.setProjectFeatures(projectBean.getProjectFeatures());
		project.setProjectLocation(projectBean.getProjectLocation());
		project.setUserId(projectBean.getUserId());
		project.setProjectRoleId(projectBean.getProjectRoleId());
		
		projectRepository.save(project);
		
		return projectBean;
	}

	public void deleteProject(Long projectId) {
		
		projectRepository.deleteById(projectId);
	}
	
	

}
