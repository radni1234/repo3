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
public class TrendObracunato {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID", nullable = false, 
            foreignKey = @ForeignKey(name = "TREND_OBRACUNATO_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "PERIOD", nullable = false,  columnDefinition = "int(6)")
	private Integer period;
	
	@Column(name = "FORMULA", length = 100)
	private String formula;
	
	@Column(name = "POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double potrosnja;
	
	@Column(name = "OCEKIVANA_POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double ocekivanPotrosnja;
	
	@Column(name = "TREND_TOLERANCIJA", columnDefinition = "numeric(18,2)")
	private Double trendTolerancija;
	
	@Column(name = "ODSTUPANJE", columnDefinition = "numeric(18,2)")
	private Double odstupanje;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public Integer getPeriod() {
		return period;
	}

	public String getFormula() {
		return formula;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getOcekivanPotrosnja() {
		return ocekivanPotrosnja;
	}

	public Double getTrendTolerancija() {
		return trendTolerancija;
	}

	public Double getOdstupanje() {
		return odstupanje;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public void setPotrosnja(Double potrosnja) {
		this.potrosnja = potrosnja;
	}

	public void setOcekivanPotrosnja(Double ocekivanPotrosnja) {
		this.ocekivanPotrosnja = ocekivanPotrosnja;
	}

	public void setTrendTolerancija(Double trendTolerancija) {
		this.trendTolerancija = trendTolerancija;
	}

	public void setOdstupanje(Double odstupanje) {
		this.odstupanje = odstupanje;
	}
	
	
}
