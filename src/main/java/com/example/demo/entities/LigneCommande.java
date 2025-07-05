package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class LigneCommande {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id_LigneCommande;
private Long Quantité;

@ManyToOne
private Commande commande;

@ManyToOne
private Produit produit;

}

