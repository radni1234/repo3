package com.isem.mvc.tab;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="graf_efik_obj_kwh_pov",
        procedureName="graf_efik_obj_kwh_pov",
        resultClasses = { Grafik.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
        }
)


public class Grafik {
//	@Id
//	private Long id;
	
	String objekat;
	BigDecimal x_value_kwh;
	BigDecimal y_value_kwh;	
	BigDecimal x_value_co2;
	BigDecimal y_value_co2;	
	BigDecimal x_value_iznos;
	BigDecimal y_value_iznos;	
	
	public Grafik(String objekat, BigDecimal x_value_kwh, BigDecimal y_value_kwh,
			BigDecimal x_value_co2, BigDecimal y_value_co2,
			BigDecimal x_value_iznos, BigDecimal y_value_iznos
			) {
		super();
		this.objekat = objekat;
		this.x_value_kwh = x_value_kwh;
		this.y_value_kwh = y_value_kwh;
		this.x_value_co2 = x_value_co2;
		this.y_value_co2 = y_value_co2;
		this.x_value_iznos = x_value_iznos;
		this.y_value_iznos = y_value_iznos;
	}
	public String getObjekat() {
		return objekat;
	}
	public BigDecimal getX_value_kwh() {
		return x_value_kwh;
	}
	public BigDecimal getY_value_kwh() {
		return y_value_kwh;
	}
	public BigDecimal getX_value_co2() {
		return x_value_co2;
	}
	public BigDecimal getY_value_co2() {
		return y_value_co2;
	}
	public BigDecimal getX_value_iznos() {
		return x_value_iznos;
	}
	public BigDecimal getY_value_iznos() {
		return y_value_iznos;
	}
	
	public void setObjekat(String objekat) {
		this.objekat = objekat;
	}
	public void setX_value_kwh(BigDecimal x_value_kwh) {
		this.x_value_kwh = x_value_kwh;
	}
	public void setY_value_kwh(BigDecimal y_value_kwh) {
		this.y_value_kwh = y_value_kwh;
	}
	public void setX_value_co2(BigDecimal x_value_co2) {
		this.x_value_co2 = x_value_co2;
	}
	public void setY_value_co2(BigDecimal y_value_co2) {
		this.y_value_co2 = y_value_co2;
	}
	public void setX_value_iznos(BigDecimal x_value_iznos) {
		this.x_value_iznos = x_value_iznos;
	}
	public void setY_value_iznos(BigDecimal y_value_iznos) {
		this.y_value_iznos = y_value_iznos;
	}
	
	
}
