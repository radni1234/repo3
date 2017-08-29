package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BrojiloVrstaKoloneView {
	@Id
	private Long id;
	private String naziv;
	private String opis;
	private Integer rbr;
	private Long brojiloVrstaId;
	private String brojiloVrsta;
	private String jedinicaMere;
	private String kolonaTip;
	private String obavezno;
	private String formula;
	private String dozvoljeneVrednosti;
	
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getOpis() {
		return opis;
	}
	public Integer getRbr() {
		return rbr;
	}	
	public Long getBrojiloVrstaId() {
		return brojiloVrstaId;
	}
	public String getBrojiloVrsta() {
		return brojiloVrsta;
	}
	public String getJedinicaMere() {
		return jedinicaMere;
	}
	public String getKolonaTip() {
		return kolonaTip;
	}
	public String getObavezno() {
		return obavezno;
	}
	public String getFormula() {
		return formula;
	}
	public String getDozvoljeneVrednosti() {
		return dozvoljeneVrednosti;
	}	
	
}
