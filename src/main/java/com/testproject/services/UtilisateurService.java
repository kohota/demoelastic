package com.testproject.services;

import com.testproject.entities.Utilisateur;

public interface UtilisateurService {

	Utilisateur saveOrUpdate(final Utilisateur user);
}
