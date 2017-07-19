package com.isem.mvc.izvestaj;


import java.math.BigDecimal;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="izv_preg_obj",
        procedureName="izv_preg_obj",
        resultClasses = { UkPotEneObj.class },
        parameters={
            @StoredProcedureParameter(name="i_obj_id", type=String.class, mode=ParameterMode.IN)
        }
)

public class PregObj {
	private String nazivObjekta;
	private BigDecimal grejnaPovrsina;	
	private BigDecimal snagaGrejanja;
	private BigDecimal snagaGrejnihTela;
	private BigDecimal snagaElPotrosaca;
	private BigDecimal snagaGrejalica;
	private BigDecimal snagaRasvete;
	
	public PregObj(String nazivObjekta, BigDecimal grejnaPovrsina, BigDecimal snagaGrejanja,
			BigDecimal snagaGrejnihTela, BigDecimal snagaElPotrosaca, BigDecimal snagaGrejalica, BigDecimal snagaRasvete) {
		super();
		this.nazivObjekta = nazivObjekta;
		this.grejnaPovrsina = grejnaPovrsina;
		this.snagaGrejanja = snagaGrejanja;
		this.snagaGrejnihTela = snagaGrejnihTela;
		this.snagaElPotrosaca = snagaElPotrosaca;
		this.snagaGrejalica = snagaGrejalica;
		this.snagaRasvete = snagaRasvete;
	}

	public String getNazivObjekta() {
		return nazivObjekta;
	}

	public void setNazivObjekta(String nazivObjekta) {
		this.nazivObjekta = nazivObjekta;
	}

	public BigDecimal getGrejnaPovrsina() {
		return grejnaPovrsina;
	}

	public void setGrejnaPovrsina(BigDecimal grejnaPovrsina) {
		this.grejnaPovrsina = grejnaPovrsina;
	}

	public BigDecimal getSnagaGrejanja() {
		return snagaGrejanja;
	}

	public void setSnagaGrejanja(BigDecimal snagaGrejanja) {
		this.snagaGrejanja = snagaGrejanja;
	}

	public BigDecimal getSnagaGrejnihTela() {
		return snagaGrejnihTela;
	}

	public void setSnagaGrejnihTela(BigDecimal snagaGrejnihTela) {
		this.snagaGrejnihTela = snagaGrejnihTela;
	}

	public BigDecimal getSnagaElPotrosaca() {
		return snagaElPotrosaca;
	}

	public void setSnagaElPotrosaca(BigDecimal snagaElPotrosaca) {
		this.snagaElPotrosaca = snagaElPotrosaca;
	}

	public BigDecimal getSnagaGrejalica() {
		return snagaGrejalica;
	}

	public void setSnagaGrejalica(BigDecimal snagaGrejalica) {
		this.snagaGrejalica = snagaGrejalica;
	}

	public BigDecimal getSnagaRasvete() {
		return snagaRasvete;
	}

	public void setSnagaRasvete(BigDecimal snagaRasvete) {
		this.snagaRasvete = snagaRasvete;
	}
	

	
	
}

