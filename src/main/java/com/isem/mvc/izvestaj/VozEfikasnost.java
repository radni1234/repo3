package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_voz_efi",
        procedureName="izv_voz_efi",
        resultClasses = { VozEfikasnost.class },
        parameters={
            @StoredProcedureParameter(name="i_voz_id", type=String.class, mode=ParameterMode.IN),     
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class VozEfikasnost {
	private String vozilo;
	private Double potrosnja;
	private Double kilometraza;
	private Double specificnaPotrosnjaKwh;
	private Double specificnaPotrosnjaCo2;
	private Double specificnaPotrosnjaDin;
	
	public VozEfikasnost(String vozilo, Double potrosnja, Double kilometraza, Double specificnaPotrosnjaKwh,
			Double specificnaPotrosnjaCo2, Double specificnaPotrosnjaDin) {
		super();
		this.vozilo = vozilo;
		this.potrosnja = potrosnja;
		this.kilometraza = kilometraza;
		this.specificnaPotrosnjaKwh = specificnaPotrosnjaKwh;
		this.specificnaPotrosnjaCo2 = specificnaPotrosnjaCo2;
		this.specificnaPotrosnjaDin = specificnaPotrosnjaDin;
	}

	public String getVozilo() {
		return vozilo;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getKilometraza() {
		return kilometraza;
	}

	public Double getSpecificnaPotrosnjaKwh() {
		return specificnaPotrosnjaKwh;
	}

	public Double getSpecificnaPotrosnjaCo2() {
		return specificnaPotrosnjaCo2;
	}

	public Double getSpecificnaPotrosnjaDin() {
		return specificnaPotrosnjaDin;
	}
	
	
	
	
	
}
