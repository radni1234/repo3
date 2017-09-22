package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RnTrafoView {
	@Id
	private Long id;	
	private Long trafoId;
	private String adresa;
	private Date datumr;
	private String mesec;
	private String godina;
	private Double potrosnja;
	private Double iznos;
	
	public Long getId() {
		return id;
	}	 
	public Long getTrafoId() {
		return trafoId;
	}
	public String getAdresa() {
		return adresa;
	}
	public Date getDatumr() {
		return datumr;
	}
	public String getMesec() {
		return mesec;
	}
	public String getGodina() {
		return godina;
	}
	public Double getPotrosnja() {
		return potrosnja;
	}
	public Double getIznos() {
		return iznos;
	}
	
	

}
