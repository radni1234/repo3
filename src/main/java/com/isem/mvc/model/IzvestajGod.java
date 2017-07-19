package com.isem.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "izv_aps_god_pot",
            query = "CALL izv_aps_god_pot(?1, ?2, ?3, ?4)",
            resultClass = IzvestajGod.class
    )
 })

@Entity
public class IzvestajGod {	
	@Id	
	private Long id;
	private String energent;
	private String godina;
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

