package com.isem.mvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Rn {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "BROJILO_ID",
            foreignKey = @ForeignKey(name = "RN_FK1")
    )
	private Brojilo brojilo;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "RN_FK2")
    )
	private Energent energent;
	
//	@ManyToOne
//    @JoinColumn(name = "GODINA_ID",
//            foreignKey = @ForeignKey(name = "RN_FK3")
//    )
//	private Godina godina;
//	
//	@ManyToOne
//    @JoinColumn(name = "MESEC_ID",
//            foreignKey = @ForeignKey(name = "RN_FK4")
//    )
//	private Mesec mesec;
	
	@ManyToOne
    @JoinColumn(name = "DOBAVLJAC_ID",
            foreignKey = @ForeignKey(name = "RN_FK5")
    )
	private Dobavljac dobavljac;
	
	@ManyToOne
    @JoinColumn(name = "RN_TIP_ID",
            foreignKey = @ForeignKey(name = "RN_FK6")
    )
	private RnTip rnTip;
	
	@Column(name = "BROJ_RN", length = 100)
	private String brojRn;
	
	@Column(name = "DATUMR")
	private Date datumr;
	
	@Column(name = "NAPOMENA", length = 2000)
	private String napomena;
	
	@Column(name = "UNEO", length = 100)
	private String uneo;
	
	@Column(name = "DATUMU")
	private Date datumu;
	
	@Column(name = "MENJAO", length = 100)
	private String menjao;
	
	@Column(name = "DATUMM")
	private Date datumm;
	
	@Column(name = "IZNOS", columnDefinition = "numeric(18,2)")
	private Double iznos;
	
	@Column(name = "KOLICINA", columnDefinition = "numeric(18,2)")
	private Double kolicina;
	
	@Column(name = "KOLICINA_KWH", columnDefinition = "numeric(18,2)")
	private Double kolicinaKwh;
	
	@Column(name = "KOLICINA_KWH_POV", columnDefinition = "numeric(18,2)")
	private Double kolicinaKwhPov;
	
	@Column(name = "KOLICINA_KWH_ZAP", columnDefinition = "numeric(18,2)")
	private Double kolicinaKwhZap;
	
	@Column(name = "KOLICINA_KWH_KOR", columnDefinition = "numeric(18,2)")
	private Double kolicinaKwhKor;	
	
	@Column(name = "KOLICINA_PRIM_ENE", columnDefinition = "numeric(18,2)")
	private Double kolicinaPrimEne;	
	
	@Column(name = "KOLICINA_FIN_ENE", columnDefinition = "numeric(18,2)")
	private Double kolicinaFinEne;	

	@Column(name = "EMISIJA_CO2", columnDefinition = "numeric(18,2)")
	private Double emisijaCo2;
	
	@Column(name = "STARI_ID")
	private Long stariId;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
	
	@OneToMany(mappedBy="rn", orphanRemoval=true, cascade = CascadeType.ALL)
	private List<RnStavke> rnStavke;
	
	public void addRnStavke(RnStavke rnStav) {
       if (rnStav == null) {
           return;
       }
       rnStav.setRn(this);
       if (rnStavke == null) {
    	   rnStavke = new ArrayList<RnStavke>();
    	   rnStavke.add(rnStav);
       } else if (!rnStavke.contains(rnStav)) {
    	   rnStavke.add(rnStav);
       }
    }
	
