package com.rihem.servicesentreparticuliers.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rihem.servicesentreparticuliers.entities.Particulier;
@Repository
public interface ParticulierRepository extends JpaRepository<Particulier, Long> {

}
