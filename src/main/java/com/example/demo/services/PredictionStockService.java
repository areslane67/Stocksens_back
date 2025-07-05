package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.PredictionStock;


public interface PredictionStockService {

	PredictionStock createPredictionStock(PredictionStock predictionStock);
	
	PredictionStock updatePredictionStock(PredictionStock predictionStock);
	
	PredictionStock getPredictionStockById(Long id);
	
	List<PredictionStock>getAllPredictionStock();
	
	void deletePredictionStock(Long id);
}
