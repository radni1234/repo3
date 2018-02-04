package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_kot_pot_po_kot",
        procedureName="izv_kot_pot_po_kot",
        resultClasses = { KotPotPoKot.class },
        parameters={
            @StoredProcedureParameter(name="i_kot_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_ene_tip_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)
public class KotPotPoKot {
	private String energent;	
	private String kotlarnica;
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;
	
	public KotPotPoKot(String energent, String kotlarnica,
			Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
		super();

		this.energent = energent;
		this.kotlarnica = kotlarnica;
		this.kolicina = kolicina;
		this.kolicinaKwh = kolicinaKwh;
		this.emisijaCo2 = emisijaCo2;
		this.iznos = iznos;
	}
	

	public String getEnergent() {
		return energent;
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
	public String getKotlarnica() {
		return kotlarnica;
	}
	public void setKotlarnica(String kotlarnica) {
		this.kotlarnica = kotlarnica;
	}
	
	
}
