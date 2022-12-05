package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rihem.servicesentreparticuliers.entities.Bricoleur;
import com.rihem.servicesentreparticuliers.service.BricoleurService;

@RestController
@RequestMapping("/api")


public class BricoleurController
{
	@Autowired
	BricoleurService bricoleurService;
	
	@GetMapping("/bricoleurs")
	
	public List<Bricoleur> getAllBricoleurs(){
      List<Bricoleur> list1= bricoleurService.getAllBricoleur();
       return list1 ;
	}
	
	@PostMapping("/AjouterBricoleur")
	//@RequestMapping(method=RequestMethod.GET)
	
	public Bricoleur AjouterBricoleur(@RequestBody Bricoleur b) {
		return bricoleurService.AjouterBricoleur(b);
	}
	@DeleteMapping("deleteBricoleur/{id}")
	
	public void deleteBricoleur(@PathVariable("id") Long idBricoleur) {
		bricoleurService.DeleteBricoleur(idBricoleur);
	}
}