//	@OneToMany(mappedBy="rn", orphanRemoval=true, cascade = CascadeType.ALL)
//	private List<RnIznos> rnIznos;
//	
//	public void addRnIznos(RnIznos rnIzn) {
//       if (rnIzn == null) {
//           return;
//       }
//       rnIzn.setRn(this);
//       if (rnIznos == null) {
//    	   rnIznos = new ArrayList<RnIznos>();
//    	   rnIznos.add(rnIzn);
//       } else if (!rnIznos.contains(rnIzn)) {
//    	   rnIznos.add(rnIzn);
//       }
//    }
//	
//	@OneToMany(mappedBy="rn", orphanRemoval=true, cascade = CascadeType.ALL)
//	private List<RnPotrosnja> rnPotrosnja;
//	
//	public void addRnPotrosnja(RnPotrosnja rnPot) {
//	       if (rnPot == null) {
//	           return;
//	       }
//	       rnPot.setRn(this);
//	       if (rnPotrosnja == null) {
//	    	   rnPotrosnja = new ArrayList<RnPotrosnja>();
//	    	   rnPotrosnja.add(rnPot);
//	       } else if (!rnPotrosnja.contains(rnPot)) {
//	    	   rnPotrosnja.add(rnPot);
//	       }
//	    }
//	
//	@OneToMany(mappedBy="rn", orphanRemoval=true, cascade = CascadeType.ALL)
//	private List<RnOstalo> rnOstalo;
//	
//	public void addRnOstalo(RnOstalo rnOst) {
//       if (rnOst == null) {
//           return;
//       }
//       rnOst.setRn(this);
//       if (rnOstalo == null) {
//    	   rnOstalo = new ArrayList<RnOstalo>();
//    	   rnOstalo.add(rnOst);
//       } else if (!rnOstalo.contains(rnOst)) {
//    	   rnOstalo.add(rnOst);
//       }
//    }

	public Long getId() {
		return id;
	}

	public Brojilo getBrojilo() {
		return brojilo;
	}

	public Energent getEnergent() {
		return energent;
	}

//	public Godina getGodina() {
//		return godina;
//	}
//
//	public Mesec getMesec() {
//		return mesec;
//	}

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

	public Double getKolicinaKwh() {
		return kolicinaKwh;
	}	

	public Double getKolicinaKwhPov() {
		return kolicinaKwhPov;
	}

	public Double getKolicinaKwhZap() {
		return kolicinaKwhZap;
	}

	public Double getKolicinaKwhKor() {
		return kolicinaKwhKor;
	}	

	public Double getKolicinaPrimEne() {
		return kolicinaPrimEne;
	}

	public Double getKolicinaFinEne() {
		return kolicinaFinEne;
	}

	public Double getEmisijaCo2() {
		return emisijaCo2;
	}

	public Long getStariId() {
		return stariId;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public List<RnStavke> getRnStavke() {
		return rnStavke;
	}

//	public List<RnIznos> getRnIznos() {
//		return rnIznos;
//	}
//
//	public List<RnPotrosnja> getRnPotrosnja() {
//		return rnPotrosnja;
//	}
//
//	public List<RnOstalo> getRnOstalo() {
//		return rnOstalo;
//	}

	public void setBrojilo(Brojilo brojilo) {
		this.brojilo = brojilo;
	}

	public void setEnergent(Energent energent) {
		this.energent = energent;
	}

//	public void setGodina(Godina godina) {
//		this.godina = godina;
//	}
//
//	public void setMesec(Mesec mesec) {
//		this.mesec = mesec;
//	}

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

	public void setKolicinaKwh(Double kolicinaKwh) {
		this.kolicinaKwh = kolicinaKwh;
	}
	
	public void setKolicinaKwhPov(Double kolicinaKwhPov) {
		this.kolicinaKwhPov = kolicinaKwhPov;
	}

	public void setKolicinaKwhZap(Double kolicinaKwhZap) {
		this.kolicinaKwhZap = kolicinaKwhZap;
	}

	public void setKolicinaKwhKor(Double kolicinaKwhKor) {
		this.kolicinaKwhKor = kolicinaKwhKor;
	}	
	

	public void setKolicinaPrimEne(Double kolicinaPrimEne) {
		this.kolicinaPrimEne = kolicinaPrimEne;
	}

	public void setKolicinaFinEne(Double kolicinaFinEne) {
		this.kolicinaFinEne = kolicinaFinEne;
	}

	public void setEmisijaCo2(Double emisijaCo2) {
		this.emisijaCo2 = emisijaCo2;
	}

	public void setStariId(Long stariId) {
		this.stariId = stariId;
	}
	
	public void setRnStavke(List<RnStavke> rnStavke) {
		this.rnStavke = rnStavke;
	}

//	public void setRnIznos(List<RnIznos> rnIznos) {
//		this.rnIznos = rnIznos;		
//	}
//
//	public void setRnPotrosnja(List<RnPotrosnja> rnPotrosnja) {
//		this.rnPotrosnja = rnPotrosnja;
//	}
//
//	public void setRnOstalo(List<RnOstalo> rnOstalo) {
//		this.rnOstalo = rnOstalo;
//	}	
	
}
