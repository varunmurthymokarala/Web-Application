package com.example.resumeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.resumeapplication.entity.User;

public interface UserRepository extends  CrudRepository<User,Long> {
	
	User findByEmailIdAndPassword(String emailId, String password);

}
