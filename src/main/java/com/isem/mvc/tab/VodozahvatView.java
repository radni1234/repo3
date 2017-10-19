package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VodozahvatView {
	@Id
	private Long id;
	private String naziv;
	private String adresa;
	private String napomena;
	private Long javnoPreduzeceId;
	private String javnoPreduzece;
	private Long opstinaId;
	private String opstina;
	private Long mestoId;
	private String mesto;
	
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public String getNapomena() {
		return napomena;
	}
	public Long getJavnoPreduzeceId() {
		return javnoPreduzeceId;
	}
	public String getJavnoPreduzece() {
		return javnoPreduzece;
	}
	public Long getOpstinaId() {
		return opstinaId;
	}
	public String getOpstina() {
		return opstina;
	}
	public Long getMestoId() {
		return mestoId;
	}
	public String getMesto() {
		return mesto;
	}
	
	
}
