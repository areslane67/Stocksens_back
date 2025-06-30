package com.example.demo.entities;

import java.time.LocalDateTime;

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

public class Commande {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idCommande ;
private LocalDateTime Date_De_Commande= LocalDateTime.now();
private LocalDateTime heure_de_commande= LocalDateTime.now();
private Boolean statut;
}
