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

import com.example.demo.entities.Produit;
import com.example.demo.services.ProduitService;

@RestController
@CrossOrigin
@RequestMapping("/api/Produit")
 
public class ProduitController {
	
@Autowired

private ProduitService produitService;

@PostMapping("/add")

public ResponseEntity<Produit> CreateProduit(@RequestBody Produit produit) {
	Produit createdProduit = produitService.createProduit(produit);
    return ResponseEntity.ok(createdProduit);

}
@PutMapping("/{id}")

public Produit updateProduit(@PathVariable Long id , @RequestBody Produit produit){
	return produitService.updateProduit(produit);
}
@GetMapping("/{id}")

public Produit getProduitById(@PathVariable Long id) {
	return produitService.getProduitById(id);
}
@GetMapping("/all")

public List<Produit> getAllProduit(){
	return produitService.getAllProduit();
}
@DeleteMapping("/{id}")

public void deleteProduit(@PathVariable Long id) {
	produitService.deleteProduit(id);
}
}
