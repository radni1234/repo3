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
public class Trafo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "MESTO_ID",
            foreignKey = @ForeignKey(name = "TRAFO_FK1")
    )
	private Mesto mesto;
	
	@Column(name = "ADRESA", nullable = false, length = 200)
	private String adresa;
	
	@Column(name = "LON_D", columnDefinition = "numeric(18,15)")
	private Double lonD;
	
	@Column(name = "LAT_D", columnDefinition = "numeric(18,15)")
	private Double latD;
	
	@Column(name = "REDOSLED", columnDefinition = "int(11)")
	private Integer redosled;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
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

	public Double getLonD() {
		return lonD;
	}

	public void setLonD(Double lonD) {
		this.lonD = lonD;
	}

	public Double getLatD() {
		return latD;
	}

	public void setLatD(Double latD) {
		this.latD = latD;
	}

	public Integer getRedosled() {
		return redosled;
	}

	public void setRedosled(Integer redosled) {
		this.redosled = redosled;
	}

	public Integer getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Trafo [id=" + id + ", mesto=" + mesto + ", adresa=" + adresa + ", lonD=" + lonD + ", latD=" + latD
				+ ", redosled=" + redosled + ", version=" + version + "]";
	}

	

	
	
	
}
