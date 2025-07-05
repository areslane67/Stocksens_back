package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PredictionStock;


public interface PredictionStockRepository extends JpaRepository<PredictionStock, Long> {
	
}
