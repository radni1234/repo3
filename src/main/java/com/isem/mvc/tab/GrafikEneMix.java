package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="graf_ene_mix",
        procedureName="graf_ene_mix",
        resultClasses = { GrafikEneMix.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)

public class GrafikEneMix {
	
	private String energent;	
	private String godina;
	private Double mesec;
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;
	
	public GrafikEneMix(String energent,String godina,Double mesec, 
			Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
		super();
		
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.kolicina = kolicina;
		this.kolicinaKwh = kolicinaKwh;
		this.emisijaCo2 = emisijaCo2;
		this.iznos = iznos;
	}
	
	
	public String getEnergent() {
		return energent;
	}
	
	public String getGodina() {
		return godina;
	}
	
	public Double getMesec() {
		return mesec;
	}
	
	public Double getKolicina() {
		return kolicina;
	}
	public Double getKolicinaKwh() {
		return kolicinaKwh;
	}
	public Double getEmisijaCo2() {
		return emisijaCo2;
	}
	public Double getIznos() {
		return iznos;
	}
	
	public void setEnergent(String energent) {
		this.energent = energent;
	}
	
	public void setGodina(String godina) {
		this.godina = godina;
	}
	
	public void setMmesec(Double mesec) {
		this.mesec = mesec;
	}
	
	public void setKolicina(Double kolicina) {
		this.kolicina = kolicina;
	}
	public void setKolicinaKwh(Double kolicinaKwh) {
		this.kolicinaKwh = kolicinaKwh;
	}
	public void setEmisijaCo2(Double emisijaCo2) {
		this.emisijaCo2 = emisijaCo2;
	}
	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}
	
	
}


