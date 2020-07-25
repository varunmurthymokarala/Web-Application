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
@Table(name = "education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Education_Id")
	private Long educationId;
	
	@Column(name = "Specilization")
	private String specilization;
	
	@Column(name = "Marks")
	private int marks;
	
	@Column(name = "Year_of_Passing")
	private int yearofPassing;
	
	@Column(name = "Start_Year")
	private int startYear;
	
	@Column(name = "Qualification_Id")
	private Long qualificationId;
	
	@Column(name = "User_Id")
	private Long user_Id;
	
	@JoinColumn(name = "User_Id", insertable = false, updatable = false)
    @ManyToOne
    private User user;

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

	public Long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
