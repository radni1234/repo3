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
public class Kotao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "KOTLARNICA_ID",
            foreignKey = @ForeignKey(name = "KOTAO_FK1")
    )
	private Kotlarnica kotlarnica;

	@Column(name = "NAZIV", nullable = false, length = 100)
	private String naziv;
	
	@Column(name = "TIP", length = 100)
	private String tip;
	
	@Column(name = "PROIZVODJAC", length = 100)
	private String proizvodjac;
	
	@Column(name = "GOD_PROIZ", columnDefinition = "int(4)")
	private Integer godinaProizvodnje;
	
	@Column(name = "NOMINALNA_SNAGA", columnDefinition = "int(18)")
	private Integer nominalnaSnaga;
	
	@Column(name = "STEPEN_KORISNOSTI", columnDefinition = "numeric(18,2)")
	private Double stepenKorisnosti ;
	
	@Column(name = "GORIONIK_TIP", length = 100)
	private String gorionikTip;
	
	@Column(name = "GORIONIK_PROIZVODJAC", length = 100)
	private String gorionikProizvodjac;
	
	@Column(name = "NOMINALNA_SNAGA_GORIONIKA", columnDefinition = "int(18)")
	private Integer nominalnaSnagaGorionika;
	
	@Column(name = "GOD_PROIZ_GORIONIKA", columnDefinition = "int(4)")
	private Integer godinaProizvodnjeGorionika;
	
	@Column(name = "RADNI_PRITISAK", columnDefinition = "int(18)")
	private Integer radniPritisak;
	
	@Column(name = "TEMP_VODE_NA_POTISNOM_VODU", columnDefinition = "int(18)")
	private Integer tempVodeNaPotisnomVodu;
	
	@Column(name = "TEMP_VODE_NA_POVRATNOM_VODU", columnDefinition = "int(18)")
	private Integer tempVodeNaPovratnomVodu;
	
	@Column(name = "REGULACIJA_KOTLA", length = 100)
	private String regulacijaKotla;
	
	@Column(name = "NAPOMENA", length = 1000)
	private String napomena;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public Integer getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(Integer godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public Integer getNominalnaSnaga() {
		return nominalnaSnaga;
	}

	public void setNominalnaSnaga(Integer nominalnaSnaga) {
		this.nominalnaSnaga = nominalnaSnaga;
	}

	public Double getStepenKorisnosti() {
		return stepenKorisnosti;
	}

	public void setStepenKorisnosti(Double stepenKorisnosti) {
		this.stepenKorisnosti = stepenKorisnosti;
	}

	public String getGorionikTip() {
		return gorionikTip;
	}

	public void setGorionikTip(String gorionikTip) {
		this.gorionikTip = gorionikTip;
	}

	public String getGorionikProizvodjac() {
		return gorionikProizvodjac;
	}

	public void setGorionikProizvodjac(String gorionikProizvodjac) {
		this.gorionikProizvodjac = gorionikProizvodjac;
	}

	public Integer getNominalnaSnagaGorionika() {
		return nominalnaSnagaGorionika;
	}

	public void setNominalnaSnagaGorionika(Integer nominalnaSnagaGorionika) {
		this.nominalnaSnagaGorionika = nominalnaSnagaGorionika;
	}

	public Integer getGodinaProizvodnjeGorionika() {
		return godinaProizvodnjeGorionika;
	}

	public void setGodinaProizvodnjeGorionika(Integer godinaProizvodnjeGorionika) {
		this.godinaProizvodnjeGorionika = godinaProizvodnjeGorionika;
	}

	public Integer getRadniPritisak() {
		return radniPritisak;
	}

	public void setRadniPritisak(Integer radniPritisak) {
		this.radniPritisak = radniPritisak;
	}

	public Integer getTempVodeNaPotisnomVodu() {
		return tempVodeNaPotisnomVodu;
	}

	public void setTempVodeNaPotisnomVodu(Integer tempVodeNaPotisnomVodu) {
		this.tempVodeNaPotisnomVodu = tempVodeNaPotisnomVodu;
	}

	public Integer getTempVodeNaPovratnomVodu() {
		return tempVodeNaPovratnomVodu;
	}

	public void setTempVodeNaPovratnomVodu(Integer tempVodeNaPovratnomVodu) {
		this.tempVodeNaPovratnomVodu = tempVodeNaPovratnomVodu;
	}

	public String getRegulacijaKotla() {
		return regulacijaKotla;
	}

	public void setRegulacijaKotla(String regulacijaKotla) {
		this.regulacijaKotla = regulacijaKotla;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Kotlarnica getKotlarnica() {
		return kotlarnica;
	}

	public void setKotlarnica(Kotlarnica kotlarnica) {
		this.kotlarnica = kotlarnica;
	}
	
	
	
}
