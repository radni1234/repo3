package com.isem.mvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class BrojiloVodozahvat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "SIFRA_BROJILA", nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "BROJILO_TIP_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VODOZAHVAT_FK1")
    )
	private BrojiloTip brojiloTip;
	
	@ManyToOne
    @JoinColumn(name = "REZIM_MERENJA_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VODOZAHVAT_FK2")
    )
	private RezimMerenja rezimMerenja;
	
	@ManyToOne
    @JoinColumn(name = "VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VODOZAHVAT_FK3")
    )
	private Vodozahvat vodozahvat;
	
	@ManyToOne
    @JoinColumn(name = "VODECE_BROJILO_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VODOZAHVAT_FK4")
    )
	private Brojilo vodeceBrojilo;	
	
	@ManyToOne
    @JoinColumn(name = "BROJILO_VRSTA_ID",
            foreignKey = @ForeignKey(name = "BROJILO_VODOZAHVAT_FK5")
    )
	private BrojiloVrsta brojiloVrsta;	

	@Column(name = "PROCENAT", columnDefinition = "numeric(5,2)")
	private Double procenat;
	
	@Column(name = "OBRACUNSKI_PERIOD", columnDefinition = "numeric(3)")
	private Integer obracunskiPeriod;
	
	@Column(name = "AUTOMATSKI", length = 1)
	private String automatski;
	
	@Column(name = "OPIS", length = 500)
	private String opis;
	
	@ManyToMany
	@JoinTable(name = "BROJILO_VODOZAHVAT_DOBAVLJAC",
		joinColumns = { @JoinColumn(name = "BROJILO_VODOZAHVAT_ID") },
		inverseJoinColumns = { @JoinColumn(name = "DOBAVLJAC_ID") })
	private Set<Dobavljac> dobavljaci = new HashSet<Dobavljac>();

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public BrojiloTip getBrojiloTip() {
		return brojiloTip;
	}

	public RezimMerenja getRezimMerenja() {
		return rezimMerenja;
	}

	public Vodozahvat getVodozahvat() {
		return vodozahvat;
	}

	public Brojilo getVodeceBrojilo() {
		return vodeceBrojilo;
	}

	public BrojiloVrsta getBrojiloVrsta() {
		return brojiloVrsta;
	}

	public Double getProcenat() {
		return procenat;
	}

	public Integer getObracunskiPeriod() {
		return obracunskiPeriod;
	}

	public String getAutomatski() {
		return automatski;
	}

	public String getOpis() {
		return opis;
	}

	public Set<Dobavljac> getDobavljaci() {
		return dobavljaci;
	}

	public Integer getVersion() {
		return version;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setBrojiloTip(BrojiloTip brojiloTip) {
		this.brojiloTip = brojiloTip;
	}

	public void setRezimMerenja(RezimMerenja rezimMerenja) {
		this.rezimMerenja = rezimMerenja;
	}

	public void setVodozahvat(Vodozahvat vodozahvat) {
		this.vodozahvat = vodozahvat;
	}

	public void setVodeceBrojilo(Brojilo vodeceBrojilo) {
		this.vodeceBrojilo = vodeceBrojilo;
	}

	public void setBrojiloVrsta(BrojiloVrsta brojiloVrsta) {
		this.brojiloVrsta = brojiloVrsta;
	}

	public void setProcenat(Double procenat) {
		this.procenat = procenat;
	}

	public void setObracunskiPeriod(Integer obracunskiPeriod) {
		this.obracunskiPeriod = obracunskiPeriod;
	}

	public void setAutomatski(String automatski) {
		this.automatski = automatski;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setDobavljaci(Set<Dobavljac> dobavljaci) {
		this.dobavljaci = dobavljaci;
	}

	@Override
	public String toString() {
		return "BrojiloVodozahvat [id=" + id + ", naziv=" + naziv + ", brojiloTip=" + brojiloTip + ", rezimMerenja="
				+ rezimMerenja + ", vodozahvat=" + vodozahvat + ", vodeceBrojilo=" + vodeceBrojilo + ", brojiloVrsta="
				+ brojiloVrsta + ", procenat=" + procenat + ", obracunskiPeriod=" + obracunskiPeriod + ", automatski="
				+ automatski + ", opis=" + opis + ", dobavljaci=" + dobavljaci + ", version=" + version + "]";
	}
	
	
	
	
		
}
