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

import com.example.demo.entities.Utilisateurs;
import com.example.demo.services.UtilisateursService;

@RestController
@CrossOrigin
@RequestMapping("/api/Utilisateurs")
 
public class UtilisateursController {
	
@Autowired

private UtilisateursService utilisateursService;

@PostMapping("/add")

public ResponseEntity<Utilisateurs> CreateUtilisateurs(@RequestBody Utilisateurs utilisateurs) {
    Utilisateurs createdUser = utilisateursService.createUtilisateurs(utilisateurs);
    return ResponseEntity.ok(createdUser);

}
@PutMapping("/{id}")

public Utilisateurs updateUtilisateurs(@PathVariable Long id , @RequestBody Utilisateurs utilisateurs){
	return utilisateursService.updateUtilisateurs(utilisateurs);
}
@GetMapping("/{id}")

public Utilisateurs getUtilisateursById(@PathVariable Long id) {
	return utilisateursService.getUtilisateursById(id);
}
@GetMapping("/all")

public List<Utilisateurs> getAllUtilisateurs(){
	return utilisateursService.getAllUtilisateurs();
}
@DeleteMapping("/{id}")

public void deleteUtilisateurs(@PathVariable Long id) {
	utilisateursService.deleteUtilisateurs(id);
}
}
