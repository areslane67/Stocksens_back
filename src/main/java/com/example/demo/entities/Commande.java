package com.example.demo.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Commande {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idCommande ;
private LocalDateTime Date_De_Commande= LocalDateTime.now();
private LocalDateTime Heure_de_commande= LocalDateTime.now();
private Boolean Statut;

@ManyToOne
private Utilisateurs utilisateurs;

@JsonIgnore
@OneToMany(mappedBy = "commande")
private List<LigneCommande>ligneCommande;
}
