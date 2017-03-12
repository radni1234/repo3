package com.isem.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "izv_aps_mes_pot",
            query = "CALL izv_aps_mes_pot(?1, ?2, ?3, ?4)",
            resultClass = Izvestaj.class
    )
 })
 @Entity
public class Izvestaj {	
	@Id	
	private Long id;
	private String energent;
	private String godina;
	private String mesec;
	private Double kolicina;
	private Double kolicinaKwh;
	private Double emisijaCo2;
	private Double iznos;	
	
	public Long getId() {
		return id;
	}
	public String getEnergent() {
		return energent;
	}
	public String getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
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
	
	

}
