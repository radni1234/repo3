package com.isem.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class ObjekatOstalo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_OSTALO_FK1")
    )
	private Objekat objekat;

	@Column(name = "GOD_IZGR", columnDefinition = "numeric(4)")
	private Integer godIzgr;
	
	@Column(name = "PROJEKTAN_FIRMA", length = 300)
	private String projektanFirma;
	
	@Column(name = "IZVODJAC_IZG", length = 300)
	private String izvodjacIzg;
	
	@Column(name = "GOD_REKON", columnDefinition = "numeric(4)")
	private Integer godRekon;
	
	@Column(name = "IZVODJAC_REKON", length = 300)
	private String izvodjacRekon;
	
	@Column(name = "TIP_REK", length = 4000)
	private String tipRek;
	
	@Column(name = "KO_IME", length = 100)
	private String koIme;
	
	@Column(name = "KO_PREZIME", length = 100)
	private String koPrezime;
	
	@Column(name = "KO_ZANIMANJE", length = 100)
	private String koZanimanje;
	
	@Column(name = "KO_TEL", length = 20)
	private String koTel;
	
	@Column(name = "KO_FAKS", length = 20)
	private String koFaks;
	
	@Column(name = "KO_MOB", length = 20)
	private String koMob;
	
	@Column(name = "KO_MAIL", length = 50)
	private String koMail;
	
	@Column(name = "OP_BR_ETAZA", columnDefinition = "numeric(3)")
	private Integer opBrEtaza;
	
	@Column(name = "OP_BROJ_SMENA", columnDefinition = "numeric(1)")
	private Integer opBrojSmena;
	
	@Column(name = "OP_BR_SATI_1", columnDefinition = "numeric(2)")
	private Integer opBrSati1;
	
	@Column(name = "OP_BR_SATI_2", columnDefinition = "numeric(2)")
	private Integer opBrSati2;
	
	@Column(name = "OP_BR_SATI_3", columnDefinition = "numeric(2)")
	private Integer opBrSati3;
	
	@Column(name = "OP_BR_SATI_4", columnDefinition = "numeric(2)")
	private Integer opBrSati4;
	
	@Column(name = "OP_BR_OSOBA_1", columnDefinition = "numeric(10)")
	private Integer opBrOsoba1;
	
	@Column(name = "OP_BR_OSOBA_2", columnDefinition = "numeric(10)")
	private Integer opBrOsoba2;
	
	@Column(name = "OP_BR_OSOBA_3", columnDefinition = "numeric(10)")
	private Integer opBrOsoba3;
	
	@Column(name = "OP_BR_OSOBA_4", columnDefinition = "numeric(10)")
	private Integer opBrOsoba4;
	
	@Column(name = "OP_BR_RD_NED", columnDefinition = "numeric(1)")
	private Integer opBrRdNed;
	
	@Column(name = "OP_BR_RD_GOD", columnDefinition = "numeric(3)")
	private Integer opBrRdGod;
	
	@Column(name = "OP_PBR_RS_DAN", columnDefinition = "numeric(2)")
	private Integer opPbrRsDan;
	
	@Column(name = "OP_BR_NRD_ZIMA", columnDefinition = "numeric(3)")
	private Integer opBrNrdZima;
	
	@Column(name = "OP_BR_NRD_LETO", columnDefinition = "numeric(3)")
	private Integer opBrNrdLeto;
	
	@Column(name = "OP_BR_STALNO_ZAP", columnDefinition = "numeric(10)")
	private Integer opBrStalnoZap;
	
	@Column(name = "OP_BR_STALNIH_KOR", columnDefinition = "numeric(10)")
	private Integer opBrStalnihKor;
	
	@Column(name = "OP_BR_KOR", columnDefinition = "numeric(10)")
	private Integer opBrKor;
	
	@Column(name = "OP_PROJ_BR_KOR", columnDefinition = "numeric(10)")
	private Integer opProjBrKor;
	
	@Column(name = "OP_POPUNJENOST_KAP", columnDefinition = "numeric(5,2)")
	private Double opPopunjenostKap;
	
	@Column(name = "OP_BR_DNEV_KOR", columnDefinition = "numeric(10)")
	private Integer opBrDnevKor;
	
	@Column(name = "TREND_TOLERANCIJA", columnDefinition = "numeric(5,2)")
	private Double trendTolerancija;
	
	@Column(name = "ALARM_TREND", length = 1)
	private String alarmTrend;
	
	@Column(name = "ALARM_TREND_START")
	private Date alarmTrendStart;	

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
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

	public Double getTrendTolerancija() {
		return trendTolerancija;
	}

	public String getAlarmTrend() {
		return alarmTrend;
	}

	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}

	public Integer getVersion() {
		return version;
	}

	public void setGodIzgr(Integer godIzgr) {
		this.godIzgr = godIzgr;
	}

	public void setProjektanFirma(String projektanFirma) {
		this.projektanFirma = projektanFirma;
	}

	public void setIzvodjacIzg(String izvodjacIzg) {
		this.izvodjacIzg = izvodjacIzg;
	}

	public void setGodRekon(Integer godRekon) {
		this.godRekon = godRekon;
	}

	public void setIzvodjacRekon(String izvodjacRekon) {
		this.izvodjacRekon = izvodjacRekon;
	}

	public void setTipRek(String tipRek) {
		this.tipRek = tipRek;
	}

	public void setKoIme(String koIme) {
		this.koIme = koIme;
	}

	public void setKoPrezime(String koPrezime) {
		this.koPrezime = koPrezime;
	}

	public void setKoZanimanje(String koZanimanje) {
		this.koZanimanje = koZanimanje;
	}

	public void setKoTel(String koTel) {
		this.koTel = koTel;
	}

	public void setKoFaks(String koFaks) {
		this.koFaks = koFaks;
	}

	public void setKoMob(String koMob) {
		this.koMob = koMob;
	}

	public void setKoMail(String koMail) {
		this.koMail = koMail;
	}

	public void setOpBrEtaza(Integer opBrEtaza) {
		this.opBrEtaza = opBrEtaza;
	}

	public void setOpBrojSmena(Integer opBrojSmena) {
		this.opBrojSmena = opBrojSmena;
	}

	public void setOpBrSati1(Integer opBrSati1) {
		this.opBrSati1 = opBrSati1;
	}

	public void setOpBrSati2(Integer opBrSati2) {
		this.opBrSati2 = opBrSati2;
	}

	public void setOpBrSati3(Integer opBrSati3) {
		this.opBrSati3 = opBrSati3;
	}

	public void setOpBrSati4(Integer opBrSati4) {
		this.opBrSati4 = opBrSati4;
	}

	public void setOpBrOsoba1(Integer opBrOsoba1) {
		this.opBrOsoba1 = opBrOsoba1;
	}

	public void setOpBrOsoba2(Integer opBrOsoba2) {
		this.opBrOsoba2 = opBrOsoba2;
	}

	public void setOpBrOsoba3(Integer opBrOsoba3) {
		this.opBrOsoba3 = opBrOsoba3;
	}

	public void setOpBrOsoba4(Integer opBrOsoba4) {
		this.opBrOsoba4 = opBrOsoba4;
	}

	public void setOpBrRdNed(Integer opBrRdNed) {
		this.opBrRdNed = opBrRdNed;
	}

	public void setOpBrRdGod(Integer opBrRdGod) {
		this.opBrRdGod = opBrRdGod;
	}

	public void setOpPbrRsDan(Integer opPbrRsDan) {
		this.opPbrRsDan = opPbrRsDan;
	}

	public void setOpBrNrdZima(Integer opBrNrdZima) {
		this.opBrNrdZima = opBrNrdZima;
	}

	public void setOpBrNrdLeto(Integer opBrNrdLeto) {
		this.opBrNrdLeto = opBrNrdLeto;
	}

	public void setOpBrStalnoZap(Integer opBrStalnoZap) {
		this.opBrStalnoZap = opBrStalnoZap;
	}

	public void setOpBrStalnihKor(Integer opBrStalnihKor) {
		this.opBrStalnihKor = opBrStalnihKor;
	}

	public void setOpBrKor(Integer opBrKor) {
		this.opBrKor = opBrKor;
	}

	public void setOpProjBrKor(Integer opProjBrKor) {
		this.opProjBrKor = opProjBrKor;
	}

	public void setOpPopunjenostKap(Double opPopunjenostKap) {
		this.opPopunjenostKap = opPopunjenostKap;
	}

	public void setOpBrDnevKor(Integer opBrDnevKor) {
		this.opBrDnevKor = opBrDnevKor;
	}

	public void setTrendTolerancija(Double trendTolerancija) {
		this.trendTolerancija = trendTolerancija;
	}

	public void setAlarmTrend(String alarmTrend) {
		this.alarmTrend = alarmTrend;
	}

	public void setAlarmTrendStart(Date alarmTrendStart) {
		this.alarmTrendStart = alarmTrendStart;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	@Override
	public String toString() {
		return "ObjekatOstalo [id=" + id + ", godIzgr=" + godIzgr + ", projektanFirma=" + projektanFirma
				+ ", izvodjacIzg=" + izvodjacIzg + ", godRekon=" + godRekon + ", izvodjacRekon=" + izvodjacRekon
				+ ", tipRek=" + tipRek + ", koIme=" + koIme + ", koPrezime=" + koPrezime + ", koZanimanje="
				+ koZanimanje + ", koTel=" + koTel + ", koFaks=" + koFaks + ", koMob=" + koMob + ", koMail=" + koMail
				+ ", opBrEtaza=" + opBrEtaza + ", opBrojSmena=" + opBrojSmena + ", opBrSati1=" + opBrSati1
				+ ", opBrSati2=" + opBrSati2 + ", opBrSati3=" + opBrSati3 + ", opBrSati4=" + opBrSati4 + ", opBrOsoba1="
				+ opBrOsoba1 + ", opBrOsoba2=" + opBrOsoba2 + ", opBrOsoba3=" + opBrOsoba3 + ", opBrOsoba4="
				+ opBrOsoba4 + ", opBrRdNed=" + opBrRdNed + ", opBrRdGod=" + opBrRdGod + ", opPbrRsDan=" + opPbrRsDan
				+ ", opBrNrdZima=" + opBrNrdZima + ", opBrNrdLeto=" + opBrNrdLeto + ", opBrStalnoZap=" + opBrStalnoZap
				+ ", opBrStalnihKor=" + opBrStalnihKor + ", opBrKor=" + opBrKor + ", opProjBrKor=" + opProjBrKor
				+ ", opPopunjenostKap=" + opPopunjenostKap + ", opBrDnevKor=" + opBrDnevKor + ", trendTolerancija="
				+ trendTolerancija + ", alarmTrend=" + alarmTrend + ", alarmTrendStart=" + alarmTrendStart
				+ ", version=" + version + "]";
	}
	
	

}
