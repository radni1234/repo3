package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProizvodnjaVodeView {
	@Id
	private Long id;
	private Long vodozahvatId;
	private Integer godina;
	private String mesec;
	private Double proizvodnja;
	
	public Long getId() {
		return id;
	}
	public Long getVodozahvatId() {
		return vodozahvatId;
	}
	public Integer getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}
	public Double getProizvodnja() {
		return proizvodnja;
	}
	
	
}
