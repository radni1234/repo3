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
public class Objekat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", nullable = false, length = 300)
	private String naziv;	
	
	@ManyToOne
    @JoinColumn(name = "MESTO_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_FK1")
    )
	private Mesto mesto;
	
	@Column(name = "ADRESA", length = 300)
	private String adresa;
	
	@Column(name = "LON", columnDefinition = "numeric(18,15)")
	private Double lon;
	
	@Column(name = "LAT", columnDefinition = "numeric(18,15)")
	private Double lat;
	
	@ManyToOne
    @JoinColumn(name = "PODGRUPA_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_FK2")
    )
	private Podgrupa podgrupa;		
	
	@ManyToOne
    @JoinColumn(name = "NACIN_FINANSIRANJA_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_FK3")
    )
	private NacinFinansiranja nacinFinansiranja;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public Integer getVersion() {
		return version;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public String getAdresa() {
		return adresa;
	}

	public Podgrupa getPodgrupa() {
		return podgrupa;
	}

	
	public Double getLon() {
		return lon;
	}

	public Double getLat() {
		return lat;
	}

	public NacinFinansiranja getNacinFinansiranja() {
		return nacinFinansiranja;
	}	

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setPodgrupa(Podgrupa podgrupa) {
		this.podgrupa = podgrupa;
	}	

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public void setNacinFinansiranja(NacinFinansiranja nacinFinansiranja) {
		this.nacinFinansiranja = nacinFinansiranja;
	}

	@Override
	public String toString() {
		return "Objekat [id=" + id + ", naziv=" + naziv + ", version=" + version + ", mesto=" + mesto + ", adresa="
				+ adresa + ", lon=" + lon + ", lat=" + lat + ", podgrupa=" + podgrupa + ", nacinFinansiranja="
				+ nacinFinansiranja + "]";
	}

	
	
	
	
}
