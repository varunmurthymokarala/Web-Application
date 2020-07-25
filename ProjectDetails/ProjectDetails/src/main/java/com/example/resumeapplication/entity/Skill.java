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

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Long getYears_of_Experience() {
		return years_of_Experience;
	}

	public void setYears_of_Experience(Long years_of_Experience) {
		this.years_of_Experience = years_of_Experience;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
