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
public class Vozilo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "JAVNO_PREDUZECE_ID",
            foreignKey = @ForeignKey(name = "VOZILO_FK1")
    )
	private JavnoPreduzece javnoPreduzece;
	
	@ManyToOne
    @JoinColumn(name = "KATEGORIJA_VOZILA_ID",
            foreignKey = @ForeignKey(name = "VOZILO_FK2")
    )
	private KategorijaVozila kategorijaVozila;
	
	@ManyToMany
	@JoinTable(name = "VOZILO_ENERGENT",
		joinColumns = { @JoinColumn(name = "VOZILO_ID") },
		inverseJoinColumns = { @JoinColumn(name = "ENERGENT_ID") })
	private Set<Energent> energenti = new HashSet<Energent>();
	
	@Column(name = "GODISTE", columnDefinition = "int(4)")
	private Integer godiste;

	@Column(name = "MARKA", length = 100)
	private String marka;
	
	@Column(name = "MODEL", length = 100)
	private String model;
	
	@Column(name = "KUBIKAZA", columnDefinition = "int(10)")
	private Integer kubikaza;
	
	@Column(name = "EMISIONA_KLASA", length = 100)
	private String emisiona_klasa;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public JavnoPreduzece getJavnoPreduzece() {
		return javnoPreduzece;
	}

	public KategorijaVozila getKategorijaVozila() {
		return kategorijaVozila;
	}

	public Integer getGodiste() {
		return godiste;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public Integer getKubikaza() {
		return kubikaza;
	}

	public String getEmisiona_klasa() {
		return emisiona_klasa;
	}

	public Integer getVersion() {
		return version;
	}

	public void setJavnoPreduzece(JavnoPreduzece javnoPreduzece) {
		this.javnoPreduzece = javnoPreduzece;
	}

	public void setKategorijaVozila(KategorijaVozila kategorijaVozila) {
		this.kategorijaVozila = kategorijaVozila;
	}

	public void setGodiste(Integer godiste) {
		this.godiste = godiste;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setKubikaza(Integer kubikaza) {
		this.kubikaza = kubikaza;
	}

	public void setEmisiona_klasa(String emisiona_klasa) {
		this.emisiona_klasa = emisiona_klasa;
	}	

	public Set<Energent> getEnergenti() {
		return energenti;
	}

	public void setEnergenti(Set<Energent> energenti) {
		this.energenti = energenti;
	}

	@Override
	public String toString() {
		return "Vozilo [id=" + id + ", javnoPreduzece=" + javnoPreduzece + ", kategorijaVozila=" + kategorijaVozila
				+ ", godiste=" + godiste + ", marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza
				+ ", emisiona_klasa=" + emisiona_klasa + ", version=" + version + "]";
	}
	
	

}
