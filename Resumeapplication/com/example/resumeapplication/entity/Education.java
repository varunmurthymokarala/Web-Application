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


}
