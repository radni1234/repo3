package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="graf_ene_mix_pie",
        procedureName="graf_ene_mix_pie",
        resultClasses = { GrafikEneMixPie.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)

public class GrafikEneMixPie {
	
	private String energent;	
	
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;
	
	public GrafikEneMixPie(String energent, 
			Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
		super();
		
		this.energent = energent;
		
		this.kolicina = kolicina;
		this.kolicinaKwh = kolicinaKwh;
		this.emisijaCo2 = emisijaCo2;
		this.iznos = iznos;
	}
	
	
	public String getEnergent() {
		return energent;
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

