package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_uk_pot_ene_obj",
        procedureName="izv_uk_pot_ene_obj",
        resultClasses = { UkPotEneObj.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)

public class UkPotEneObj {
	private String grupa;
	private String energent;	
	private String objekat;
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;
	
	public UkPotEneObj(String grupa, String energent, String objekat,
			Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
		super();
		this.grupa = grupa;
		this.energent = energent;
		this.objekat = objekat;
		this.kolicina = kolicina;
		this.kolicinaKwh = kolicinaKwh;
		this.emisijaCo2 = emisijaCo2;
		this.iznos = iznos;
	}
	
	public String getGrupa() {
		return grupa;
	}
	public String getEnergent() {
		return energent;
	}
	public String getObjekat() {
		return objekat;
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
	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}
	public void setEnergent(String energent) {
		this.energent = energent;
	}
	public void setObjekat(String objekat) {
		this.objekat = objekat;
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
