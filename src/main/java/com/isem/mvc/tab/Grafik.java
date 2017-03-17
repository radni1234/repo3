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
	BigDecimal x_value;
	BigDecimal y_value;	
	
	public Grafik(String objekat, BigDecimal x_value, BigDecimal y_value) {
		super();
		this.objekat = objekat;
		this.x_value = x_value;
		this.y_value = y_value;
	}
	public String getObjekat() {
		return objekat;
	}
	public BigDecimal getX_value() {
		return x_value;
	}
	public BigDecimal getY_value() {
		return y_value;
	}
	public void setObjekat(String objekat) {
		this.objekat = objekat;
	}
	public void setX_value(BigDecimal x_value) {
		this.x_value = x_value;
	}
	public void setY_value(BigDecimal y_value) {
		this.y_value = y_value;
	}
	
	
}
