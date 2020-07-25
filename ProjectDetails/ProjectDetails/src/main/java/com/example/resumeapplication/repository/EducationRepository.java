package com.example.resumeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.resumeapplication.entity.Education;

public interface EducationRepository extends CrudRepository<Education, Long> {

}
