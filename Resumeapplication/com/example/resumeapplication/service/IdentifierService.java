package com.example.resumeapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumeapplication.entity.Identifier;
import com.example.resumeapplication.model.IdentifierBean;
import com.example.resumeapplication.repository.IdentifierRepository;

@Service
public class IdentifierService {
	
	@Autowired
	IdentifierRepository identifierRepository;
	
	public IdentifierBean saveIdentifier(IdentifierBean identifierBean) {
		
		Identifier identifier = new Identifier();
		
		identifier.setIdentifierName(identifierBean.getIdentifierName());
		identifier.setType(identifierBean.getType());
		identifier.setStatus(identifierBean.getStatus());
		
		identifierRepository.save(identifier);
		
		return identifierBean;
	}

}
