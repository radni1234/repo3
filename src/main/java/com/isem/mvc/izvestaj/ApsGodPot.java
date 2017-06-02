package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_aps_god_pot",
        procedureName="izv_aps_god_pot",
        resultClasses = { ApsGodPot.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class ApsGodPot {
	private String energent;
	private String godina;
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;	
	
	public ApsGodPot(String energent, String godina, 
			Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
		super();
		this.energent = energent;
		this.godina = godina;
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
