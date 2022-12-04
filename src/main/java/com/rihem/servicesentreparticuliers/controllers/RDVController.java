package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rihem.servicesentreparticuliers.entities.RDV;
import com.rihem.servicesentreparticuliers.service.RDVService;

@RestController
@RequestMapping("/api/rdv")
public class RDVController {
	@Autowired
	RDVService rdvService ;
	
	@GetMapping("/findAll")
	
	public List<RDV> getAllRDVs(){
		List<RDV> list= rdvService.getAllRDV();
		return list;
	}
		@PostMapping("/AjouterRDV")
		
	public RDV AjouterRDV (@RequestBody RDV r) {
		return rdvService.AjouterRDV(r) ;
		}
	@GetMapping("/affectation/{idBricoleur}/{idRDV}")
	public void affectrdvtobricoleur(@PathVariable("idBricoleur") Long idBricoleur ,@PathVariable("idRDV") Long idRDV ) {
		rdvService.AffecterBricoleurRDV(idBricoleur, idRDV)	;
		}
}
	

