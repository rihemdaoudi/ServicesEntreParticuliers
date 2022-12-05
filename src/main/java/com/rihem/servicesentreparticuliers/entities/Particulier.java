package com.rihem.servicesentreparticuliers.entities;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Particulier implements Serializable {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nomp ;
	private String prenomp ;
	private String Emailp;
	private String motdepassep ;
	private Integer telephonep ;
	private String adressep ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomp() {
		return nomp;
	}
	public void setNomp(String nomp) {
		this.nomp = nomp;
	}
	public String getPrenomp() {
		return prenomp;
	}
	public void setPrenomp(String prenomp) {
		this.prenomp = prenomp;
	}
	public String getEmailp() {
		return Emailp;
	}
	public void setEmailp(String emailp) {
		Emailp = emailp;
	}
	public String getMotdepassep() {
		return motdepassep;
	}
	public void setMotdepassep(String motdepassep) {
		this.motdepassep = motdepassep;
	}
	public Integer getTelephonep() {
		return telephonep;
	}
	public void setTelephonep(Integer telephonep) {
		this.telephonep = telephonep;
	}
	public String getAdressep() {
		return adressep;
	}
	public void setAdressep(String adressep) {
		this.adressep = adressep;
	}
	@Override
	public String toString() {
		return "Particulier [id=" + id + ", nomp=" + nomp + ", prenomp=" + prenomp + ", Emailp=" + Emailp
				+ ", motdepassep=" + motdepassep + ", telephonep=" + telephonep + ", adressep=" + adressep + "]";
	}
	public Particulier(String nomp, String prenomp, String emailp, String motdepassep, Integer telephonep,
			String adressep) {
		super();
		this.nomp = nomp;
		this.prenomp = prenomp;
		Emailp = emailp;
		this.motdepassep = motdepassep;
		this.telephonep = telephonep;
		this.adressep = adressep;
	}
	

}
