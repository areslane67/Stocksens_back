package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Commande;

public interface CommandeService {

	Commande createCommande(Commande commande);
	
	Commande updateCommande(Commande commande);
	
	Commande getCommandeById(Long id);
	
	List<Commande>getAllCommande();
	
	void deleteCommande(Long id);
	
}
