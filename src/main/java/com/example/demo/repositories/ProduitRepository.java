package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}
