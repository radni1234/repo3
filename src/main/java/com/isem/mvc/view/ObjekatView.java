package com.isem.mvc.view;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ObjekatView {
	@Id
	private Long id;
	private String naziv;
	private String opstina;
	private String mesto;
	private String adresa;
	private String grupa;	
	private String podgrupa;	
	private Integer godIzgr;
	private String projektanFirma;
	private String izvodjacIzg;
	private Integer godRekon;
	private String izvodjacRekon;
	private String tipRek;
	private String koIme;
	private String koPrezime;
	private String koZanimanje;
	private String koTel;
	private String koFaks;
	private String koMob;
	private String koMail;
	private Integer opBrEtaza;
	private Integer opBrojSmena;
	@Column(name = "OP_BR_SATI_1")
	private Integer opBrSati1;
	@Column(name = "OP_BR_SATI_2")
	private Integer opBrSati2;
	@Column(name = "OP_BR_SATI_3")
	private Integer opBrSati3;
	@Column(name = "OP_BR_SATI_4")
	private Integer opBrSati4;
	@Column(name = "OP_BR_OSOBA_1")
	private Integer opBrOsoba1;
	@Column(name = "OP_BR_OSOBA_2")
	private Integer opBrOsoba2;
	@Column(name = "OP_BR_OSOBA_3")
	private Integer opBrOsoba3;
	@Column(name = "OP_BR_OSOBA_4")
	private Integer opBrOsoba4;
	private Integer opBrRdNed;
	private Integer opBrRdGod;
	private Integer opPbrRsDan;
	private Integer opBrNrdZima;
	private Integer opBrNrdLeto;
	private Integer opBrStalnoZap;
	private Integer opBrStalnihKor;
	private Integer opBrKor;
	private Integer opProjBrKor;
	private Double opPopunjenostKap;
	private Integer opBrDnevKor;
	private Double lon;
	private Double lat;
	private String nacinFinansiranja;
	private Double trendTolerancija;
	private String alarmTrend;
	private Date alarmTrendStart;
	public Long getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getOpstina() {
		return opstina;
	}
	public String getMesto() {
		return mesto;
	}
	public String getAdresa() {
		return adresa;
	}
	public String getGrupa() {
		return grupa;
	}
	public String getPodgrupa() {
		return podgrupa;
	}
	public Integer getGodIzgr() {
		return godIzgr;
	}
	public String getProjektanFirma() {
		return projektanFirma;
	}
	public String getIzvodjacIzg() {
		return izvodjacIzg;
	}
	public Integer getGodRekon() {
		return godRekon;
	}
	public String getIzvodjacRekon() {
		return izvodjacRekon;
	}
	public String getTipRek() {
		return tipRek;
	}
	public String getKoIme() {
		return koIme;
	}
	public String getKoPrezime() {
		return koPrezime;
	}
	public String getKoZanimanje() {
		return koZanimanje;
	}
	public String getKoTel() {
		return koTel;
	}
	public String getKoFaks() {
		return koFaks;
	}
	public String getKoMob() {
		return koMob;
	}
	public String getKoMail() {
		return koMail;
	}
	public Integer getOpBrEtaza() {
		return opBrEtaza;
	}
	public Integer getOpBrojSmena() {
		return opBrojSmena;
	}
	public Integer getOpBrSati1() {
		return opBrSati1;
	}
	public Integer getOpBrSati2() {
		return opBrSati2;
	}
	public Integer getOpBrSati3() {
		return opBrSati3;
	}
	public Integer getOpBrSati4() {
		return opBrSati4;
	}
	public Integer getOpBrOsoba1() {
		return opBrOsoba1;
	}
	public Integer getOpBrOsoba2() {
		return opBrOsoba2;
	}
	public Integer getOpBrOsoba3() {
		return opBrOsoba3;
	}
	public Integer getOpBrOsoba4() {
		return opBrOsoba4;
	}
	public Integer getOpBrRdNed() {
		return opBrRdNed;
	}
	public Integer getOpBrRdGod() {
		return opBrRdGod;
	}
	public Integer getOpPbrRsDan() {
		return opPbrRsDan;
	}
	public Integer getOpBrNrdZima() {
		return opBrNrdZima;
	}
	public Integer getOpBrNrdLeto() {
		return opBrNrdLeto;
	}
	public Integer getOpBrStalnoZap() {
		return opBrStalnoZap;
	}
	public Integer getOpBrStalnihKor() {
		return opBrStalnihKor;
	}
	public Integer getOpBrKor() {
		return opBrKor;
	}
	public Integer getOpProjBrKor() {
		return opProjBrKor;
	}
	public Double getOpPopunjenostKap() {
		return opPopunjenostKap;
	}
	public Integer getOpBrDnevKor() {
		return opBrDnevKor;
	}
	public Double getLon() {
		return lon;
	}
	public Double getLat() {
		return lat;
	}
	public String getNacinFinansiranja() {
		return nacinFinansiranja;
	}
	public Double getTrendTolerancija() {
		return trendTolerancija;
	}
	public String getAlarmTrend() {
		return alarmTrend;
	}
	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}
	
	
}
