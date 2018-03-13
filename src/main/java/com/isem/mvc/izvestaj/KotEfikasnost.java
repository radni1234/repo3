package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_kot_efi",
        procedureName="izv_kot_efi",
        resultClasses = { KotEfikasnost.class },
        parameters={
            @StoredProcedureParameter(name="i_kot_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class KotEfikasnost {
	private String kotlarnica;
	private Double potrosnja;
	private Double isporucenaEnergija;
	private Double gubitak;
	
	public KotEfikasnost(String kotlarnica, Double potrosnja, Double isporucenaEnergija, Double gubitak) {
		super();
		this.kotlarnica = kotlarnica;
		this.potrosnja = potrosnja;
		this.isporucenaEnergija = isporucenaEnergija;
		this.gubitak = gubitak;
	}

	public String getKotlarnica() {
		return kotlarnica;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getIsporucenaEnergija() {
		return isporucenaEnergija;
	}

	public Double getGubitak() {
		return gubitak;
	}
	
	
	
}
