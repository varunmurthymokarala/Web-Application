package com.example.resumeapplication.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EducationBean {
	
	private Long educationId;
	private String specilization;
	private int marks;
	private int yearofPassing;
	private int startYear;
	private Long qualificationId;
	private Long userId;
	public Long getEducationId() {
		return educationId;
	}
	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getYearofPassing() {
		return yearofPassing;
	}
	public void setYearofPassing(int yearofPassing) {
		this.yearofPassing = yearofPassing;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public Long getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
