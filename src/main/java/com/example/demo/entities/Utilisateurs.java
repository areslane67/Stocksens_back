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

public class Utilisateurs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Long id;
	private String img;
	private String Nom;
	private String Prenom;
	private String Mail;
	private String Adresse;
	private String Mdp;
	private String Ville;
	private String Pays;
	private String Tel;


@JsonIgnore
@OneToMany(mappedBy = "utilisateurs")
private List<Commande>commande;


}
