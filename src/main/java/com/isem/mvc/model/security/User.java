package com.isem.mvc.model.security;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.isem.mvc.model.KorisnikObjekat;
import com.isem.mvc.model.Mesto;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "USERNAME", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @Column(name = "PASSWORD", length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

//    @Column(name = "FIRSTNAME", length = 50)
////    @NotNull
//    @Size(min = 4, max = 50)
//    private String firstname;
//
//    @Column(name = "LASTNAME", length = 50)
////    @NotNull
//    @Size(min = 4, max = 50)
//    private String lastname;
//
//    @Column(name = "EMAIL", length = 50)
////    @NotNull
//    @Size(min = 4, max = 50)
//    private String email;

    @Column(name = "ENABLED", columnDefinition="BIT DEFAULT 1", length = 1)
//    @NotNull
    private Boolean enabled;

    @Column(name = "LASTPASSWORDRESETDATE")
    @Temporal(TemporalType.TIMESTAMP)
//    @NotNull
    private Date lastPasswordResetDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")})
    private List<Authority> authorities;
    
//    @ManyToMany
//	@JoinTable(name = "KORISNIK_OBJEKAT",
//		joinColumns = { @JoinColumn(name = "KORISNIK_ID") },
//		inverseJoinColumns = { @JoinColumn(name = "OBJEKAT_ID") })
    @OneToMany(mappedBy = "korisnik", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<KorisnikObjekat> objekti = new HashSet<KorisnikObjekat>();
    
    @ManyToOne
    @JoinColumn(name = "mesto_id",
            foreignKey = @ForeignKey(name = "USER_FK1")
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

    public void setId(Long id) {
        this.id = id;
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

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;        
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }    

	public Set<KorisnikObjekat> getObjekti() {
		return objekti;
	}

	public void setObjekti(Set<KorisnikObjekat> objekti) {
		this.objekti = objekti;
	}

	public Mesto getMesto() {
		return mesto;
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

	public String getMail() {
		return mail;
	}

	public Boolean getBlokiran() {
		return blokiran;
	}

	public Boolean getRasveta() {
		return rasveta;
	}

	public Boolean getAlarmRacun() {
		return alarmRacun;
	}

	public Date getAlarmRacunStart() {
		return alarmRacunStart;
	}

	public Boolean getAlarmTrend() {
		return alarmTrend;
	}

	public Date getAlarmTrendStart() {
		return alarmTrendStart;
	}

	public Integer getVersion() {
		return version;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setBlokiran(Boolean blokiran) {
		this.blokiran = blokiran;
	}

	public void setRasveta(Boolean rasveta) {
		this.rasveta = rasveta;
	}

	public void setAlarmRacun(Boolean alarmRacun) {
		this.alarmRacun = alarmRacun;
	}

	public void setAlarmRacunStart(Date alarmRacunStart) {
		this.alarmRacunStart = alarmRacunStart;
	}

	public void setAlarmTrend(Boolean alarmTrend) {
		this.alarmTrend = alarmTrend;
	}

	public void setAlarmTrendStart(Date alarmTrendStart) {
		this.alarmTrendStart = alarmTrendStart;
	}

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }
    
    
}