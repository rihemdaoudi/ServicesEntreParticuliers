package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;

import com.rihem.servicesentreparticuliers.entities.Particulier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rihem.servicesentreparticuliers.entities.Services;
import com.rihem.servicesentreparticuliers.service.ServicesService;


@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceRESTController {

	ServicesService serviceService;
	public ServiceRESTController(ServicesService serviceService) {
		this.serviceService = serviceService;
	}

	
	@GetMapping("/")
	public List<Services> getAllServices(){
		List<Services> list= serviceService.getAllServices();
		return list ;
	}
	
	@GetMapping("/{id}")
	public Services getServiceById(@PathVariable("id") Long id)
	{
		return serviceService.getService(id);
	}
	
	@PostMapping("/ajouterService")
	public Services creatService(@RequestBody Services service) {
		return serviceService.saveService(service);
	}
	
	@PutMapping("/updateService")
	public Services updateService(@RequestBody Services service) {
		return serviceService.updateService(service);
	}
	
	@DeleteMapping("/{id}")
	public void deleteService(@PathVariable("id") Long id) {
		serviceService.deleteServiceById(id);
	}
	
	@GetMapping	("/servicesscat/{idCat}")
	public List<Services> getServicesByCatId(@PathVariable("idCat") Long idCat)
	{
		return serviceService.findByCategorieIdCat(idCat);
	}

}
