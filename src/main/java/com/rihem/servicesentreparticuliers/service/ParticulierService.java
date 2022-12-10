package com.rihem.servicesentreparticuliers.service;

import java.util.List;
import java.util.Optional;

import com.rihem.servicesentreparticuliers.entities.Particulier;

public interface ParticulierService {
	   Particulier AjouterParticulier(Particulier p);
	   void DeleteParticulier(Particulier p);
	Optional<Particulier> getParticulierById(Long id);
	   void DeleteParticulier(Long id);
	   List<Particulier> getAllParticulier();

    Particulier findByEmailAndPassword(String email, String password);

	Particulier updateParticulier(Particulier particulier);
}
