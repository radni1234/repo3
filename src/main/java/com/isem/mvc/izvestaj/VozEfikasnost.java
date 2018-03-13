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
	private Double specificnaPotrosnja;
	
	public VozEfikasnost(String vozilo, Double potrosnja, Double kilometraza, Double specificnaPotrosnja) {
		super();
		this.vozilo = vozilo;
		this.potrosnja = potrosnja;
		this.kilometraza = kilometraza;
		this.specificnaPotrosnja = specificnaPotrosnja;
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

	public Double getSpecificnaPotrosnja() {
		return specificnaPotrosnja;
	}
	
	
	
}
