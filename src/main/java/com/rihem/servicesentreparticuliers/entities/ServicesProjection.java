package com.rihem.servicesentreparticuliers.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomService", types = { Services.class })
public interface ServicesProjection {
	public String getNomService();

}

