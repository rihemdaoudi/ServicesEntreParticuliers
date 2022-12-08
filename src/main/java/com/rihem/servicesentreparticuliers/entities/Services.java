package com.rihem.servicesentreparticuliers.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Services {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idService;
	
	private String nomService;
	private Double prixService;
	private String descriptionService;
	private Double dureeService;

	private String photoService;

	@ManyToOne(cascade=CascadeType.ALL)
	private Categorie categorie;

	@ManyToOne
	private Bricoleur bricoleur ;

	@OneToMany(mappedBy="services")
	private List<RDV> rdv ;

	public Services(Long idService, String nomService, Double prixService, String descriptionService, Double dureeService, String photoService) {
		this.idService = idService;
		this.nomService = nomService;
		this.prixService = prixService;
		this.descriptionService = descriptionService;
		this.dureeService = dureeService;
		this.photoService=photoService;

	}
	public Services() {
		super();
	}

	public String getPhotoService() {
		return photoService;
	}

	public void setPhotoService(String photoService) {
		this.photoService = photoService;
	}

	public String getDescriptionService() {
		return descriptionService;
	}
	public void setDescriptionService(String descriptionService) {
		this.descriptionService = descriptionService;
	}

	public Double getDureeService() {
		return dureeService;
	}

	public void setDureeService(Double dureeService) {
		this.dureeService = dureeService;
	}
	
	public List<RDV> getRdv() {
		return rdv;
	}



	public void setRdv(List<RDV> rdv) {
		this.rdv = rdv;
	}



	public Bricoleur getBricoleur() {
		return bricoleur;
	}



	public void setBricoleur(Bricoleur bricoleur) {
		this.bricoleur = bricoleur;
	}







	public Long getIdService() {
		return idService;
	}
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public Double getPrixService() {
		return prixService;
	}
	public void setPrixService(Double prixService) {
		this.prixService = prixService;
	}




	@Override
	public String toString() {
		return "Service [idService=" + idService + ", nomService=" + nomService + ", prixService=" + prixService
				+ ", dateCreation=" +  "]";
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	


}
