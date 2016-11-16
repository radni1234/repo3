package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity	
public class Uloga {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String naziv;
	
	private String kraciNaz;
	
	@Version
    @Column(name = "VERSION")
    private Integer version;

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getKraciNaz() {
		return kraciNaz;
	}

	public void setKraciNaz(String kraciNaz) {
		this.kraciNaz = kraciNaz;
	}
	
	@Override
	public String toString() {
		return "Uloga id=" + id + ", naziv=" + naziv + ", kraciNaz=" + kraciNaz + "]";
	}
}
