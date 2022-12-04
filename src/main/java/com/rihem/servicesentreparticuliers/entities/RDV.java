package com.rihem.servicesentreparticuliers.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RDV  {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id ;
  private Date date ;
  @ManyToOne
  private Services services ;
  @ManyToOne
  private Bricoleur bricoleur;
  @ManyToOne
  private Particulier particulier ;
  
public Services getServices() {
	return services;
}
public void setServices(Services services) {
	this.services = services;
}
public Bricoleur getBricoleur() {
	return bricoleur;
}
public void setBricoleur(Bricoleur bricoleur) {
	this.bricoleur = bricoleur;
}
public Particulier getParticulier() {
	return particulier;
}
public void setParticulier(Particulier particulier) {
	this.particulier = particulier;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "RDV [id=" + id + ", date=" + date + "]";
}
public RDV(Date date) {
	super();
	this.date = date;
}

  
}
