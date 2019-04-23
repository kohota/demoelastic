package com.testproject.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.testproject.entities.Utilisateur;

public interface UtilisateurSearchRepository extends ElasticsearchRepository<Utilisateur, Long>{

}
