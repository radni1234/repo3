package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="graf_rasveta_god",
        procedureName="graf_rasveta_god",
        resultClasses = { Grafik.class },
        parameters={
            @StoredProcedureParameter(name="i_trafo_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)


public class GrafikRasvetaGod {
//	@Id
//	private Long id;
	
	private Double kwh;	
	private Double iznos;
	private String godina;
	private Double mesec;	
	
	public GrafikRasvetaGod(String godina, Double mesec, Double kwh, Double iznos)
			 {
		super();
		this.godina = godina;
		this.mesec = mesec;
		this.kwh = kwh;
		this.iznos = iznos;
		
	}
	
	
	public String getGodina() {
		return godina;
	}
	
	public Double getMesec() {
		return mesec;
	}
	public Double getKwh() {
		return kwh;
	}

	public Double getIznos() {
		return iznos;
	}
	
	public void setGodina(String godina) {
		this.godina = godina;
	}
	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}
	public void setMesec(Double mesec) {
		this.mesec = mesec;
	}
	
	
}

