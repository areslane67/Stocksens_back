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

public class PredictionStock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_prediction;
	private String date_prevu;
	private String stock_prévu;
	
	@ManyToOne
	private Produit produit;
}
