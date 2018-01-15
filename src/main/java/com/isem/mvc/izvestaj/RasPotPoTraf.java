package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_ras_pot_po_traf",
        procedureName="izv_ras_pot_po_traf",
        resultClasses = { RasPotPoTraf.class },
        parameters={
            @StoredProcedureParameter(name="i_trafo_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class RasPotPoTraf {
	private String trafo;
	private Double potrosnja;
	private Double emisija;
	private Double iznos;
	
	public RasPotPoTraf(String trafo, 
			Double potrosnja, Double emisija, Double iznos) {
		super();
		this.trafo = trafo;
		this.potrosnja = potrosnja;
		this.emisija = emisija;
		this.iznos = iznos;
	}

	public String getTrafo() {
		return trafo;
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
