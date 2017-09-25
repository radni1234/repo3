package com.isem.mvc.model;

import java.util.Date;

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
public class VoziloKilometraza {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "VOZILO_ID",
            foreignKey = @ForeignKey(name = "VOZILO_KILOMETRAZA_FK1")
    )
	private Vozilo vozilo;
	
	@Column(name = "KILOMETRAZA", columnDefinition = "numeric(18,2)")
	private Double kilometraza;	
	
	@Column(name = "DATUM")
	private Date datum;	

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Vozilo getVozilo() {
		return vozilo;
	}

	public Double getKilometraza() {
		return kilometraza;
	}

	public Date getDatum() {
		return datum;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}

	public void setKilometraza(Double kilometraza) {
		this.kilometraza = kilometraza;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "VoziloKilometraza [id=" + id + ", vozilo=" + vozilo + ", kilometraza=" + kilometraza + ", datum="
				+ datum + ", version=" + version + "]";
	}

	
	
	
	
	
	
	
}
