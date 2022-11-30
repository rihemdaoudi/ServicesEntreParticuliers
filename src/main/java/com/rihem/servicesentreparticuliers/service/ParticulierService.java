package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import com.rihem.servicesentreparticuliers.entities.Particulier;

public interface ParticulierService {
	    Particulier saveParticulier(Particulier particulier);
	    Particulier updateParticulier(Particulier particulier);
	    List<Particulier> getAllParticulier();
	    Particulier getParticulier(Long particulierId);
	    void deleteParticulier(Long particulierId);

}
