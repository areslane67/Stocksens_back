package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PredictionStock;
import com.example.demo.repositories.PredictionStockRepository;

@Service
public class PredictionStockServiceImpl implements PredictionStockService {

@Autowired 	
private PredictionStockRepository predictionStockRepository;

@Override
public PredictionStock createPredictionStock(PredictionStock predictionStock) {
    return predictionStockRepository.save(predictionStock);
}

@Override
public PredictionStock updatePredictionStock(PredictionStock predictionStock) {
	return predictionStockRepository.save(predictionStock);
}
@Override
public PredictionStock getPredictionStockById(Long id) {
    return predictionStockRepository.findById(id).orElse(null);

}
@Override
public List<PredictionStock> getAllPredictionStock(){
	return predictionStockRepository.findAll();
}
@Override
public void deletePredictionStock(Long id) {
	predictionStockRepository.deleteById(id);
}
}
