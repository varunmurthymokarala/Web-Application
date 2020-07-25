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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
