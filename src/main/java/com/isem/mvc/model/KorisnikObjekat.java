package com.isem.mvc.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.isem.mvc.model.security.User;

@Entity
public class KorisnikObjekat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "KORISNIK_ID",
            foreignKey = @ForeignKey(name = "KORISNIK_OBJEKAT_FK1")
    )
	@JsonProperty(access = Access.WRITE_ONLY)
	private User korisnik;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "KORISNIK_OBJEKAT_FK2")
    )	
	private Objekat objekat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public User getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(User korisnik) {
		this.korisnik = korisnik;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}
	
	
}
