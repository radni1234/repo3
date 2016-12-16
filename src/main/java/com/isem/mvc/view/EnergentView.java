package com.isem.mvc.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EnergentView {
	@Id
	private Long id;
	private String naziv;
	private String energentTip;
	private String jedMere;
	private Double kwhJm;
	private Double emisija;
	private Double sifra;
	private String racun;
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getEnergentTip() {
		return energentTip;
	}
	public String getJedMere() {
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
	
	
}
