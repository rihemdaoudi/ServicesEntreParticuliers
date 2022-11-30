package com.rihem.servicesentreparticuliers.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rihem.servicesentreparticuliers.entities.Particulier;

public interface ParticulierRepository extends JpaRepository<Particulier, Long> {

}
