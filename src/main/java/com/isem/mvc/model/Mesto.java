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
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;	

	public Long getId() {
		return id;
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
	
	public Integer getVersion() {
		return version;
	}

	
	@Override
	public String toString() {
		return "Mesto [id=" + id + ", naziv=" + naziv + ", opstina=" + opstina + "]";
	}
	
	
}
