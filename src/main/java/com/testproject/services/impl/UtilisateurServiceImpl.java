package com.testproject.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.dao.UtilisateurSearchRepository;
import com.testproject.entities.Utilisateur;
import com.testproject.services.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired 
	UtilisateurSearchRepository utilisateurSearchRepository;
	
	@Override
	public Utilisateur saveOrUpdate(Utilisateur user) {
		return utilisateurSearchRepository.save(user);
	}

}
