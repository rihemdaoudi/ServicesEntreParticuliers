package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import com.rihem.servicesentreparticuliers.entities.Particulier;

public interface ParticulierService {
	   Particulier AjouterParticulier(Particulier p);
	   void DeleteParticulier(Particulier p);
	   void DeleteParticulier(Long id);
	   List<Particulier> getAllParticulier();

}
