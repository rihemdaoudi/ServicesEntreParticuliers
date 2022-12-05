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


import com.rihem.servicesentreparticuliers.entities.Particulier;
import com.rihem.servicesentreparticuliers.service.ParticulierService;

@RestController
@RequestMapping("/api")

public class ParticulierController {
	@Autowired
  ParticulierService particulierService;

    @GetMapping("/particuliers")
   public List<Particulier> getAllParticuliers(){
        List<Particulier> list= particulierService.getAllParticulier();
        return list ;
 	}
    @PostMapping("/AjouterParticulier")
	
	public Particulier AjouterBricoleur(@RequestBody Particulier p) {
		return particulierService.AjouterParticulier(p);
	}
   @DeleteMapping("deleteParticulier/{id}")
	
	public void deleteParticulier(@PathVariable("id") Long idParticulier) {
	   particulierService.DeleteParticulier(idParticulier);
	}
}
