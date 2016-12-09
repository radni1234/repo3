package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pdv {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;
	
	@Column(name = "STOPA", columnDefinition = "numeric(5,2)")
	private double stopa;
	
	@Column(name = "AKTIVAN", length = 1)
	private String aktivan;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getStopa() {
		return stopa;
	}

	public String getAktivan() {
		return aktivan;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setStopa(double stopa) {
		this.stopa = stopa;
	}

	public void setAktivan(String aktivan) {
		this.aktivan = aktivan;
	}

	@Override
	public String toString() {
		return "Pdv [id=" + id + ", naziv=" + naziv + ", stopa=" + stopa + ", aktivan=" + aktivan + ", version="
				+ version + "]";
	}
	
	
}
