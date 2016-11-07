package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Godina {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "GOD", unique = true, nullable = false, precision = 4, scale = 0)
	private double god;
	
	@Column(name = "NAZIV", unique = true, length = 20)
	private String naziv;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getGod() {
		return god;
	}

	public void setGod(double god) {
		this.god = god;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Godina [id=" + id + ", god=" + god + ", naziv=" + naziv + "]";
	}	
	
}
