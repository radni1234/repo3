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
public class JavnoPreduzece {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "MESTO_ID",
            foreignKey = @ForeignKey(name = "JAVNO_PREDUZECE_FK1")
    )
	private Mesto mesto;
	
	@Column(name = "ADRESA", length = 300)
	private String adresa;
	
	@Column(name = "KO_IME", length = 100)
	private String koIme;
	
	@Column(name = "KO_PREZIME", length = 100)
	private String koPrezime;
	
	@Column(name = "KO_ZANIMANJE", length = 100)
	private String koZanimanje;
	
	@Column(name = "KO_TEL", length = 20)
	private String koTel;
	
	@Column(name = "KO_FAKS", length = 20)
	private String koFaks;
	
	@Column(name = "KO_MOB", length = 20)
	private String koMob;
	
	@Column(name = "KO_MAIL", length = 50)
	private String koMail;	

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getKoIme() {
		return koIme;
	}

	public void setKoIme(String koIme) {
		this.koIme = koIme;
	}

	public String getKoPrezime() {
		return koPrezime;
	}

	public void setKoPrezime(String koPrezime) {
		this.koPrezime = koPrezime;
	}

	public String getKoZanimanje() {
		return koZanimanje;
	}

	public void setKoZanimanje(String koZanimanje) {
		this.koZanimanje = koZanimanje;
	}

	public String getKoTel() {
		return koTel;
	}

	public void setKoTel(String koTel) {
		this.koTel = koTel;
	}

	public String getKoFaks() {
		return koFaks;
	}

	public void setKoFaks(String koFaks) {
		this.koFaks = koFaks;
	}

	public String getKoMob() {
		return koMob;
	}

	public void setKoMob(String koMob) {
		this.koMob = koMob;
	}

	public String getKoMail() {
		return koMail;
	}

	public void setKoMail(String koMail) {
		this.koMail = koMail;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}	
	
	
}
