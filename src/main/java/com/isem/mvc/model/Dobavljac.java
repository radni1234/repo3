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

@Entity
public class Dobavljac {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "MESTO_ID",
            foreignKey = @ForeignKey(name = "DOBAVLJAC_FK1")
    )
	private Mesto mesto;
	
	@Column(name = "TEL", length = 20)
	private String tel;
	
	@Column(name = "MAIL", length = 50)
	private String mail;
	
	@Column(name = "WEB", length = 50)
	private String web;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public String getTel() {
		return tel;
	}

	public String getMail() {
		return mail;
	}

	public String getWeb() {
		return web;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@Override
	public String toString() {
		return "Dobavljac [id=" + id + ", naziv=" + naziv + ", mesto=" + mesto + ", tel=" + tel + ", mail=" + mail
				+ ", web=" + web + ", version=" + version + "]";
	}
	
	
}
