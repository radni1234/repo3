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
	
	@Column(name = "LON_M", columnDefinition = "numeric(18,15)")
	private Double lonM;
	
	@Column(name = "LON_S", columnDefinition = "numeric(18,15)")
	private Double lonS;
	
	@Column(name = "LAT_D", columnDefinition = "numeric(18,15)")
	private Double latD;
	
	@Column(name = "LAT_M", columnDefinition = "numeric(18,15)")
	private Double latM;
	
	@Column(name = "LAT_S", columnDefinition = "numeric(18,15)")
	private Double latS;
	
	@Column(name = "GAUS_X", columnDefinition = "numeric(18)")
	private Double gausX;
	
	@Column(name = "GAUS_Y", columnDefinition = "numeric(18)")
	private Double gausY;
	
	@Column(name = "NOVI_REDOSLED", columnDefinition = "numeric(18)")
	private Double noviRedosled;	

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getLonM() {
		return lonM;
	}

	public void setLonM(Double lonM) {
		this.lonM = lonM;
	}

	public Double getLonS() {
		return lonS;
	}

	public void setLonS(Double lonS) {
		this.lonS = lonS;
	}

	public Double getLatD() {
		return latD;
	}

	public void setLatD(Double latD) {
		this.latD = latD;
	}

	public Double getLatM() {
		return latM;
	}

	public void setLatM(Double latM) {
		this.latM = latM;
	}

	public Double getLatS() {
		return latS;
	}

	public void setLatS(Double latS) {
		this.latS = latS;
	}

	public Double getGausX() {
		return gausX;
	}

	public void setGausX(Double gausX) {
		this.gausX = gausX;
	}

	public Double getGausY() {
		return gausY;
	}

	public void setGausY(Double gausY) {
		this.gausY = gausY;
	}

	public Double getNoviRedosled() {
		return noviRedosled;
	}

	public void setNoviRedosled(Double noviRedosled) {
		this.noviRedosled = noviRedosled;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Trafo [id=" + id + ", mesto=" + mesto + ", adresa=" + adresa + ", lonD=" + lonD + ", lonM=" + lonM
				+ ", lonS=" + lonS + ", latD=" + latD + ", latM=" + latM + ", latS=" + latS + ", gausX=" + gausX
				+ ", gausY=" + gausY + ", noviRedosled=" + noviRedosled + ", version=" + version + "]";
	}
	
	
}
