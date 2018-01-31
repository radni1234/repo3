package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_vod_god_pot",
        procedureName="izv_vod_god_pot",
        resultClasses = { VodGodPot.class },
        parameters={
            @StoredProcedureParameter(name="i_vod_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class VodGodPot {
	private String godina;
	private Double potrosnja;
	private Double emisija;
	private Double iznos;
	
	public VodGodPot(String godina, 
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