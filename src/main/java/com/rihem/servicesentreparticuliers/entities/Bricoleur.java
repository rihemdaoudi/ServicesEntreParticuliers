package com.rihem.servicesentreparticuliers.entities;




import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Bricoleur implements Serializable {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id ;
	private String nom ;
	private String prenom ;
	private String Email;
	private String motdepasse ;
	private Integer telephone ;
	private String adresse ;
	@OneToMany(mappedBy="bricoleur")
	private List<Services> services ;

	public void setServices(List<Services> services) {
		this.services = services;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Bricoleur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Email=" + Email + ", motdepasse="
				+ motdepasse + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
	public Bricoleur(String nom, String prenom, String email, String motdepasse, Integer telephone, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Email = email;
		this.motdepasse = motdepasse;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	public List<Services> getServices() {
		return services;
	}
	public void setService(List<Services> services) {
		this.services = services;
	}
	
	
	
	
}
