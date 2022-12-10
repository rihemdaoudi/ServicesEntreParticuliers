package com.rihem.servicesentreparticuliers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihem.servicesentreparticuliers.entities.Particulier;
import com.rihem.servicesentreparticuliers.repos.ParticulierRepository;

@Service
public class ParticulierServiceImpl implements ParticulierService {
	@Autowired
	ParticulierRepository particulierRepository;

	@Override
	public Particulier AjouterParticulier(Particulier p) {
		particulierRepository.save(p);
		return p;
	}

	@Override
	public void DeleteParticulier(Particulier p) {
		particulierRepository.delete(p);
		
	}

	@Override
	public Optional<Particulier> getParticulierById(Long id) {
		return particulierRepository.findById(id);
	}

	@Override
	public void DeleteParticulier(Long id) {
		particulierRepository.deleteById(id);
		
	}

	@Override
	public List<Particulier> getAllParticulier() {
		return (List<Particulier>) particulierRepository.findAll();
	}

	@Override
	public Particulier findByEmailAndPassword(String email, String password) {
		return particulierRepository.findByEmailpAndMotdepassep(email, password);
	}

	@Override
	public Particulier updateParticulier(Particulier particulier) {
		particulierRepository.save(particulier);
		return particulier;
	}


}
