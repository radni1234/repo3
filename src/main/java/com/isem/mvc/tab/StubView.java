package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StubView {
	@Id
	private Long id;
	private Long trafoId;
	private String adresaTrafoa;
	private String stubTip;
	private String adresa;
	private Double lonD;
	private Double latD;	
	private Double gausX;
	private Double gausY;
	private Double rbr;	
	private String adresaSlike;
	
	public Long getId() {
		return id;
	}	
	public Long getTrafoId() {
		return trafoId;
	}
	public String getAdresaTrafoa() {
		return adresaTrafoa;
	}
	public String getStubTip() {
		return stubTip;
	}
	public String getAdresa() {
		return adresa;
	}
	public Double getLonD() {
		return lonD;
	}
	public Double getLatD() {
		return latD;
	}
	public Double getGausX() {
		return gausX;
	}
	public Double getGausY() {
		return gausY;
	}
	public Double getRbr() {
		return rbr;
	}
	public String getAdresaSlike() {
		return adresaSlike;
	}
	
	
}
