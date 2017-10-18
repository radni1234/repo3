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
public class Rezervoar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "REZERVOAR_FK1")
    )
	private Vodozahvat vodozahvat;

	@Column(name = "TIP", length = 100)
	private String tip;
	
	@Column(name = "ZAPREMINA", columnDefinition = "numeric(18,2)" )
	private Double zapremina;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Vodozahvat getVodozahvat() {
		return vodozahvat;
	}

	public String getTip() {
		return tip;
	}

	public Double getZapremina() {
		return zapremina;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVodozahvat(Vodozahvat vodozahvat) {
		this.vodozahvat = vodozahvat;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void setZapremina(Double zapremina) {
		this.zapremina = zapremina;
	}

	@Override
	public String toString() {
		return "Rezervoar [id=" + id + ", vodozahvat=" + vodozahvat + ", tip=" + tip + ", zapremina=" + zapremina
				+ ", version=" + version + "]";
	}
	
	

}
