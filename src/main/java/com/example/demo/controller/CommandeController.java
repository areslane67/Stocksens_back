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

import com.example.demo.entities.Commande;
import com.example.demo.services.CommandeService;


@RestController
@CrossOrigin
@RequestMapping("/api/Commande")

public class CommandeController {

	@Autowired

	private CommandeService commandeService;

	@PostMapping("/add")

	public ResponseEntity<Commande> CreateCommande(@RequestBody Commande commande) {
		Commande createdCommande = commandeService.createCommande(commande);
	    return ResponseEntity.ok(createdCommande);

	}
	@PutMapping("/{id}")

	public Commande updateCommande(@PathVariable Long id , @RequestBody Commande commande){
		return commandeService.updateCommande(commande);
	}
	@GetMapping("/{id}")

	public Commande getCommandeById(@PathVariable Long id) {
		return commandeService.getCommandeById(id);
	}
	@GetMapping("/all")

	public List<Commande> getAllCommande(){
		return commandeService.getAllCommande();
	}
	@DeleteMapping("/{id}")

	public void deleteCommande(@PathVariable Long id) {
		commandeService.deleteCommande(id);
	}
	
}
