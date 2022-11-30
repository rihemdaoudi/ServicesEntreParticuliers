package com.rihem.servicesentreparticuliers.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bricoleur {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private Long id ;
	private String nom ;
	private String prenom ;
	private String Email;
	private String telephone ;
	private String adresse ;
	private String autre ;
	private String service ;

}
