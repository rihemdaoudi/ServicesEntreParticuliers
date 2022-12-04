package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihem.servicesentreparticuliers.entities.Bricoleur;
import com.rihem.servicesentreparticuliers.repos.BricoleurRepository;

@Service
public class BricoleurServiceImpl implements BricoleurService {

	@Autowired
	BricoleurRepository bricoleurRepository;
	
	@Override
	public Bricoleur AjouterBricoleur(Bricoleur b) {
		bricoleurRepository.save(b);
		return b;
	}

	@Override
	public void DeleteBricoleur(Bricoleur b) {
		bricoleurRepository.delete(b);
		
	}

	@Override
	public void DeleteBricoleur(Long id) {
		bricoleurRepository.deleteById(id);
		
	}

	@Override
	public List<Bricoleur> getAllBricoleur() {
		return (List<Bricoleur>) bricoleurRepository.findAll();
	}

}
