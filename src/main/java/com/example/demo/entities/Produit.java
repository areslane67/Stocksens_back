package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Long id_Produit;
	private String Nom;
	private String Descriptions;
	private String prix;
	private String Stock;
	private String Taille;
	private String Couleur;
	private String Categorie;
	private String Seuil_minimum;
	private String Date_ajout;
	
	@JsonIgnore
	@OneToMany(mappedBy = "produit")
	private List<LigneCommande>ligneCommande;
	
	@JsonIgnore
	@OneToMany(mappedBy = "produit")
	private List<Photo>photo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "produit")
	private List<PredictionStock>predictionStock;
	
}
