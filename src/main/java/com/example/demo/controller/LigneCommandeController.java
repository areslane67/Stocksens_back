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

import com.example.demo.entities.LigneCommande;
import com.example.demo.services.LigneCommandeService;



@RestController
@CrossOrigin
@RequestMapping("/api/LigneCommande")
 
public class LigneCommandeController {
	
@Autowired

private LigneCommandeService ligneCommandeService;

@PostMapping("/add")

public ResponseEntity<LigneCommande> CreateLigneCommande(@RequestBody LigneCommande ligneCommande) {
	LigneCommande createdLigneCommande = ligneCommandeService.createLigneCommande(ligneCommande);
    return ResponseEntity.ok(createdLigneCommande);

}
@PutMapping("/{id}")

public LigneCommande updateLigneCommande(@PathVariable Long id , @RequestBody LigneCommande ligneCommande){
	return ligneCommandeService.updateLigneCommande(ligneCommande);
}
@GetMapping("/{id}")

public LigneCommande getLigneCommandeById(@PathVariable Long id) {
	return ligneCommandeService.getLigneCommandeById(id);
}
@GetMapping("/all")

public List<LigneCommande> getAllLigneCommande(){
	return ligneCommandeService.getAllLigneCommande();
}
@DeleteMapping("/{id}")

public void deleteLigneCommande(@PathVariable Long id) {
	ligneCommandeService.deleteLigneCommande(id);
}
}
