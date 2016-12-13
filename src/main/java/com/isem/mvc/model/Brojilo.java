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
public class Brojilo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "SIFRA_BROJILA", nullable = false, length = 100)
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "BROJILO_TIP_ID",
            foreignKey = @ForeignKey(name = "BROJILO_FK1")
    )
	private BrojiloTip brojiloTip;
	
	@ManyToOne
    @JoinColumn(name = "REZIM_MERENJA_ID",
            foreignKey = @ForeignKey(name = "BROJILO_FK2")
    )
	private RezimMerenja rezimMerenja;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "BROJILO_FK3")
    )
	private Objekat objekat;
	
	@ManyToOne
    @JoinColumn(name = "VODECE_BROJILO_ID",
            foreignKey = @ForeignKey(name = "BROJILO_FK4")
    )
	private Brojilo vodeceBrojilo;	

	@Column(name = "PROCENAT", columnDefinition = "numeric(5,2)")
	private Double procenat;
	
	@Column(name = "OBRACUNSKI_PERIOD", columnDefinition = "numeric(3)")
	private Integer obracunskiPeriod;
	
	@Column(name = "AUTOMATSKI", length = 1)
	private String automatski;
	
	@Column(name = "OPIS", length = 500)
	private String opis;	

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

	public Objekat getObjekat() {
		return objekat;
	}

	public Brojilo getVodeceBrojilo() {
		return vodeceBrojilo;
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

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setVodeceBrojilo(Brojilo vodeceBrojilo) {
		this.vodeceBrojilo = vodeceBrojilo;
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

	@Override
	public String toString() {
		return "Brojilo [id=" + id + ", naziv=" + naziv + ", brojiloTip=" + brojiloTip + ", rezimMerenja="
				+ rezimMerenja + ", objekat=" + objekat + ", vodeceBrojilo=" + vodeceBrojilo + ", procenat=" + procenat
				+ ", obracunskiPeriod=" + obracunskiPeriod + ", automatski=" + automatski + ", opis=" + opis
				+ ", version=" + version + "]";
	}
	
	
}
