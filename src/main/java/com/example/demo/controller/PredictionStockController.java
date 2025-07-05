package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PredictionStock;
import com.example.demo.services.PredictionStockService;

@RestController
@CrossOrigin
@RequestMapping("/api/PredictionStock")

public class PredictionStockController {

	@Autowired

	private PredictionStockService predictionStockService;

	@PostMapping("/add")

	public ResponseEntity<PredictionStock> CreatePredictionStock(@RequestBody PredictionStock predictionStock) {
		PredictionStock createdPredictionStock = predictionStockService.createPredictionStock(predictionStock);
	    return ResponseEntity.ok(createdPredictionStock);

	}
	@PutMapping("/{id}")

	public PredictionStock updatePredictionStock(@PathVariable Long id , @RequestBody PredictionStock predictionStock){
		return predictionStockService.updatePredictionStock(predictionStock);
	}
	@GetMapping("/{id}")

	public PredictionStock getPredictionStockById(@PathVariable Long id) {
		return predictionStockService.getPredictionStockById(id);
	}
	@GetMapping("/all")

	public List<PredictionStock> getAllPredictionStock(){
		return predictionStockService.getAllPredictionStock();
	}
	@DeleteMapping("/{id}")

	public void deletePredictionStock(@PathVariable Long id) {
		predictionStockService.deletePredictionStock(id);
	}
	
}