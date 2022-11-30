package com.rihem.servicesentreparticuliers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rihem.servicesentreparticuliers.entities.Bricoleur;
import com.rihem.servicesentreparticuliers.repos.BricoleurRepository;


public class BricoleurService {
	@Autowired
	private BricoleurRepository bricoleurRepository;
	
		public List<Bricoleur> getBricoleurs()
		{
			return (List<Bricoleur>) bricoleurRepository.findAll();
		}
	
		public Optional<Bricoleur> getBricoleurById(long id)
		{
			return bricoleurRepository.findById(id);
			
		}
		public Bricoleur save(Bricoleur bricoleur)
		{
			return bricoleurRepository.saveAndFlush(bricoleur);
		}
		public boolean existsById(Long id)
		{
			return bricoleurRepository.existsById(id);
		}
		public void deleteBricoleur(Long id)
		{
			bricoleurRepository.deleteById(id);
		}

}
