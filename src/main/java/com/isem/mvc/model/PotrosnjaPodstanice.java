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
public class PotrosnjaPodstanice {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "PODSTANICA_ID",
            foreignKey = @ForeignKey(name = "POTROSNJA_PODSTANICE_FK1")
    )
	private Podstanica podstanica;
	
	@Column(name = "DATUM")
	private Date datum;
	
	@Column(name = "POTROSNJA_KWH", columnDefinition = "numeric(18,2)")
	private Double potrosnjaKwh;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Podstanica getPodstanica() {
		return podstanica;
	}

	public void setPodstanica(Podstanica podstanica) {
		this.podstanica = podstanica;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Double getPotrosnjaKwh() {
		return potrosnjaKwh;
	}

	public void setPotrosnjaKwh(Double potrosnjaKwh) {
		this.potrosnjaKwh = potrosnjaKwh;
	}

	public Integer getVersion() {
		return version;
	}

	
	
}
