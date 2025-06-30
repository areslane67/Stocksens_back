package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.LigneCommande;


public interface LigneCommandeService {

	LigneCommande createLigneCommande(LigneCommande lgneCommande);
	
	LigneCommande updateLigneCommande(LigneCommande lgneCommande);
	
	LigneCommande getLigneCommandeById(Long id);
	
	List<LigneCommande>getAllLigneCommande();
	
	void deleteLigneCommande(Long id);
	
}
