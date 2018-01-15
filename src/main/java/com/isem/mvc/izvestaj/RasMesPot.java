package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_ras_mes_pot",
        procedureName="izv_ras_mes_pot",
        resultClasses = { RasMesPot.class },
        parameters={
            @StoredProcedureParameter(name="i_trafo_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class RasMesPot {
	private String godina;
	private String mesec;
	private Double potrosnja;
	private Double emisija;
	private Double iznos;
	
	public RasMesPot(String godina, String mesec, 
			Double potrosnja, Double emisija, Double iznos) {
		super();
		this.godina = godina;
		this.mesec = mesec;
		this.potrosnja = potrosnja;
		this.emisija = emisija;
		this.iznos = iznos;
	}

	public String getGodina() {
		return godina;
	}

	public String getMesec() {
		return mesec;
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
