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
public class Energent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_TIP_ID",
            foreignKey = @ForeignKey(name = "ENERGENT_FK1")
    )
	private EnergentTip energentTip;
	
	@ManyToOne
    @JoinColumn(name = "JED_MERE_ID",
            foreignKey = @ForeignKey(name = "ENERGENT_FK2")
    )
	private JedMere jedMere;
	
	@Column(name = "KWH_JM")
	private Double kwhJm;
	
	@Column(name = "EMISIJA")
	private Double emisija;
	
	@Column(name = "SIFRA")
	private Double sifra;
	
	@Column(name = "RACUN", length = 1)
	private String racun;

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

	public JedMere getJedMere() {
		return jedMere;
	}

	public Double getKwhJm() {
		return kwhJm;
	}

	public Double getEmisija() {
		return emisija;
	}

	public Double getSifra() {
		return sifra;
	}

	public String getRacun() {
		return racun;
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

	public void setJedMere(JedMere jedMere) {
		this.jedMere = jedMere;
	}

	public void setKwhJm(Double kwhJm) {
		this.kwhJm = kwhJm;
	}

	public void setEmisija(Double emisija) {
		this.emisija = emisija;
	}

	public void setSifra(Double sifra) {
		this.sifra = sifra;
	}

	public void setRacun(String racun) {
		this.racun = racun;
	}

	@Override
	public String toString() {
		return "Energent [id=" + id + ", naziv=" + naziv + ", energentTip=" + energentTip + ", jedMere=" + jedMere
				+ ", kwhJm=" + kwhJm + ", emisija=" + emisija + ", sifra=" + sifra + ", racun=" + racun + ", version="
				+ version + "]";
	}
	
	
}
