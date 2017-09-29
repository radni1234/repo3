package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoziloPotrosnjaView {
	@Id
	private Long id;
	private Long energentId;
	private String energent;
	private Long voziloId;
	private String registracija;
	private Date datum;
	private Double potrosnja;
	private Double iznos;
	
	public Long getId() {
		return id;
	}
	public Long getEnergentId() {
		return energentId;
	}
	public String getEnergent() {
		return energent;
	}
	public Long getVoziloId() {
		return voziloId;
	}
	public String getRegistracija() {
		return registracija;
	}
	public Date getDatum() {
		return datum;
	}
	public Double getPotrosnja() {
		return potrosnja;
	}
	public Double getIznos() {
		return iznos;
	}
	
	
}
