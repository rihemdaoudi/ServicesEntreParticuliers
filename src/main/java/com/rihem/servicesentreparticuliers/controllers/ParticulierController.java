package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;


import com.rihem.servicesentreparticuliers.entities.Particulier;
import com.rihem.servicesentreparticuliers.service.ParticulierService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")

public class ParticulierController {

  ParticulierService particulierService;

	public ParticulierController(ParticulierService particulierService) {
		this.particulierService = particulierService;
	}

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
