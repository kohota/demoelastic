package com.testproject.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users", type = "employee")
public class Utilisateur {

	@Id
	private Long id;
	private String nom;
	private String prenom;
	private Long solde;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getSolde() {
		return solde;
	}
	public void setSolde(Long solde) {
		this.solde = solde;
	}
	
	public Utilisateur() {
	
	}
	
	
}
