package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KorisnikMeniView {
	@Id
	private Long id;
	private String username;
	private Boolean psAdmin;
	private Boolean psObjekti;
	private Boolean psVozila;
	private Boolean psRasveta;
	private Boolean psVodosnabdevanje;
	private Boolean psGrejanje;
	
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public Boolean getPsAdmin() {
		return psAdmin;
	}
	public Boolean getPsObjekti() {
		return psObjekti;
	}
	public Boolean getPsVozila() {
		return psVozila;
	}
	public Boolean getPsRasveta() {
		return psRasveta;
	}
	public Boolean getPsVodosnabdevanje() {
		return psVodosnabdevanje;
	}
	public Boolean getPsGrejanje() {
		return psGrejanje;
	}
	
	
}
