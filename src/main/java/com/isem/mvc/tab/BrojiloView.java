package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BrojiloView {
	@Id
	private Long id;
	private String sifra_brojila;
	private String opis;
	private Long objekatId;
	private String objekat;
	private String brojilo_tip;
	private String brojilo_vrsta;	
	private String rezim_merenja;
	private String vodece_brojilo;
	private String procenat;
	private String obracunski_period;
	private String automatski;
	
	public Long getId() {
		return id;
	}
	public String getSifra_brojila() {
		return sifra_brojila;
	}
	public String getOpis() {
		return opis;
	}
	public String getObjekat() {
		return objekat;
	}
	public String getBrojilo_tip() {
		return brojilo_tip;
	}
	public String getBrojilo_vrsta() {
		return brojilo_vrsta;
	}
	public String getRezim_merenja() {
		return rezim_merenja;
	}
	public String getVodece_brojilo() {
		return vodece_brojilo;
	}
	public String getProcenat() {
		return procenat;
	}
	public String getObracunski_period() {
		return obracunski_period;
	}
	public String getAutomatski() {
		return automatski;
	}
	public Long getObjekatId() {
		return objekatId;
	}
	
	
	
}
