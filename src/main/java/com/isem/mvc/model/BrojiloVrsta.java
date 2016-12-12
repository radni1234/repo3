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
public class BrojiloVrsta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_TIP_ID",
            foreignKey = @ForeignKey(name = "ENERGENT_TIP_FK1")
    )
	private EnergentTip energentTip;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public EnergentTip getEnergentTip() {
		return energentTip;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setEnergentTip(EnergentTip energentTip) {
		this.energentTip = energentTip;
	}

	@Override
	public String toString() {
		return "BrojiloVrsta [id=" + id + ", naziv=" + naziv + ", energentTip=" + energentTip + ", version=" + version
				+ "]";
	}
	
	
}
