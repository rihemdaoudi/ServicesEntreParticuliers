package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihem.servicesentreparticuliers.entities.Categorie;
import com.rihem.servicesentreparticuliers.entities.Services;
import com.rihem.servicesentreparticuliers.repos.ServiceRepository;

@Service
public class ServicesServiceImpl implements ServicesService {
	
	@Autowired
	ServiceRepository serviceRepository;

	
	@Override
	public Services saveService(Services s) {
		return serviceRepository.save(s);
	}

	@Override
	public Services updateService(Services s) {
		return serviceRepository.save(s);
	}

	@Override
	public void deleteService(Services s) {
		serviceRepository.delete(s);
		
	}
	
	@Override
	public void deleteServiceById(Long id) {
		serviceRepository.deleteById(id);	
	}

	@Override
	public Services getService(Long id) {
		return serviceRepository.findById(id).get();
	}

	@Override
	public List<Services> getAllServices() {
		return serviceRepository.findAll();
	}

	@Override
	public List<Services> findByNomService(String nomService) {
		
		return serviceRepository.findByNomService(nomService);
	}

	@Override
	public List<Services> findByNomServiceContains(String nomService) {
		
		return serviceRepository.findByNomServiceContains(nomService);
	}

	@Override
	public List<Services> findByNomPrix(String nomService, Double prixService) {
		
		return serviceRepository.findByNomPrix(nomService, prixService);
	}

	@Override
	public List<Services> findByCategorie(Categorie categorie) {
		
		return serviceRepository.findByCategorie(categorie) ;
	}

	@Override
	public List<Services> findByCategorieIdCat(Long id) {
		
		return serviceRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Services> findByOrderByNomServiceAsc() {
		
		return serviceRepository.findByOrderByNomServiceAsc();
	}

	@Override
	public List<Services> TrierServicesNomsPrix() {
		
		return serviceRepository.TrierServicesNomsPrix();
	}


}
