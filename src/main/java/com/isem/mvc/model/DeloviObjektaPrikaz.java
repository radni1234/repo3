package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class DeloviObjektaPrikaz {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;

	public Integer getVersion() {
		return version;
	}

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

	@Override
	public String toString() {
		return "DeloviObjektaPrikaz [id=" + id + ", naziv=" + naziv + "]";
	}
	
	
}
