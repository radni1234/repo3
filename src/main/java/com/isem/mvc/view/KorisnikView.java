package com.isem.mvc.view;

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
	private String rasveta;
	private String alarmRacun;
	private Date alarmRacunStart;	
	private String alarmTrend;
	private Date alarmTrendStart;
	private String blokiran;
	
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
	public String getRasveta() {
		return rasveta;
	}
	public String getAlarmRacun() {
		return alarmRacun;
	}
	public Date getAlarmRacunStart() {
		return alarmRacunStart;
	}
	public String getAlarmTrend() {
		return alarmTrend;
	}
	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}
	public String getBlokiran() {
		return blokiran;
	}
}
