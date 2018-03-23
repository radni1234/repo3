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
public class Kotlarnica {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;	
	
	@Column(name = "ADRESA", length = 300)
	private String adresa;
	
	@ManyToOne
    @JoinColumn(name = "JAVNO_PREDUZECE_ID",
            foreignKey = @ForeignKey(name = "KOTLARNICA_FK1")
    )
	private JavnoPreduzece javnoPreduzece;
	
//	@ManyToOne
//    @JoinColumn(name = "MESTO_ID",
//            foreignKey = @ForeignKey(name = "KOTLARNICA_FK2")
//    )
//	private Mesto mesto;
	
	@Column(name = "LON", columnDefinition = "numeric(18,15)")
	private Double lon;
	
	@Column(name = "LAT", columnDefinition = "numeric(18,15)")
	private Double lat;
	
	@Column(name = "NAPOMENA", length = 1000)
	private String napomena;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public JavnoPreduzece getJavnoPreduzece() {
		return javnoPreduzece;
	}

	public void setJavnoPreduzece(JavnoPreduzece javnoPreduzece) {
		this.javnoPreduzece = javnoPreduzece;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}	

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Integer getVersion() {
		return version;
	}

	
	
}
