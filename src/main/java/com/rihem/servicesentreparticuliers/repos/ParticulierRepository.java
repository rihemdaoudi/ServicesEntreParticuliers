package com.rihem.servicesentreparticuliers.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rihem.servicesentreparticuliers.entities.Particulier;
@Repository
public interface ParticulierRepository extends JpaRepository<Particulier, Long> {


    @Query("select p from Particulier p where p.emailp = :email and p.motdepassep = :password")
    Particulier findByEmailpAndMotdepassep(@Param(value = "email") String email,
                                           @Param(value = "password") String password);
}
