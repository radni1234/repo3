package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SvetiljkaView {
	@Id
	private Long id;
	private Long stubId;
	private String stubAdresa;
	private String svetiljkaTip;
	private Double svetiljkaSnaga;
	private Long kom;
	
	public Long getId() {
		return id;
	}
	public Long getStubId() {
		return stubId;
	}
	public String getStubAdresa() {
		return stubAdresa;
	}
	public String getSvetiljkaTip() {
		return svetiljkaTip;
	}
	public Long getKom() {
		return kom;
	}
	public Double getSvetiljkaSnaga() {
		return svetiljkaSnaga;
	}
	
		
	
}
