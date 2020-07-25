package com.example.resumeapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.resumeapplication.model.EducationBean;
import com.example.resumeapplication.model.IdentifierBean;
import com.example.resumeapplication.model.ProjectBean;
import com.example.resumeapplication.model.UserBean;
import com.example.resumeapplication.service.EducationService;
import com.example.resumeapplication.service.IdentifierService;
import com.example.resumeapplication.service.ProjectService;
import com.example.resumeapplication.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjectController {

	@Autowired
	private UserService userService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private IdentifierService identifierService;

	@Autowired
	private EducationService educationService;

	@PostMapping("/user")
	public @ResponseBody UserBean saveUser(@RequestBody UserBean userBean) {

		UserBean result = userService.saveUser(userBean);

		return result;

	}

	@GetMapping("/userList")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<UserBean> getUserList(UserBean userBean) {

		List<UserBean> list = userService.getUserList();

		return list;
	}

	@GetMapping("/getUser/{userId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public UserBean getUser(@PathVariable Long userId) {

		UserBean data = userService.getUser(userId);

		return data;
	}

	@PostMapping("/identifier")
	public IdentifierBean saveIdentifier(@RequestBody IdentifierBean identifierBean) {

		IdentifierBean data = identifierService.saveIdentifier(identifierBean);

		return data;
	}


	@PostMapping("/project")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody ProjectBean saveProject(@RequestBody ProjectBean projectBean) {

		ProjectBean data = projectService.saveProject(projectBean);

		return data;
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getProjectList") 
	public List<ProjectBean> getProjectList() {
	  
	  List<ProjectBean> list = projectService.getProjectList();
	 
	  return list;
	  
	  }
	

	@GetMapping("/getProjectById/{projectId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ProjectBean getProjectById(@PathVariable Long projectId) {

		ProjectBean data = projectService.getProjectById(projectId);

		return data;

	}

	@PutMapping("/update")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody ProjectBean updateProject(@RequestBody ProjectBean projectBean) {

		return projectService.updateProject(projectBean);

	}

	/*
	 * @DeleteMapping("/delete/{projectId}")
	 * 
	 * @CrossOrigin(origins = "*", allowedHeaders = "*") public ProjectBean
	 * deleteProject(@PathVariable Long projectId) {
	 * 
	 * projectService.deleteProject(projectId);
	 * 
	 * ProjectBean projectBean = new ProjectBean(); return projectBean;
	 * 
	 * }
	 */

	@PostMapping("/userLogin")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody UserBean userLogin(@RequestBody UserBean userBean) {

		UserBean data = userService.userLogin(userBean);

		return data;
	}

	@PutMapping("/userupdate")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody UserBean updateUser(@RequestBody UserBean userBean) {

		return userService.updateUser(userBean);

	}
	
	@PostMapping("/education")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody EducationBean saveEducation(@RequestBody EducationBean educationBean) {

		EducationBean data = educationService.saveEducation(educationBean);

		return data;
	}
	
	@GetMapping("/educationList")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<EducationBean> getEducationList() {
		
		List<EducationBean> data = educationService.getEducationList();
		
		return data;
	}
	
	@GetMapping("/educationById/{educationId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public EducationBean getEducationById(@PathVariable Long educationId) {
		
		EducationBean data = educationService.getEducationById(educationId);
		
		return data;
	}
	
	@PutMapping("/education")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public @ResponseBody EducationBean updateEducation(@RequestBody EducationBean educationBean) {
		
		EducationBean data = educationService.updateEducation(educationBean);
		
		return data;
		
	}
	
	@DeleteMapping("/delete/{educationId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public EducationBean deleteEducation(@PathVariable Long educationId) {
		
		 educationService.deleteEducation(educationId);
	
		 EducationBean educationBean = new EducationBean();
		 
		 return educationBean;
	}
	

}
