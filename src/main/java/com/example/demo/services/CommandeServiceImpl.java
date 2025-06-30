package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Commande;
import com.example.demo.repositories.CommandeRepository;


@Service
public class CommandeServiceImpl implements CommandeService {

@Autowired 	
private CommandeRepository commandeRepository;

@Override
public Commande createCommande(Commande commande) {
    return commandeRepository.save(commande);
}

@Override
public Commande updateCommande(Commande commande) {
	return commandeRepository.save(commande);
}
@Override
public Commande getCommandeById(Long id) {
    return commandeRepository.findById(id).orElse(null);

}
@Override
public List<Commande> getAllCommande(){
	return commandeRepository.findAll();
}
@Override
public void deleteCommande(Long id) {
	commandeRepository.deleteById(id);
}
}
