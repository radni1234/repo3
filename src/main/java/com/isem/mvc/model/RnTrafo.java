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
public class RnTrafo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "TRAFO_ID",
            foreignKey = @ForeignKey(name = "RN_TRAFO_FK1")
    )
	private Trafo trafo;
	
	@Column(name = "DATUMR")
	private Date datumr;
	
	@Column(name = "POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double potrosnja;
	
	@Column(name = "IZNOS", columnDefinition = "numeric(18,2)")
	private Double iznos;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Trafo getTrafo() {
		return trafo;
	}

	public Date getDatumr() {
		return datumr;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getIznos() {
		return iznos;
	}

	public Integer getVersion() {
		return version;
	}

	public void setTrafo(Trafo trafo) {
		this.trafo = trafo;
	}

	public void setDatumr(Date datumr) {
		this.datumr = datumr;
	}

	public void setPotrosnja(Double potrosnja) {
		this.potrosnja = potrosnja;
	}

	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}

	@Override
	public String toString() {
		return "RnTrafo [id=" + id + ", trafo=" + trafo + ", datumr=" + datumr + ", potrosnja=" + potrosnja + ", iznos="
				+ iznos + ", version=" + version + "]";
	}
	
	
}
