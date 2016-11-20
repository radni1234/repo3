package com.isem.mvc.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KorisnikView {
	
	@Id
	private Long id;
	
	private String username;
	private String password;
	private String mail;
	private String uloga;
	private String mesto;
	private String opstina;
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getMail() {
		return mail;
	}
	public String getUloga() {
		return uloga;
	}
	public String getMesto() {
		return mesto;
	}
	public String getOpstina() {
		return opstina;
	}
	
	
}
