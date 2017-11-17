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
public class ObjekatDokument {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_DOKUMENT_FK1")
    )
	private Objekat objekat;

	@Column(name = "DOKUMENT", nullable = false, length = 200)
	private String dokument;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}
	

	public Objekat getObjekat() {
		return objekat;
	}

	public String getDokument() {
		return dokument;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setDokument(String dokument) {
		this.dokument = dokument;
	}

	@Override
	public String toString() {
		return "ObjekatDokument [id=" + id + ", objekat=" + objekat + ", dokument=" + dokument + ", version=" + version
				+ "]";
	}
	
	
}
