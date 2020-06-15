package com.cerna.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cerna.model.Persona;
import com.cerna.repo.IGenericRepo;
import com.cerna.repo.IPersonaRepo;
import com.cerna.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	protected IGenericRepo<Persona, Integer> getRepo(){
		return repo;
	}
	
}
