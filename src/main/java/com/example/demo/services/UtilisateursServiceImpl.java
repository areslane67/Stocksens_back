package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Utilisateurs;
import com.example.demo.repositories.UtilisateursRepository;

import jakarta.transaction.Transactional;

@Service
public class UtilisateursServiceImpl implements UtilisateursService {

@Autowired 	
private UtilisateursRepository utilisateursRepository;

@Override
public Utilisateurs createUtilisateurs(Utilisateurs utilisateurs) {
    return utilisateursRepository.save(utilisateurs);
}

@Override
public Utilisateurs updateUtilisateurs(Utilisateurs utilisateurs) {
	return utilisateursRepository.save(utilisateurs);
}
@Override
public Utilisateurs getUtilisateursById(Long id) {
    return utilisateursRepository.findById(id).orElse(null);

}
@Override
public List<Utilisateurs> getAllUtilisateurs(){
	return utilisateursRepository.findAll();
}
@Override
public void deleteUtilisateurs(Long id) {
	utilisateursRepository.deleteById(id);
}
}