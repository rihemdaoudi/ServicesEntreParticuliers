package com.rihem.servicesentreparticuliers.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rihem.servicesentreparticuliers.entities.RDV;

@Repository
public interface RDVRepository extends CrudRepository<RDV, Long > {

}
