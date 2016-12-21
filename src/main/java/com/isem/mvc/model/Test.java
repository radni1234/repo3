package com.isem.mvc.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "test",
            query = "CALL test_proc",
            resultClass = Test.class
    )
 })
 @Entity
public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "BROJILO_ID",
            foreignKey = @ForeignKey(name = "TEST_FK1")
    )
	private Brojilo brojilo;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "TEST_FK2")
    )
	private Energent energent;
	
	@ManyToOne
    @JoinColumn(name = "GODINA_ID",
            foreignKey = @ForeignKey(name = "TEST_FK3")
    )
	private Godina godina;
	
	@ManyToOne
    @JoinColumn(name = "MESEC_ID",
            foreignKey = @ForeignKey(name = "TEST_FK4")
    )
	private Mesec mesec;
	
	@ManyToOne
    @JoinColumn(name = "DOBAVLJAC_ID",
            foreignKey = @ForeignKey(name = "TEST_FK5")
    )
	private Dobavljac dobavljac;
	
	@ManyToOne
    @JoinColumn(name = "RN_TIP_ID",
            foreignKey = @ForeignKey(name = "TEST_FK6")
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
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;	

	@OneToMany(mappedBy="rn")
	private Set<RnIznos> rnIznos;
	
	@OneToMany(mappedBy="rn")
	private Set<RnPotrosnja> rnPotrosnja;
	
	@OneToMany(mappedBy="rn")
	private Set<RnOstalo> rnOstalo;

	public Long getId() {
		return id;
	}

	public Brojilo getBrojilo() {
		return brojilo;
	}

	public Energent getEnergent() {
		return energent;
	}

	public Godina getGodina() {
		return godina;
	}

	public Mesec getMesec() {
		return mesec;
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

	public Integer getVersion() {
		return version;
	}

	public Set<RnIznos> getRnIznos() {
		return rnIznos;
	}

	public Set<RnPotrosnja> getRnPotrosnja() {
		return rnPotrosnja;
	}

	public Set<RnOstalo> getRnOstalo() {
		return rnOstalo;
	}

	
	
	
}
