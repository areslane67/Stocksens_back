package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Produit;


public interface ProduitService {

	Produit createProduit(Produit produit);
	
	Produit updateProduit(Produit produit);
	
	Produit getProduitById(Long id);
	
	List<Produit>getAllProduit();
	
	void deleteProduit(Long id);
}
