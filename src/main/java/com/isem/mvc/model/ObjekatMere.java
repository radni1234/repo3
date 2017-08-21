package com.isem.mvc.model;

import java.util.Date;

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
public class ObjekatMere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_MERE_FK1")
    )
	private Objekat objekat;

	@Column(name = "NAZIV", nullable = false, length = 200)
	private String naziv;
	
	@Column(name = "OPIS", length = 4000)
	private String opis;
	
	@Column(name = "DATUM_MERE")
	private Date datumMere;
	
	@Column(name = "PROC_USTEDE", columnDefinition = "numeric(5,2)")
	private Double procUstede;
	
	@Column(name = "VREDNOST_INVESTICIJE", columnDefinition = "numeric(18,2)")
	private Double vrednostInvesticije;
	
	@Column(name = "AKTIVIRATI")
	private Boolean aktivirati;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getOpis() {
		return opis;
	}

	public Date getDatumMere() {
		return datumMere;
	}

	public Double getProcUstede() {
		return procUstede;
	}

	public Boolean getAktivirati() {
		return aktivirati;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setDatumMere(Date datumMere) {
		this.datumMere = datumMere;
	}

	public void setProcUstede(Double procUstede) {
		this.procUstede = procUstede;
	}

	public void setAktivirati(Boolean aktivirati) {
		this.aktivirati = aktivirati;
	}	

	public Double getVrednostInvesticije() {
		return vrednostInvesticije;
	}

	public void setVrednostInvesticije(Double vrednostInvesticije) {
		this.vrednostInvesticije = vrednostInvesticije;
	}

	@Override
	public String toString() {
		return "ObjekatMere [id=" + id + ", objekat=" + objekat + ", naziv=" + naziv + ", opis=" + opis + ", datumMere="
				+ datumMere + ", procUstede=" + procUstede + ", aktivirati=" + aktivirati + ", version=" + version
				+ "]";
	}
	
	
}
