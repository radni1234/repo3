package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

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
	private User korisnik;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "KORISNIK_OBJEKAT_FK2")
    )
	private Objekat objekat;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public User getKorisnik() {
		return korisnik;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public Integer getVersion() {
		return version;
	}

	public void setKorisnik(User korisnik) {
		this.korisnik = korisnik;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}
	
	
}
