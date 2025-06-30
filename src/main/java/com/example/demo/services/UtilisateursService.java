package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Utilisateurs;

public interface UtilisateursService {

	Utilisateurs createUtilisateurs(Utilisateurs utilisateurs);
	
	Utilisateurs updateUtilisateurs(Utilisateurs utilisateurs);
	
	Utilisateurs getUtilisateursById(Long id);
	
	List<Utilisateurs>getAllUtilisateurs();
	
	void deleteUtilisateurs(Long id);
}
