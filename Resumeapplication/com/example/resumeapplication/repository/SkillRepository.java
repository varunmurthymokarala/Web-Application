package com.example.resumeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.resumeapplication.entity.Skill;

public interface SkillRepository extends  CrudRepository<Skill,Long> {

}
