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
	@Column(name = "BLOKIRAN", columnDefinition = "varchar(1) default 'N'")
	private String blokiran;
	@Column(name = "RASVETA", columnDefinition = "varchar(1) default 'N'")
	private String rasveta;
	@Column(name = "ALARM_RACUN", columnDefinition = "varchar(1) default 'N'")
	private String alarmRacun;
	@Column(name = "ALARM_RACUN_START")
	private Date alarmRacunStart;
	@Column(name = "ALARM_TREND", columnDefinition = "varchar(1) default 'N'")
	private String alarmTrend;
	@Column(name = "ALARM_TREND_START")
	private Date alarmTrendStart;
	
	@Version
    @Column(name = "VERSION")
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
	public String getBlokiran() {
		return blokiran;
	}
	public void setBlokiran(String blokiran) {
		this.blokiran = blokiran;
	}
	public String getRasveta() {
		return rasveta;
	}
	public void setRasveta(String rasveta) {
		this.rasveta = rasveta;
	}
	public String getAlarmRacun() {
		return alarmRacun;
	}
	public void setAlarmRacun(String alarmRacun) {
		this.alarmRacun = alarmRacun;
	}
	public Date getAlarmRacunStart() {
		return alarmRacunStart;
	}
	public void setAlarmRacunStart(Date alarmRacunStart) {
		this.alarmRacunStart = alarmRacunStart;
	}
	public String getAlarmTrend() {
		return alarmTrend;
	}
	public void setAlarmTrend(String alarmTrend) {
		this.alarmTrend = alarmTrend;
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