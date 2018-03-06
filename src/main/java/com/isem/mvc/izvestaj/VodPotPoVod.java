package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_vod_pot_po_vod",
        procedureName="izv_vod_pot_po_vod",
        resultClasses = { VodPotPoVod.class },
        parameters={
            @StoredProcedureParameter(name="i_vod_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class VodPotPoVod {
	private String vodozahvat;
	private Double potrosnja;
	private Double emisija;
	private Double iznos;
	private Double proizvodnja;
	private Double specProizvodnja;
	
	public VodPotPoVod(String vodozahvat, 
			Double potrosnja, Double emisija, Double iznos) {
		super();
		this.vodozahvat = vodozahvat;
		this.potrosnja = potrosnja;
		this.emisija = emisija;
		this.iznos = iznos;
	}
	
	public VodPotPoVod(String vodozahvat, 
			Double potrosnja, Double emisija, Double iznos, Double proizvodnja, Double specProizvodnja) {
		super();
		this.vodozahvat = vodozahvat;
		this.potrosnja = potrosnja;
		this.emisija = emisija;
		this.iznos = iznos;
		this.proizvodnja = proizvodnja;
		this.specProizvodnja = specProizvodnja;
	}

	public String getVodozahvat() {
		return vodozahvat;
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

	public Double getProizvodnja() {
		return proizvodnja;
	}

	public Double getSpecProizvodnja() {
		return specProizvodnja;
	}
	
	
}
