package com.testproject.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.entities.Utilisateur;
import com.testproject.services.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurRessource {

	@Autowired
	UtilisateurService utilisateurService;
	
	@PostMapping("/")
	public Utilisateur saveOrUpdate(@RequestBody Utilisateur user) {
		
		return utilisateurService.saveOrUpdate(user);
	}
}
