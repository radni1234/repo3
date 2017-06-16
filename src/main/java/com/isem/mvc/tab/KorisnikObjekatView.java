package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KorisnikObjekatView {
	@Id
	private Long id;
	private Long korisnikId;
	private String korisnik;
	private Long objekatId;
	private String objekat;
	
	public Long getId() {
		return id;
	}
	public Long getKorisnikId() {
		return korisnikId;
	}
	public String getKorisnik() {
		return korisnik;
	}
	public Long getObjekatId() {
		return objekatId;
	}
	public String getObjekat() {
		return objekat;
	}
	
	
}
