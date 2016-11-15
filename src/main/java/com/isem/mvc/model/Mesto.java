package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mesto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAZIV", length = 200)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "opstina_id",
            foreignKey = @ForeignKey(name = "MESTO_FK")
    )
	private Opstina opstina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Opstina getOpstina() {
		return opstina;
	}

	public void setOpstina(Opstina opstina) {
		this.opstina = opstina;
	}

	@Override
	public String toString() {
		return "Mesto [id=" + id + ", naziv=" + naziv + ", opstina=" + opstina + "]";
	}
	
	
}
