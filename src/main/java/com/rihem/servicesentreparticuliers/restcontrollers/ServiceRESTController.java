package com.rihem.servicesentreparticuliers.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rihem.servicesentreparticuliers.entities.Services;
import com.rihem.servicesentreparticuliers.service.ServicesService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ServiceRESTController {
	@Autowired
	ServicesService serviceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Services> getAllServices(){
		return serviceService.getAllServices();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Services getServiceById(@PathVariable("id") Long id)
	{
		return serviceService.getService(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Services creatService(@RequestBody Services service) {
		return serviceService.saveService(service);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Services updateService(@RequestBody Services service) {
		return serviceService.updateService(service);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id) {
		serviceService.deleteServiceById(id);
	}
	
	@RequestMapping(value="/servicesscat/{idCat}",method = RequestMethod.GET)
	public List<Services> getServicesByCatId(@PathVariable("idCat") Long idCat)
	{
		return serviceService.findByCategorieIdCat(idCat);
	}
	
	@RequestMapping(value="/servicescat/{idCat}",method = RequestMethod.GET)
	public List<Services> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	return serviceService.findByCategorieIdCat(idCat);
	}


}
