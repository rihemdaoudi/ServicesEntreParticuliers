package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;
import java.util.Optional;

import com.rihem.servicesentreparticuliers.entities.LoginDetails;
import com.rihem.servicesentreparticuliers.entities.Services;
import com.rihem.servicesentreparticuliers.repos.ParticulierRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.rihem.servicesentreparticuliers.entities.Particulier;
import com.rihem.servicesentreparticuliers.service.ParticulierService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")

public class ParticulierController {

  ParticulierService particulierService;
  ParticulierRepository particulierRepository;

	public ParticulierController( ParticulierService particulierService,ParticulierRepository particulierRepository) {
		this.particulierService = particulierService;
		this.particulierRepository=particulierRepository;
	}

	@GetMapping("/particuliers")
   public List<Particulier> getAllParticuliers(){
        List<Particulier> list= particulierService.getAllParticulier();
        return list ;
 	}
	@PostMapping("/login")
   public Particulier login(@RequestBody LoginDetails loginDetails){
		String email = loginDetails.getEmail();
		String password = loginDetails.getPassword();
        //List<Particulier> list= particulierService.getAllParticulier();
        return particulierService.findByEmailAndPassword(email, password);
 	}

@PutMapping("/particuliers/{id}")

	public ResponseEntity<Particulier> updateEmployee(@PathVariable long id,@RequestBody Particulier particulier) {
		Particulier updateParticulier = particulierRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Particulier not exist with id: " + id));

		updateParticulier.setNomp(particulier.getNomp());
	updateParticulier.setEmailp(particulier.getEmailp());
	updateParticulier.setPrenomp(particulier.getPrenomp());
	updateParticulier.setAdressep(particulier.getAdressep());

	updateParticulier.setTelephonep(particulier.getTelephonep());


	particulierRepository.save(updateParticulier);

		return ResponseEntity.ok(updateParticulier);
	}

@GetMapping("/particuliers/{id}")
public Optional<Particulier> getUserById(@PathVariable("id") Long idParticulier) {
	return particulierService.getParticulierById(idParticulier);
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
