package com.rihem.ServicesEntreParticuliers;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rihem.servicesentreparticuliers.entities.Categorie;
import com.rihem.servicesentreparticuliers.entities.Services;
import com.rihem.servicesentreparticuliers.repos.ServiceRepository;

@SpringBootTest
class ServicesEntreParticuliersApplicationTests {
	@Autowired
	private ServiceRepository serviceRepository;

	@Test
	public void testCreateService(){
		Services service = new Services("Jardinage",30.000,new Date());
		serviceRepository.save(service);
	}
	@Test
	public void testFindService()
	{
	 Services s = serviceRepository.findById(1L).get(); 
	System.out.println(s);
	}
	
	@Test
	public void testUpdateService()
	{
	Services s = serviceRepository.findById(1L).get();
	s.setPrixService(70.000);
	serviceRepository.save(s);
	}
	
	@Test
	public void testDeleteService()
	{
	serviceRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousServices(){
	List<Services> services = serviceRepository.findAll();
	  for (Services s : services){
	     System.out.println(s);}
	}
	
	@Test
	public void testfindByNomService(){
		List<Services> services = serviceRepository.findByNomService("bricolage");
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testfindByNomServiceContains(){
		List<Services> services = serviceRepository.findByNomServiceContains("bricolage");
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testfindByNomPrix(){
		List<Services> services = serviceRepository.findByNomPrix("bricolage",40.000);
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testfindByCategorie(){
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Services> services = serviceRepository.findByCategorie(cat);
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testfindByCategorieIdCat(){
		
		List<Services> services = serviceRepository.findByCategorieIdCat(1L);
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testfindByOrderByNomServiceAsc() {
		List<Services> services = serviceRepository.findByOrderByNomServiceAsc();
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}
	
	@Test
	public void testTrierServicesNomsPrix() {
		List<Services> services = serviceRepository.TrierServicesNomsPrix();
		  for(Services s : services) {
			  System.out.println(s);
		  }
	}

	

}
