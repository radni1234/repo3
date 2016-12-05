package com.isem.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Korisnik {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String username;
	private String password;
	
	@ManyToOne
    @JoinColumn(name = "uloga_id",
            foreignKey = @ForeignKey(name = "KORISNIK_FK1")
    )
	private Uloga uloga;
	
	@ManyToOne
    @JoinColumn(name = "mesto_id",
            foreignKey = @ForeignKey(name = "KORISNIK_FK2")
    )
	private Mesto mesto;
	
	@Column(name = "NAZIV", length = 200)
	private String naziv;
	@Column(name = "TEL", length = 50)
	private String tel;
	@Column(name = "FAX", length = 50)
	private String fax;
	@Column(name = "MOB", length = 50)
	private String mob;
	@Column(name = "MAIL", length = 100)
	private String mail;
	@Column(name = "BLOKIRAN")
	private Boolean blokiran;
	@Column(name = "RASVETA")
	private Boolean rasveta;
	@Column(name = "ALARM_RACUN")
	private Boolean alarmRacun;
	@Column(name = "ALARM_RACUN_START")
	private Date alarmRacunStart;
	@Column(name = "ALARM_TREND")
	private Boolean alarmTrend;
	@Column(name = "ALARM_TREND_START")
	private Date alarmTrendStart;
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;	
	
	public Long getId() {
		return id;
	}
		
	public Integer getVersion() {
		return version;
	}

	public Uloga getUloga() {
		return uloga;
	}
	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	public Mesto getMesto() {
		return mesto;
	}
	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public Boolean getBlokiran() {
		return blokiran;
	}

	public void setBlokiran(Boolean blokiran) {
		this.blokiran = blokiran;
	}

	public Boolean getRasveta() {
		return rasveta;
	}

	public void setRasveta(Boolean rasveta) {
		this.rasveta = rasveta;
	}

	public Boolean getAlarmRacun() {
		return alarmRacun;
	}

	public void setAlarmRacun(Boolean alarmRacun) {
		this.alarmRacun = alarmRacun;
	}

	public Boolean getAlarmTrend() {
		return alarmTrend;
	}

	public void setAlarmTrend(Boolean alarmTrend) {
		this.alarmTrend = alarmTrend;
	}

	public Date getAlarmRacunStart() {
		return alarmRacunStart;
	}
	public void setAlarmRacunStart(Date alarmRacunStart) {
		this.alarmRacunStart = alarmRacunStart;
	}
	
	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}
	public void setAlarmTrendStart(Date alarmTrendStart) {
		this.alarmTrendStart = alarmTrendStart;
	}

	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", username=" + username + ", password=" + password + ", uloga=" + uloga
				+ ", mesto=" + mesto + ", naziv=" + naziv + ", tel=" + tel + ", fax=" + fax + ", mob=" + mob + ", mail="
				+ mail + ", blokiran=" + blokiran + ", rasveta=" + rasveta + ", alarmRacun=" + alarmRacun
				+ ", alarmRacunStart=" + alarmRacunStart + ", alarmTrend=" + alarmTrend + ", alarmTrendStart="
				+ alarmTrendStart + ", version=" + version + "]";
	}
	
	
	
	
}