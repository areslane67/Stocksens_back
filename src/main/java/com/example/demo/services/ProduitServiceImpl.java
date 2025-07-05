package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.repositories.ProduitRepository;



@Service

public class ProduitServiceImpl implements ProduitService {

@Autowired 	
private ProduitRepository produitRepository;

@Override
public Produit createProduit(Produit produit) {
    return produitRepository.save(produit);
}

@Override
public Produit updateProduit(Produit produit) {
	return produitRepository.save(produit);
}
@Override
public Produit getProduitById(Long id) {
    return produitRepository.findById(id).orElse(null);

}
@Override
public List<Produit> getAllProduit(){
	return produitRepository.findAll();
}
@Override
public void deleteProduit(Long id) {
	produitRepository.deleteById(id);
}
}