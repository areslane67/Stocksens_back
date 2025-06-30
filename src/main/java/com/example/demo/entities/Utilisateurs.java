package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateurs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Long id;
	private String img;
	private String Nom;
	private String Prenom;
	private String mail;
	private String adresse;
	private String mdp;
	private String ville;
	private String pays;
	private String tel;



	

}
