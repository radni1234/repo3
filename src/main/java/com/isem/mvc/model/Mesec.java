package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Mesec {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAZIV", unique = true, nullable = false, length = 20)
	private String naziv;
	
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

	

	@Override
	public String toString() {
		return "Mesec [id=" + id + ", naziv=" + naziv + "]";
	}
	
	
}
