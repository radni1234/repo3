package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JavnoPreduzeceView {
	@Id
	private Long id;
	private String naziv;
	private Long opstinaId;
	private String opstina;
	private Long mestoId;
	private String mesto;
	private String adresa;
	private String kontaktOsoba;
	private String koZanimanje;
	private String koTel;
	private String koFaks;
	private String koMob;
	private String koMail;	
	private Integer version;
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}	
	public String getKontaktOsoba() {
		return kontaktOsoba;
	}	
	public Long getOpstinaId() {
		return opstinaId;
	}
	public Long getMestoId() {
		return mestoId;
	}
	public String getOpstina() {
		return opstina;
	}
	public String getMesto() {
		return mesto;
	}
	public String getAdresa() {
		return adresa;
	}
	public String getKoZanimanje() {
		return koZanimanje;
	}
	public String getKoTel() {
		return koTel;
	}
	public String getKoFaks() {
		return koFaks;
	}
	public String getKoMob() {
		return koMob;
	}
	public String getKoMail() {
		return koMail;
	}
	public Integer getVersion() {
		return version;
	}
	
	
}
