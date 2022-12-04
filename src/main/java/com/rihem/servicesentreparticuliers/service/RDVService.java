package com.rihem.servicesentreparticuliers.service;

import java.util.List;

import com.rihem.servicesentreparticuliers.entities.RDV;

public interface RDVService {
  RDV AjouterRDV (RDV r);
  List<RDV> getAllRDV() ;
public void AffecterBricoleurRDV(Long idBricoleur , Long idRDV);
}
