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
public class ObjekatVentilacija {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_VENT_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "OPIS", length = 1000)
	private String opis;
	
	@Column(name = "PROSTORIJE", length = 1000)
	private String prostorije;
	
	@Column(name = "ZAPREMINA", columnDefinition = "numeric(18,2)")
	private Double zapremina;
	
	@Column(name = "UK_SNAGA", columnDefinition = "numeric(18,2)")
	private Double ukSnaga;
	
	@Column(name = "POTREBNO_VEN", columnDefinition = "numeric(18,2)")
	private Double potrebnoVen;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public String getOpis() {
		return opis;
	}

	public String getProstorije() {
		return prostorije;
	}

	public Double getZapremina() {
		return zapremina;
	}

	public Double getUkSnaga() {
		return ukSnaga;
	}

	public Double getPotrebnoVen() {
		return potrebnoVen;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setProstorije(String prostorije) {
		this.prostorije = prostorije;
	}

	public void setZapremina(Double zapremina) {
		this.zapremina = zapremina;
	}

	public void setUkSnaga(Double ukSnaga) {
		this.ukSnaga = ukSnaga;
	}

	public void setPotrebnoVen(Double potrebnoVen) {
		this.potrebnoVen = potrebnoVen;
	}

	@Override
	public String toString() {
		return "ObjekatVentilacija [id=" + id + ", objekat=" + objekat + ", opis=" + opis + ", prostorije=" + prostorije
				+ ", zapremina=" + zapremina + ", ukSnaga=" + ukSnaga + ", potrebnoVen=" + potrebnoVen + ", version="
				+ version + "]";
	}

	
}	
