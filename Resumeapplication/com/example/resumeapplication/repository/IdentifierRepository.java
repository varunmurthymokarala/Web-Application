package com.example.resumeapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.resumeapplication.entity.Identifier;

@Repository
public interface IdentifierRepository extends CrudRepository<Identifier, Long>{

}
