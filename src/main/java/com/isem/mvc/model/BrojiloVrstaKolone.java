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
public class BrojiloVrstaKolone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;
	
	@Column(name = "OPIS", length = 1000)
	private String opis;
	
	@ManyToOne
    @JoinColumn(name = "BROJILO_VRSTA_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VRSTA_KOLONE_FK1")
    )
	private BrojiloVrsta brojiloVrsta;
	
	@Column(name = "RBR", columnDefinition = "int(11)")
	private Integer rbr;
	
	@ManyToOne
    @JoinColumn(name = "JED_MERE_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VRSTA_KOLONE_FK2")
    )
	private JedMere jedMere;
	
	@ManyToOne
    @JoinColumn(name = "KOLONA_TIP_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VRSTA_KOLONE_FK3")
    )
	private KolonaTip kolonaTip;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getOpis() {
		return opis;
	}

	public BrojiloVrsta getBrojiloVrsta() {
		return brojiloVrsta;
	}

	public Integer getRbr() {
		return rbr;
	}

	public JedMere getJedMere() {
		return jedMere;
	}

	public KolonaTip getKolonaTip() {
		return kolonaTip;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setBrojiloVrsta(BrojiloVrsta brojiloVrsta) {
		this.brojiloVrsta = brojiloVrsta;
	}

	public void setRbr(Integer rbr) {
		this.rbr = rbr;
	}

	public void setJedMere(JedMere jedMere) {
		this.jedMere = jedMere;
	}

	public void setKolonaTip(KolonaTip kolonaTip) {
		this.kolonaTip = kolonaTip;
	}

	@Override
	public String toString() {
		return "BrojiloVrstaKolone [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", brojiloVrsta=" + brojiloVrsta
				+ ", rbr=" + rbr + ", jedMere=" + jedMere + ", kolonaTip=" + kolonaTip + ", version=" + version + "]";
	}
	
	

}
