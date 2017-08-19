package com.isem.mvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(name = "BROJILO_VRSTA_RN_TIP",
		joinColumns = { @JoinColumn(name = "BROJILO_VRSTA_ID") },
		inverseJoinColumns = { @JoinColumn(name = "RN_TIP_ID") })
	private Set<RnTip> rnTip = new HashSet<RnTip>();

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

	public Set<RnTip> getRnTip() {
		return rnTip;
	}

	public void setRnTip(Set<RnTip> rnTip) {
		this.rnTip = rnTip;
	}

	@Override
	public String toString() {
		return "BrojiloVrsta [id=" + id + ", naziv=" + naziv + ", energentTip=" + energentTip + ", rnTip=" + rnTip
				+ ", version=" + version + "]";
	}

	
}
