package com.rihem.servicesentreparticuliers.service;

import java.util.List;



import com.rihem.servicesentreparticuliers.entities.Bricoleur;



public interface BricoleurService {
	
  Bricoleur AjouterBricoleur(Bricoleur b);
  void DeleteBricoleur(Bricoleur b);
  void DeleteBricoleur(Long id);
  List<Bricoleur> getAllBricoleur();
}
