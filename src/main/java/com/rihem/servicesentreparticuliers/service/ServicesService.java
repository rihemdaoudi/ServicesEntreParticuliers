package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import com.rihem.servicesentreparticuliers.entities.Categorie;
import com.rihem.servicesentreparticuliers.entities.Services;

public interface ServicesService {
	Services saveService(Services s);
	Services updateService(Services s);
	void deleteService(Services s);
	void deleteServiceById(Long id);
	Services getService(Long id);
	List<Services> getAllServices();
	List<Services> findByNomService(String nomService);
	List<Services> findByNomServiceContains(String nomService);
	List<Services> findByNomPrix(String nomService, Double prixService);
	List<Services> findByCategorie(Categorie categorie);
	List<Services> findByCategorieIdCat(Long id);
	List<Services> findByOrderByNomServiceAsc();
	List<Services> TrierServicesNomsPrix();

}
