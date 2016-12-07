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
public class ObjekatKk {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_KK_FK1")
    )
	private Objekat objekat;
	
	@ManyToOne
    @JoinColumn(name = "DELOVI_OBJEKTA_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_KK_FK2")
    )
	private DeloviObjekta deloviObjekta;
	
	@Column(name = "SASTAV", length = 1000)
	private String sastav;
	
	@Column(name = "UK_DEB", columnDefinition = "numeric(18,2)")
	private Double ukDeb;
	
	@Column(name = "TOP_IZO_VRSTA", length = 500)
	private String topIzoVrsta;
	
	@Column(name = "TOP_IZO_DEB", columnDefinition = "numeric(18,2)")
	private Double topIzoDeb;
	
	@Column(name = "PRIMEDBA", length = 1000)
	private String primedba;
	
	@Column(name = "POVRSINA", columnDefinition = "numeric(18,2)")
	private Double povrsina;
	
	@Column(name = "KOEFICIJENT", columnDefinition = "numeric(18,2)")
	private Double koeficijent;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public DeloviObjekta getDeloviObjekta() {
		return deloviObjekta;
	}

	public String getSastav() {
		return sastav;
	}

	public Double getUkDeb() {
		return ukDeb;
	}

	public String getTopIzoVrsta() {
		return topIzoVrsta;
	}

	public Double getTopIzoDeb() {
		return topIzoDeb;
	}

	public String getPrimedba() {
		return primedba;
	}

	public Double getPovrsina() {
		return povrsina;
	}

	public Double getKoeficijent() {
		return koeficijent;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setDeloviObjekta(DeloviObjekta deloviObjekta) {
		this.deloviObjekta = deloviObjekta;
	}

	public void setSastav(String sastav) {
		this.sastav = sastav;
	}

	public void setUkDeb(Double ukDeb) {
		this.ukDeb = ukDeb;
	}

	public void setTopIzoVrsta(String topIzoVrsta) {
		this.topIzoVrsta = topIzoVrsta;
	}

	public void setTopIzoDeb(Double topIzoDeb) {
		this.topIzoDeb = topIzoDeb;
	}

	public void setPrimedba(String primedba) {
		this.primedba = primedba;
	}

	public void setPovrsina(Double povrsina) {
		this.povrsina = povrsina;
	}

	public void setKoeficijent(Double koeficijent) {
		this.koeficijent = koeficijent;
	}

	@Override
	public String toString() {
		return "ObjekatKk [id=" + id + ", objekat=" + objekat + ", deloviObjekta=" + deloviObjekta + ", sastav="
				+ sastav + ", ukDeb=" + ukDeb + ", topIzoVrsta=" + topIzoVrsta + ", topIzoDeb=" + topIzoDeb
				+ ", primedba=" + primedba + ", povrsina=" + povrsina + ", koeficijent=" + koeficijent + ", version="
				+ version + "]";
	}
	
	
}
