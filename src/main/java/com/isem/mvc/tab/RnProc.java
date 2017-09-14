package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "rn_proc",
            query = "CALL rn_proc",
            resultClass = RnProc.class
    ),
    @NamedNativeQuery(
            name = "rn_obj_proc",
            query = "CALL rn_obj_proc(?1)",
            resultClass = RnProc.class
    ),
 })
@Entity
public class RnProc {
	@Id	
	private Long id;
	private String brojilo;
	private String energent;
	private String godina;
	private String mesec;
	private String dobavljac;
	private String rnTip;
	private String brojRn;
	private Date datumr;
	private String napomena;
	private String uneo;
	private Date datumu;
	private String menjao;
	private Date datumm;
//	private Integer version;	
//	private String iznos;
//	private String kolicina;
//	private String cena;
	
	public Long getId() {
		return id;
	}
	public String getBrojilo() {
		return brojilo;
	}
	public String getEnergent() {
		return energent;
	}
	public String getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}
	public String getDobavljac() {
		return dobavljac;
	}
	public String getRnTip() {
		return rnTip;
	}
	public String getBrojRn() {
		return brojRn;
	}
	public Date getDatumr() {
		return datumr;
	}
	public String getNapomena() {
		return napomena;
	}
	public String getUneo() {
		return uneo;
	}
	public Date getDatumu() {
		return datumu;
	}
	public String getMenjao() {
		return menjao;
	}
	public Date getDatumm() {
		return datumm;
	}
//	public Integer getVersion() {
//		return version;
//	}
//	public String getIznos() {
//		return iznos;
//	}
//	public String getKolicina() {
//		return kolicina;
//	}
//	public String getCena() {
//		return cena;
//	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBrojilo(String brojilo) {
		this.brojilo = brojilo;
	}
	public void setEnergent(String energent) {
		this.energent = energent;
	}
	public void setGodina(String godina) {
		this.godina = godina;
	}
	public void setMesec(String mesec) {
		this.mesec = mesec;
	}
	public void setDobavljac(String dobavljac) {
		this.dobavljac = dobavljac;
	}
	public void setRnTip(String rnTip) {
		this.rnTip = rnTip;
	}
	public void setBrojRn(String brojRn) {
		this.brojRn = brojRn;
	}
	public void setDatumr(Date datumr) {
		this.datumr = datumr;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	public void setUneo(String uneo) {
		this.uneo = uneo;
	}
	public void setDatumu(Date datumu) {
		this.datumu = datumu;
	}
	public void setMenjao(String menjao) {
		this.menjao = menjao;
	}
	public void setDatumm(Date datumm) {
		this.datumm = datumm;
	}
//	public void setVersion(Integer version) {
//		this.version = version;
//	}
//	public void setIznos(String iznos) {
//		this.iznos = iznos;
//	}
//	public void setKolicina(String kolicina) {
//		this.kolicina = kolicina;
//	}
//	public void setCena(String cena) {
//		this.cena = cena;
//	}
	
	
	
	
}