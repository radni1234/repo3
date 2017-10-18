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
public class ProizvodnjaVode {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "PROIZVODNJA_VODE_FK1")
    )
	private Vodozahvat vodozahvat;
	
	@Column(name = "DATUM")
	private Date datum;
	
	@Column(name = "PROIZVODNJA", columnDefinition = "numeric(18,2)" )
	private Double proizvodnja;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Vodozahvat getVodozahvat() {
		return vodozahvat;
	}

	public Date getDatum() {
		return datum;
	}

	public Double getProizvodnja() {
		return proizvodnja;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVodozahvat(Vodozahvat vodozahvat) {
		this.vodozahvat = vodozahvat;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public void setProizvodnja(Double proizvodnja) {
		this.proizvodnja = proizvodnja;
	}

	@Override
	public String toString() {
		return "ProizvodnjaVode [id=" + id + ", vodozahvat=" + vodozahvat + ", datum=" + datum + ", proizvodnja="
				+ proizvodnja + ", version=" + version + "]";
	}
	
	

}
