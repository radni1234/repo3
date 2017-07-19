package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_spec_god_pot",
        procedureName="izv_spec_god_pot",
        resultClasses = { SpecGodPot.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_indikator", type=String.class, mode=ParameterMode.IN)
        }
)
public class SpecGodPot {
	private String energent;
	private String godina;
	private Double specKolicina;
	private Double specKolicinaKwh;
	private Double specEmisijaCo2;
	private Double specIznos;	
	
	public SpecGodPot(String energent, String godina, 
			Double specKolicina, Double specKolicinaKwh, Double specEmisijaCo2, Double specIznos) {
		super();
		this.energent = energent;
		this.godina = godina;
		this.specKolicina = specKolicina;
		this.specKolicinaKwh = specKolicinaKwh;
		this.specEmisijaCo2 = specEmisijaCo2;
		this.specIznos = specIznos;
	}

	public String getEnergent() {
		return energent;
	}

	public String getGodina() {
		return godina;
	}

	public Double getKolicina() {
		return specKolicina;
	}

	public Double getKolicinaKwh() {
		return specKolicinaKwh;
	}

	public Double getEmisijaCo2() {
		return specEmisijaCo2;
	}

	public Double getIznos() {
		return specIznos;
	}

	public void setEnergent(String energent) {
		this.energent = energent;
	}

	public void setGodina(String godina) {
		this.godina = godina;
	}

	public void setKolicina(Double specKolicina) {
		this.specKolicina = specKolicina;
	}

	public void setKolicinaKwh(Double specKolicinaKwh) {
		this.specKolicinaKwh = specKolicinaKwh;
	}

	public void setEmisijaCo2(Double specEmisijaCo2) {
		this.specEmisijaCo2 = specEmisijaCo2;
	}

	public void setIznos(Double specIznos) {
		this.specIznos = specIznos;
	}
}
