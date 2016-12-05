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
public class Podgrupa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "GRUPA_ID",
            foreignKey = @ForeignKey(name = "PODGRUPA_FK1")
    )
	private Grupa grupa;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}

	@Override
	public String toString() {
		return "Podgrupa [id=" + id + ", naziv=" + naziv + ", grupa=" + grupa + ", version=" + version + "]";
	}
	
	
}
