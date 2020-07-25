package com.example.resumeapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users_ext")

public class UserExt {
	
	@Id
	@Column(name = "User_Id")
	private Long userId;
	
	@Column(name = "MobileNumber")
	private String mobileNumber;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "PinCode")
	private String pinCode;
	
	@Column(name = "Hobbies")
	private String hobbies;
	
}
