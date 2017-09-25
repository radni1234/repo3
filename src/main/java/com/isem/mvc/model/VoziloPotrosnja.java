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
public class VoziloPotrosnja {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "VOZILO_ID",
            foreignKey = @ForeignKey(name = "VOZILO_POTROSNJA_FK1")
    )
	private Vozilo vozilo;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "VOZILO_POTROSNJA_FK2")
    )
	private Energent energent;
	
	@Column(name = "POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double potrosnja;
	
	@Column(name = "IZNOS", columnDefinition = "numeric(18,2)")
	private Double iznos;
	
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

	public Energent getEnergent() {
		return energent;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getIznos() {
		return iznos;
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

	public void setEnergent(Energent energent) {
		this.energent = energent;
	}

	public void setPotrosnja(Double potrosnja) {
		this.potrosnja = potrosnja;
	}

	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "VoziloPotrosnja [id=" + id + ", vozilo=" + vozilo + ", energent=" + energent + ", potrosnja="
				+ potrosnja + ", iznos=" + iznos + ", datum=" + datum + ", version=" + version + "]";
	}
	
	
	
}
