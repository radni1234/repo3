package com.isem.mvc.model;

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
public class Stub {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "TRAFO_ID",
            foreignKey = @ForeignKey(name = "STUB_FK1")
    )
	private Trafo trafo;
	
	@ManyToOne
    @JoinColumn(name = "STUB_TIP_ID",
            foreignKey = @ForeignKey(name = "STUB_FK2")
    )
	private StubTip stubTip;
	
	@Column(name = "ADRESA", length = 200)
	private String adresa;
	
	@Column(name = "LON_D", columnDefinition = "numeric(18,15)")
	private Double lonD;	
	
	@Column(name = "LAT_D", columnDefinition = "numeric(18,15)")
	private Double latD;	
	
	@Column(name = "RBR", columnDefinition = "int(11)")
	private Double rbr;	
	
	@Column(name = "ADRESA_SLIKE", length = 200)
	private String adresaSlike;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Trafo getTrafo() {
		return trafo;
	}

	public void setTrafo(Trafo trafo) {
		this.trafo = trafo;
	}

	public StubTip getStubTip() {
		return stubTip;
	}

	public void setStubTip(StubTip stubTip) {
		this.stubTip = stubTip;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Double getLonD() {
		return lonD;
	}

	public void setLonD(Double lonD) {
		this.lonD = lonD;
	}	

	public Double getLatD() {
		return latD;
	}

	public void setLatD(Double latD) {
		this.latD = latD;
	}

	public Double getRbr() {
		return rbr;
	}

	public void setRbr(Double rbr) {
		this.rbr = rbr;
	}

	public String getAdresaSlike() {
		return adresaSlike;
	}

	public void setAdresaSlike(String adresaSlike) {
		this.adresaSlike = adresaSlike;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Stub [id=" + id + ", trafo=" + trafo + ", stubTip=" + stubTip + ", adresa=" + adresa + ", lonD=" + lonD
				+ ", latD=" + latD + ", rbr=" + rbr + ", adresaSlike=" + adresaSlike + ", version=" + version + "]";
	}

	
	
}
