package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class ObjekatStruja {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_STRUJA_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "SNAGA_POTROSACA", columnDefinition = "numeric(18,2)")
	private Double snagaPotrosaca;
	
	@Column(name = "SNAGA_GREJALICA", columnDefinition = "numeric(18,2)")
	private Double snagaGrejalica;
	
	@Column(name = "SNAGA_RASVETA", columnDefinition = "numeric(18,2)")
	private Double snagaRasveta;
	
	@Column(name = "SNAGA_VRSNA", columnDefinition = "numeric(18,2)")
	private Double snagaVrsna;
	
	@Column(name = "POTREBNO_EL", columnDefinition = "numeric(18,2)")
	private Double potrebnoEl;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
	
	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public Double getSnagaPotrosaca() {
		return snagaPotrosaca;
	}

	public Double getSnagaGrejalica() {
		return snagaGrejalica;
	}

	public Double getSnagaRasveta() {
		return snagaRasveta;
	}

	public Double getSnagaVrsna() {
		return snagaVrsna;
	}

	public Double getPotrebnoEl() {
		return potrebnoEl;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setSnagaPotrosaca(Double snagaPotrosaca) {
		this.snagaPotrosaca = snagaPotrosaca;
	}

	public void setSnagaGrejalica(Double snagaGrejalica) {
		this.snagaGrejalica = snagaGrejalica;
	}

	public void setSnagaRasveta(Double snagaRasveta) {
		this.snagaRasveta = snagaRasveta;
	}

	public void setSnagaVrsna(Double snagaVrsna) {
		this.snagaVrsna = snagaVrsna;
	}

	public void setPotrebnoEl(Double potrebnoEl) {
		this.potrebnoEl = potrebnoEl;
	}

	@Override
	public String toString() {
		return "ObjekatStruja [id=" + id + ", objekat=" + objekat + ", snagaPotrosaca=" + snagaPotrosaca
				+ ", snagaGrejalica=" + snagaGrejalica + ", snagaRasveta=" + snagaRasveta + ", snagaVrsna=" + snagaVrsna
				+ ", potrebnoEl=" + potrebnoEl + ", version=" + version + "]";
	}
	
	
}
