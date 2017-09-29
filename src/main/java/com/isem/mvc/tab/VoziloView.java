package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoziloView {
	@Id
	private Long id;
	private Long javnoPreduzeceId;
	private String javnoPreduzece;
	private Long kategorijaVozilaId;
	private String kategorijaVozila;
	private String registracija;
	private Integer godiste;
	private String marka;
	private String model;
	private Integer kubikaza;
	private String emisiona_klasa;
	
	public Long getId() {
		return id;
	}
	public Long getJavnoPreduzeceId() {
		return javnoPreduzeceId;
	}
	public String getJavnoPreduzece() {
		return javnoPreduzece;
	}
	public Long getKategorijaVozilaId() {
		return kategorijaVozilaId;
	}
	public String getKategorijaVozila() {
		return kategorijaVozila;
	}
	public Integer getGodiste() {
		return godiste;
	}
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public Integer getKubikaza() {
		return kubikaza;
	}
	public String getEmisiona_klasa() {
		return emisiona_klasa;
	}
	public String getRegistracija() {
		return registracija;
	}
	
	
}
