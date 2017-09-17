package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrafoView {
	@Id
	private Long id;
	private Long opstinaId;
	private String opstina;
	private Long mestoId;
	private String mesto;
	private String adresa;
	private String lonD;
	private String latD;
	private String gausX;
	private String gausY;
	private Long brojIntalisanihSvetiljki;
	private Long snagaIntalisanihSvetiljki;
	
	public Long getId() {
		return id;
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
	public String getAdresa() {
		return adresa;
	}
	public String getLonD() {
		return lonD;
	}
	public String getLatD() {
		return latD;
	}
	public String getGausX() {
		return gausX;
	}
	public String getGausY() {
		return gausY;
	}
	public Long getBrojIntalisanihSvetiljki() {
		return brojIntalisanihSvetiljki;
	}
	public Long getSnagaIntalisanihSvetiljki() {
		return snagaIntalisanihSvetiljki;
	}
	
	
}
