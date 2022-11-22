package com.rihem.servicesentreparticuliers.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rihem.servicesentreparticuliers.entities.Categorie;
import com.rihem.servicesentreparticuliers.entities.Services;

@RepositoryRestResource(path = "rest")
public interface ServiceRepository extends JpaRepository<Services, Long>{
	List<Services> findByNomService(String nomService);
	List<Services> findByNomServiceContains(String nomService);
	@Query("select s from Services s where s.nomService like %?1 and s.prixService > ?2")
	List<Services> findByNomPrix (@Param("nomService") String nomService,@Param("prixService") Double prixService);
	@Query("select s from Services s where s.categorie = ?1")
	List<Services> findByCategorie(Categorie categorie);
	List<Services> findByCategorieIdCat(Long id);
	List<Services> findByOrderByNomServiceAsc();
	@Query("select s from Services s oder by s.nomService ASC, s.prixService DESC")
	List<Services> TrierServicesNomsPrix();

}
