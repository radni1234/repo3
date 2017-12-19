package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Version;

@SqlResultSetMapping(name="Lov",
classes = {
 @ConstructorResult(targetClass = com.isem.mvc.lov.Lov.class,
   columns = {@ColumnResult(name="id"), @ColumnResult(name="name")}
 )}
)

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
	
	@Column(name = "PRIMARNA_ENERGIJA")
	private Double primarnaEnergija;
	
	@Column(name = "FINALNA_ENERGIJA")
	private Double finalnaEnergija;
	
	@Column(name = "SIFRA")
	private Double sifra;
	
	@Column(name = "RACUN", length = 1)
	private Boolean racun;
	
	@Column(name = "VOZILO")
	private Boolean vozilo;

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
	

	public Double getPrimarnaEnergija() {
		return primarnaEnergija;
	}

	public Double getFinalnaEnergija() {
		return finalnaEnergija;
	}

	public Double getSifra() {
		return sifra;
	}

	public Boolean getRacun() {
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

	public void setPrimarnaEnergija(Double primarnaEnergija) {
		this.primarnaEnergija = primarnaEnergija;
	}

	public void setFinalnaEnergija(Double finalnaEnergija) {
		this.finalnaEnergija = finalnaEnergija;
	}

	public void setSifra(Double sifra) {
		this.sifra = sifra;
	}

	public void setRacun(Boolean racun) {
		this.racun = racun;
	}	

	public Boolean getVozilo() {
		return vozilo;
	}

	public void setVozilo(Boolean vozilo) {
		this.vozilo = vozilo;
	}

	@Override
	public String toString() {
		return "Energent [id=" + id + ", naziv=" + naziv + ", energentTip=" + energentTip + ", jedMere=" + jedMere
				+ ", kwhJm=" + kwhJm + ", emisija=" + emisija + ", sifra=" + sifra + ", racun=" + racun + ", version="
				+ version + "]";
	}
	
	
}
