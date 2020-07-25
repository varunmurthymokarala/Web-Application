package com.example.resumeapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumeapplication.entity.Project;
import com.example.resumeapplication.entity.User;
import com.example.resumeapplication.model.ProjectBean;
import com.example.resumeapplication.model.UserBean;
import com.example.resumeapplication.repository.ProjectRepository;
import com.example.resumeapplication.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public UserBean saveUser(UserBean userBean) {
		
		User user = new User();
		
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setEmailId(userBean.getEmailId());
		user.setPassword(userBean.getPassword());
		user.setStatus(userBean.getStatus());
		userRepository.save(user);
		
		userBean.setUserId(user.getUserId());
	
		return userBean;
	}

	public List<UserBean> getUserList() {
		
		List<UserBean> list=new ArrayList<>();
		
		Iterable<User> usersList=userRepository.findAll();
		
		  for(User userObj:usersList) {
			  
			  UserBean userBean=new UserBean();
			  userBean.setUserId(userObj.getUserId());
			  userBean.setFirstName(userObj.getFirstName());
			  userBean.setLastName(userObj.getLastName());
			  userBean.setEmailId(userObj.getEmailId());
			  userBean.setPassword(userObj.getPassword());
			  userBean.setStatus(userObj.getStatus());
			  
			  list.add(userBean);
	}
		  
		  return list;
		  
	}

	public UserBean getUser(Long userId) {
		
			User userObj = userRepository.findById(userId).orElse(null);
			UserBean userBean=new UserBean();
			
			if(userObj!= null) {
			userBean.setUserId(userObj.getUserId());
			userBean.setFirstName(userObj.getFirstName());
			userBean.setLastName(userObj.getLastName());
			userBean.setEmailId(userObj.getEmailId());
			userBean.setPassword(userObj.getPassword());
			userBean.setStatus(userObj.getStatus());
			
			}
			
		return userBean;
	}

	public UserBean userLogin(UserBean ub) {
		
		User userObj = userRepository.findByEmailIdAndPassword(ub.getEmailId(), ub.getPassword());
			  
		  UserBean userBean=new UserBean();
		  
		  if(userObj!=null) {
		  
		  userBean.setUserId(userObj.getUserId());
		  userBean.setFirstName(userObj.getFirstName());
		  userBean.setLastName(userObj.getLastName());
		  userBean.setEmailId(userObj.getEmailId());
		  userBean.setPassword(userObj.getPassword());
		  userBean.setStatus(userObj.getStatus());

		}
		  return userBean;
		  
	}

	public UserBean updateUser(UserBean userBean) {
		
		User userObj = userRepository.findById(userBean.getUserId()).orElse(new User());
		
		userObj.setFirstName(userBean.getFirstName());
		userObj.setLastName(userBean.getLastName());
		userObj.setEmailId(userBean.getEmailId());
		userObj.setPassword(userBean.getPassword());
		userObj.setStatus(userBean.getStatus());
		userRepository.save(userObj);
		
		userBean.setUserId(userObj.getUserId());
	
		return userBean;
	}
	
}

