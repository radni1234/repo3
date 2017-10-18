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
public class VodozahvatPumpa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "VODOZAHVAT_PUMPA_FK1")
    )
	private Vodozahvat vodozahvat;

	@Column(name = "TIP", length = 100)
	private String tip;
	
	@Column(name = "PROIZVODJAC", length = 100)
	private String proizvodjac;
	
	@Column(name = "SNAGA", columnDefinition = "numeric(18,2)" )
	private Double snaga;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getTip() {
		return tip;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public Double getSnaga() {
		return snaga;
	}

	public Integer getVersion() {
		return version;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public void setSnaga(Double snaga) {
		this.snaga = snaga;
	}

	public Vodozahvat getVodozahvat() {
		return vodozahvat;
	}

	public void setVodozahvat(Vodozahvat vodozahvat) {
		this.vodozahvat = vodozahvat;
	}

	@Override
	public String toString() {
		return "VodozahvatPumpa [id=" + id + ", vodozahvat=" + vodozahvat + ", tip=" + tip + ", proizvodjac="
				+ proizvodjac + ", snaga=" + snaga + ", version=" + version + "]";
	}
	
	
}
