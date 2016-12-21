package com.isem.mvc.tab;

import java.util.Date;

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
	private Integer opBrRdNed;
	private Integer opBrRdGod;
	private Integer opPbrRsDan;
	private Integer opBrNrdZima;
	private Integer opBrNrdLeto;
	private Integer opBrStalnoZap;
	private Integer opBrKor;
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
	public Integer getOpBrKor() {
		return opBrKor;
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
