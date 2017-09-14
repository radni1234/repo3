package com.isem.mvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class RnKotlarnica {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "BROJILO_KOTLARNICA_ID",
            foreignKey = @ForeignKey(name = "RN_KOTLARNICA_FK1")
    )
	private BrojiloKotlarnica brojiloKotlarnica;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "RN_KOTLARNICA_FK2")
    )
	private Energent energent;
	
	@ManyToOne
    @JoinColumn(name = "DOBAVLJAC_ID",
            foreignKey = @ForeignKey(name = "RN_KOTLARNICA_FK5")
    )
	private Dobavljac dobavljac;
	
	@ManyToOne
    @JoinColumn(name = "RN_TIP_ID",
            foreignKey = @ForeignKey(name = "RN_KOTLARNICA_FK6")
    )
	private RnTip rnTip;
	
	@Column(name = "BROJ_RN", length = 100)
	private String brojRn;
	
	@Column(name = "DATUMR")
	private Date datumr;
	
	@Column(name = "NAPOMENA", length = 2000)
	private String napomena;
	
	@Column(name = "UNEO", length = 100)
	@CreatedBy
	private String uneo;
	
	@Column(name = "DATUMU")
	@CreatedDate
	private Date datumu;
	
	@Column(name = "MENJAO", length = 100)
	@LastModifiedBy
	private String menjao;
	
	@Column(name = "DATUMM")
	@LastModifiedDate
	private Date datumm;
	
	@Column(name = "IZNOS", columnDefinition = "numeric(18,2)")
	private Double iznos;
	
	@Column(name = "KOLICINA", columnDefinition = "numeric(18,2)")
	private Double kolicina;
	
	@Column(name = "STARI_ID")
	private Long stariId;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
	
	@OneToMany(mappedBy="rn", orphanRemoval=true, cascade = CascadeType.ALL)
	private List<RnStavkeKotlarnica> rnStavke;
	
	public void addRnStavke(RnStavkeKotlarnica rnStav) {
       if (rnStav == null) {
           return;
       }
       rnStav.setRn(this);
       if (rnStavke == null) {
    	   rnStavke = new ArrayList<RnStavkeKotlarnica>();
    	   rnStavke.add(rnStav);
       } else if (!rnStavke.contains(rnStav)) {
    	   rnStavke.add(rnStav);
       }
    }

	public Long getId() {
		return id;
	}

	public BrojiloKotlarnica getBrojiloKotlarnica() {
		return brojiloKotlarnica;
	}

	public Energent getEnergent() {
		return energent;
	}

	public Dobavljac getDobavljac() {
		return dobavljac;
	}

	public RnTip getRnTip() {
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
	
	public Double getIznos() {
		return iznos;
	}

	public Double getKolicina() {
		return kolicina;
	}

	public Long getStariId() {
		return stariId;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public List<RnStavkeKotlarnica> getRnStavke() {
		return rnStavke;
	}

	public void setBrojiloKotlarnica(BrojiloKotlarnica brojiloKotlarnica) {
		this.brojiloKotlarnica = brojiloKotlarnica;
	}

	public void setEnergent(Energent energent) {
		this.energent = energent;
	}

	public void setDobavljac(Dobavljac dobavljac) {
		this.dobavljac = dobavljac;
	}

	public void setRnTip(RnTip rnTip) {
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
		

	public void setIznos(Double iznos) {
		this.iznos = iznos;
	}

	public void setKolicina(Double kolicina) {
		this.kolicina = kolicina;
	}

	public void setStariId(Long stariId) {
		this.stariId = stariId;
	}
	
	public void setRnStavke(List<RnStavkeKotlarnica> rnStavke) {
		this.rnStavke = rnStavke;
	}
	
}
