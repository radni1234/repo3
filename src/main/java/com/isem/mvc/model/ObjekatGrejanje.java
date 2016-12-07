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
public class ObjekatGrejanje {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_GREJANJE_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "OPIS", nullable = false, length = 1000)
	private String opis;
	
	@Column(name = "PO_GREJ", columnDefinition = "numeric(18,2)")
	private Double poGrej;
	
	@Column(name = "ZA_GREJ", columnDefinition = "numeric(18,2)")
	private Double zaGrej;
	
	@Column(name = "PO_KORISNA", columnDefinition = "numeric(18,2)")
	private Double poKorisna;
	
	@Column(name = "PO_PROZORA_UCESCE", columnDefinition = "numeric(18,2)")
	private Double poProzoraUcesce;
	
	@Column(name = "SPOLJNA_TEMP", columnDefinition = "numeric(5,2)")
	private Double spoljnaTemp;
	
	@Column(name = "UNUTRASNJA_TEMP", columnDefinition = "numeric(5,2)")
	private Double unutrasnjaTemp;
	
	@Column(name = "TEMP_PRAG", columnDefinition = "numeric(5,2)")
	private Double tempPrag;
	
	@Column(name = "BR_DAN_GREJ", columnDefinition = "numeric(3)")
	private Double brDanGrej;
	
	@Column(name = "BR_STEPEN_DAN_GREJ", columnDefinition = "numeric(18,2)")
	private Double brStepenDanGrej;
	
	@Column(name = "UK_SNAGA", columnDefinition = "numeric(18,2)")
	private Double ukSnaga;
	
	@Column(name = "POTREBNO_GREJ", columnDefinition = "numeric(18,2)")
	private Double potrebnoGrej;
	
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

	public Double getPoGrej() {
		return poGrej;
	}

	public Double getZaGrej() {
		return zaGrej;
	}

	public Double getPoKorisna() {
		return poKorisna;
	}

	public Double getPoProzoraUcesce() {
		return poProzoraUcesce;
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

	public Double getBrDanGrej() {
		return brDanGrej;
	}

	public Double getBrStepenDanGrej() {
		return brStepenDanGrej;
	}

	public Double getUkSnaga() {
		return ukSnaga;
	}

	public Double getPotrebnoGrej() {
		return potrebnoGrej;
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

	public void setPoGrej(Double poGrej) {
		this.poGrej = poGrej;
	}

	public void setZaGrej(Double zaGrej) {
		this.zaGrej = zaGrej;
	}

	public void setPoKorisna(Double poKorisna) {
		this.poKorisna = poKorisna;
	}

	public void setPoProzoraUcesce(Double poProzoraUcesce) {
		this.poProzoraUcesce = poProzoraUcesce;
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

	public void setBrDanGrej(Double brDanGrej) {
		this.brDanGrej = brDanGrej;
	}

	public void setBrStepenDanGrej(Double brStepenDanGrej) {
		this.brStepenDanGrej = brStepenDanGrej;
	}

	public void setUkSnaga(Double ukSnaga) {
		this.ukSnaga = ukSnaga;
	}

	public void setPotrebnoGrej(Double potrebnoGrej) {
		this.potrebnoGrej = potrebnoGrej;
	}

	@Override
	public String toString() {
		return "ObjekatGrejanje [id=" + id + ", objekat=" + objekat + ", opis=" + opis + ", poGrej=" + poGrej
				+ ", zaGrej=" + zaGrej + ", poKorisna=" + poKorisna + ", poProzoraUcesce=" + poProzoraUcesce
				+ ", spoljnaTemp=" + spoljnaTemp + ", unutrasnjaTemp=" + unutrasnjaTemp + ", tempPrag=" + tempPrag
				+ ", brDanGrej=" + brDanGrej + ", brStepenDanGrej=" + brStepenDanGrej + ", ukSnaga=" + ukSnaga
				+ ", potrebnoGrej=" + potrebnoGrej + ", version=" + version + "]";
	}
	
	
}
