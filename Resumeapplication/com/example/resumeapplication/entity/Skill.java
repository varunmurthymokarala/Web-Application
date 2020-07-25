package com.example.resumeapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "skills")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Skill_Id")
	private Long skillId;
	
	@Column(name = "Skill")
	private String skill;
	
	@Column(name = "Expertise")
	private String expertise;
	
	@Column(name = "Years_of_Experience")
	private Long years_of_Experience;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "User_Id")
	private Long userId;

}
