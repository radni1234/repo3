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
public class ObjekatHladjenje {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_HLADJENJE_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "OPIS", nullable = false, length = 1000)
	private String opis;
	
	@Column(name = "PO_HLA", columnDefinition = "numeric(18,2)")
	private Double poHla;
	
	@Column(name = "ZA_HLA", columnDefinition = "numeric(18,2)")
	private Double zaHla;
	
	@Column(name = "SPOLJNA_TEMP", columnDefinition = "numeric(5,2)")
	private Double spoljnaTemp;
	
	@Column(name = "UNUTRASNJA_TEMP", columnDefinition = "numeric(5,2)")
	private Double unutrasnjaTemp;
	
	@Column(name = "TEMP_PRAG", columnDefinition = "numeric(5,2)")
	private Double tempPrag;
	
	@Column(name = "BR_DAN_HLA", columnDefinition = "numeric(18,2)")
	private Double brDanHla;
	
	@Column(name = "BR_STEPEN_DAN_HLA", columnDefinition = "numeric(3)")
	private Double brStepenDanHla;
	
	@Column(name = "UK_SNAGA", columnDefinition = "numeric(18,2)")
	private Double ukSnaga;
	
	@Column(name = "POTREBNO_HLA", columnDefinition = "numeric(18,2)")
	private Double potrebnoHla;
	
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

	public Double getPoHla() {
		return poHla;
	}

	public Double getZaHla() {
		return zaHla;
	}

	public Double getSpoljnaTemp() {
		return spoljnaTemp;
	}

	public Double getUnutrasnjaTemp() {
		return unutrasnjaTemp;
	}

	public Double getTempPrag() {
		return tempPrag;
	}

	public Double getBrDanHla() {
		return brDanHla;
	}

	public Double getBrStepenDanHla() {
		return brStepenDanHla;
	}

	public Double getUkSnaga() {
		return ukSnaga;
	}

	public Double getPotrebnoHla() {
		return potrebnoHla;
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

	public void setPoHla(Double poHla) {
		this.poHla = poHla;
	}

	public void setZaHla(Double zaHla) {
		this.zaHla = zaHla;
	}

	public void setSpoljnaTemp(Double spoljnaTemp) {
		this.spoljnaTemp = spoljnaTemp;
	}

	public void setUnutrasnjaTemp(Double unutrasnjaTemp) {
		this.unutrasnjaTemp = unutrasnjaTemp;
	}

	public void setTempPrag(Double tempPrag) {
		this.tempPrag = tempPrag;
	}

	public void setBrDanHla(Double brDanHla) {
		this.brDanHla = brDanHla;
	}

	public void setBrStepenDanHla(Double brStepenDanHla) {
		this.brStepenDanHla = brStepenDanHla;
	}

	public void setUkSnaga(Double ukSnaga) {
		this.ukSnaga = ukSnaga;
	}

	public void setPotrebnoHla(Double potrebnoHla) {
		this.potrebnoHla = potrebnoHla;
	}

	@Override
	public String toString() {
		return "ObjekatHladjenje [id=" + id + ", objekat=" + objekat + ", opis=" + opis + ", poHla=" + poHla
				+ ", zaHla=" + zaHla + ", spoljnaTemp=" + spoljnaTemp + ", unutrasnjaTemp=" + unutrasnjaTemp
				+ ", tempPrag=" + tempPrag + ", brDanHla=" + brDanHla + ", brStepenDanHla=" + brStepenDanHla
				+ ", ukSnaga=" + ukSnaga + ", potrebnoHla=" + potrebnoHla + ", version=" + version + "]";
	}
	
	
	
}	


