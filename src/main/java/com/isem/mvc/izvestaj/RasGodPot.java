package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_ras_god_pot",
        procedureName="izv_ras_god_pot",
        resultClasses = { RasGodPot.class },
        parameters={
            @StoredProcedureParameter(name="i_trafo_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class RasGodPot {
	private String godina;
	private Double potrosnja;
	private Double emisija;
	private Double iznos;
	
	public RasGodPot(String godina, 
			Double potrosnja, Double emisija, Double iznos) {
		super();
		this.godina = godina;
		this.potrosnja = potrosnja;
		this.emisija = emisija;
		this.iznos = iznos;
	}

	public String getGodina() {
		return godina;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getEmisija() {
		return emisija;
	}

	public Double getIznos() {
		return iznos;
	}
	
	
}
