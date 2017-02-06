package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BrojiloVrstaKoloneView {
	@Id
	private Long id;
	private String naziv;
	private String opis;
	private Integer rbr;
	private String brojiloVrsta;
	private String jedinicaMere;
	private String kolonaTip;
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getOpis() {
		return opis;
	}
	public Integer getRbr() {
		return rbr;
	}
	public String getBrojiloVrsta() {
		return brojiloVrsta;
	}
	public String getJedinicaMere() {
		return jedinicaMere;
	}
	public String getKolonaTip() {
		return kolonaTip;
	}
	
	
}
