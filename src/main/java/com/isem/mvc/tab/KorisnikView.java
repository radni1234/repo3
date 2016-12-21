package com.isem.mvc.tab;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KorisnikView {
	
	@Id
	private Long id;
	private String naziv;
	private String username;
	private String password;	
	private String uloga;
	private String mesto;
	private String opstina;
	private String mail;	
	private String tel;
	private String fax;	
	private String mob;	
	private Boolean rasveta;
	private Boolean alarmRacun;
	private Date alarmRacunStart;	
	private Boolean alarmTrend;
	private Date alarmTrendStart;
	private Boolean blokiran;
	
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getMail() {
		return mail;
	}
	public String getUloga() {
		return uloga;
	}
	public String getMesto() {
		return mesto;
	}
	public String getOpstina() {
		return opstina;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public String getTel() {
		return tel;
	}
	public String getFax() {
		return fax;
	}
	public String getMob() {
		return mob;
	}

	public Date getAlarmRacunStart() {
		return alarmRacunStart;
	}

	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}
	public Boolean getRasveta() {
		return rasveta;
	}
	public Boolean getAlarmRacun() {
		return alarmRacun;
	}
	public Boolean getAlarmTrend() {
		return alarmTrend;
	}
	public Boolean getBlokiran() {
		return blokiran;
	}
	
	

}
