package com.isem.mvc.tab;

import java.math.BigDecimal;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
	        name="graf_cusum_pre",
	        procedureName="graf_cusum_pre",
	        resultClasses = { Grafik.class },
	        parameters={
	            @StoredProcedureParameter(name="i_mera_id", type=String.class, mode=ParameterMode.IN)
	        }
	),	
	@NamedStoredProcedureQuery(
	        name="graf_cusum_posle",
	        procedureName="graf_cusum_posle",
	        resultClasses = { Grafik.class },
	        parameters={
	            @StoredProcedureParameter(name="i_mera_id", type=String.class, mode=ParameterMode.IN)
	        }
	)

})

public class GrafikCusum {
	Integer god;
	Integer mes;
	BigDecimal x_value;
	BigDecimal y_value;
	
	public GrafikCusum(Integer god, Integer mes, BigDecimal x_value, BigDecimal y_value) {
		super();
		this.god = god;
		this.mes = mes;
		this.x_value = x_value;
		this.y_value = y_value;
	}

	public Integer getGod() {
		return god;
	}

	public Integer getMes() {
		return mes;
	}

	public BigDecimal getX_value() {
		return x_value;
	}

	public BigDecimal getY_value() {
		return y_value;
	}		
	
}
