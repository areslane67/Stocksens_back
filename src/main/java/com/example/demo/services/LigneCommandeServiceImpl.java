package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.LigneCommande;
import com.example.demo.repositories.LigneCommandeRepository;

@Service
public class LigneCommandeServiceImpl implements LigneCommandeService {

@Autowired 	
private LigneCommandeRepository ligneCommandeRepository;

@Override
public LigneCommande createLigneCommande(LigneCommande ligneCommande) {
    return ligneCommandeRepository.save(ligneCommande);
}

@Override
public LigneCommande updateLigneCommande(LigneCommande ligneCommande) {
	return ligneCommandeRepository.save(ligneCommande);
}
@Override
public LigneCommande getLigneCommandeById(Long id) {
    return ligneCommandeRepository.findById(id).orElse(null);

}
@Override
public List<LigneCommande> getAllLigneCommande(){
	return ligneCommandeRepository.findAll();
}
@Override
public void deleteLigneCommande(Long id) {
	ligneCommandeRepository.deleteById(id);
}
}
