package com.rihem.servicesentreparticuliers.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Services {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idService;
	
	private String nomService;
	private Double prixService;
	private Date dateCreation;
	
	@ManyToOne 
	private Categorie categorie;
	
	
	public Services() {
		super();
	}
	
	
	
	public Services(String nomService, Double prixService, Date dateCreation) {
		super();
		this.nomService = nomService;
		this.prixService = prixService;
		this.dateCreation = dateCreation;
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



	@Override
	public String toString() {
		return "Service [idService=" + idService + ", nomService=" + nomService + ", prixService=" + prixService
				+ ", dateCreation=" + dateCreation + "]";
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	


}
