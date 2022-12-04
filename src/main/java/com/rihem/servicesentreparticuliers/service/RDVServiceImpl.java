package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihem.servicesentreparticuliers.entities.Bricoleur;
import com.rihem.servicesentreparticuliers.entities.RDV;
import com.rihem.servicesentreparticuliers.repos.BricoleurRepository;
import com.rihem.servicesentreparticuliers.repos.RDVRepository;

@Service
public class RDVServiceImpl implements RDVService{
@Autowired
RDVRepository rdvRepository ;
@Autowired
BricoleurRepository bricoleurRepository ;
@Override
public RDV AjouterRDV(RDV r) {
	
	return rdvRepository.save(r);
}

@Override
public List<RDV> getAllRDV() {
	
	return (List<RDV>) rdvRepository.findAll();
}

@Override
public void AffecterBricoleurRDV(Long idBricoleur, Long idRDV) {
 RDV rdvEntity = rdvRepository.findById(idRDV).get();
 Bricoleur b= bricoleurRepository.findById(idBricoleur).orElseThrow(() -> new IllegalArgumentException("id bricoleur n'existe pas "));
   rdvEntity.setBricoleur(b);  
 rdvRepository.save(rdvEntity);
   
}

}
