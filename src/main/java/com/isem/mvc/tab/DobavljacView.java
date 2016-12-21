package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DobavljacView {
	@Id
	private Long id;
	private String naziv;
	private String mesto;
	private String tel;
	private String mail;
	private String web;
	
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getMesto() {
		return mesto;
	}
	public String getTel() {
		return tel;
	}
	public String getMail() {
		return mail;
	}
	public String getWeb() {
		return web;
	}
	
	
}
