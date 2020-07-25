package com.example.resumeapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.resumeapplication.entity.Project;

@Repository
public interface ProjectRepository extends  CrudRepository<Project,Long>{

}
