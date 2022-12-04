package com.rihem.servicesentreparticuliers.repos;




import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.rihem.servicesentreparticuliers.entities.Bricoleur;


@Repository
public interface BricoleurRepository extends CrudRepository<Bricoleur, Long >{
	
}
