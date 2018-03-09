package com.isem.mvc.izvestaj;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_voz_pregled",
        procedureName="izv_voz_pregled",
        resultClasses = { VozPregled.class },
        parameters={
            @StoredProcedureParameter(name="i_voz_id", type=String.class, mode=ParameterMode.IN)
        }
)
public class VozPregled {
	private String kategorija_vozila; 
	private String registracija; 
	private String marka; 
	private String model; 
	private Integer kubikaza; 
	private Integer godiste; 
	private String emisiona_klasa;
	
	
	public VozPregled(String kategorija_vozila, String registracija, String marka, String model, Integer kubikaza,
			Integer godiste, String emisiona_klasa) {
		super();
		this.kategorija_vozila = kategorija_vozila;
		this.registracija = registracija;
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.godiste = godiste;
		this.emisiona_klasa = emisiona_klasa;
	}
	
	public String getKategorija_vozila() {
		return kategorija_vozila;
	}
	public String getRegistracija() {
		return registracija;
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
	public Integer getGodiste() {
		return godiste;
	}
	public String getEmisiona_klasa() {
		return emisiona_klasa;
	}
	
	
}
