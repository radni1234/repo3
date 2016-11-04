package com.isem.mvc.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Korisnik {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "opstina_id",
            foreignKey = @ForeignKey(name = "KORISNIK_FK")
    )
	private Opstina opstina;
	
	@ManyToOne
    @JoinColumn(name = "uloga_id",
            foreignKey = @ForeignKey(name = "KORISNIK_FK2")
    )
	private Uloga uloga;
	private String username;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Opstina getOpstina() {
		return opstina;
	}
	public void setOpstina(Opstina opstina) {
		this.opstina = opstina;
	}
	
	public Uloga getUloga() {
		return uloga;
	}
	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}