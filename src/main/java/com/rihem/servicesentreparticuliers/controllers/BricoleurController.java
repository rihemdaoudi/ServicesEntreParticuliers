package com.rihem.servicesentreparticuliers.controllers;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rihem.servicesentreparticuliers.entities.Bricoleur;
import com.rihem.servicesentreparticuliers.service.BricoleurService;



public class BricoleurController {
private BricoleurService bricoleurService ;
	
	@GetMapping("/bricoleurs")
	@ResponseBody
	public List<Bricoleur> getBricoleur()
	{
		return bricoleurService.getBricoleurs();
	}
	@GetMapping("/bricoleur/{id}") 
	public Bricoleur getBricoleur(@PathVariable Long id)
	{
		return bricoleurService.getBricoleurById(id).
				orElseThrow
				(
						()->new EntityNotFoundException("Requested Bricoleur not found")
				);
	}
	@PostMapping("/bricoleur")
	public Bricoleur addBricoleur(@RequestBody Bricoleur bricoleur)
	{
		return bricoleurService.save(bricoleur);
	}
	@PutMapping("bricoleur{id}")
	public ResponseEntity<?> addBricoleur(@RequestBody Bricoleur bricoleur, @PathVariable Long id)
	{
		if (bricoleurService.existsById(id))
		{
			Bricoleur bricoleur1 = bricoleurService.getBricoleurById(id).
					orElseThrow
					(
					()->new EntityNotFoundException("Requested bricoleur not found")		
					);
			bricoleur1.setNom(bricoleur.getNom());
			bricoleur1.setPrenom(bricoleur.getPrenom());
			bricoleur1.setEmail(bricoleur.getEmail());
			bricoleur1.setTelephone(bricoleur.getTelephone());
			bricoleur1.setAdresse(bricoleur.getAdresse());
			bricoleur1.setAutre(bricoleur.getAutre());
			bricoleurService.save(bricoleur);
			//returned type Bricoleur
			return ResponseEntity.ok().body(bricoleur1);
		}
		else
		{
		HashMap<String,String>	message = new HashMap<>();
		message.put("message", id + "bricoleur not found or matched");
		//returned type hashmap
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
				
		}
	}
	@DeleteMapping("bricoleur/{id}")
	public ResponseEntity<?> deleteBricoleur(@PathVariable Long id)
	{
		if (bricoleurService.existsById(id))
		{
			bricoleurService.deleteBricoleur(id);
			HashMap<String , String> message = new HashMap<>();
			message.put("message", "Bricoleur with id" + id + "deleted successfully.");
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		}
		else
		{
			HashMap<String,String>	message = new HashMap<>();
			message.put("message", id + "bricoleur not found or matched");
			//returned type hashmap
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
					
		}
	}

}
