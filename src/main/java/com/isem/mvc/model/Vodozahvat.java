package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Vodozahvat {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;	
	
	@Column(name = "ADRESA", length = 300)
	private String adresa;
	
	@ManyToOne
    @JoinColumn(name = "JAVNO_PREDUZECE_ID",
            foreignKey = @ForeignKey(name = "VODOZAHVAT_FK1")
    )
	private JavnoPreduzece javnoPreduzece;
	
	@ManyToOne
    @JoinColumn(name = "MESTO_ID",
            foreignKey = @ForeignKey(name = "VODOZAHVAT_FK2")
    )
	private Mesto mesto;	
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public JavnoPreduzece getJavnoPreduzece() {
		return javnoPreduzece;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setJavnoPreduzece(JavnoPreduzece javnoPreduzece) {
		this.javnoPreduzece = javnoPreduzece;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	@Override
	public String toString() {
		return "Vodozahvat [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", javnoPreduzece=" + javnoPreduzece
				+ ", mesto=" + mesto + ", version=" + version + "]";
	}
	
	
}
