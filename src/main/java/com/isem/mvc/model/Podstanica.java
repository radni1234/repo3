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
public class Podstanica {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "BROJ_PODSTANICE", length = 100)
	private String brojPodstanice;
	
	@Column(name = "ADRESA", length = 300)
	private String adresa;
	
	@ManyToOne
    @JoinColumn(name = "KOTAO_ID",
            foreignKey = @ForeignKey(name = "PODSTANICA_FK1")
    )
	private Kotao kotao;
	
	@Column(name = "GREJNA_POVRSINA", length = 100)
	private String grejnaPovrsina;	
	
	
	@Column(name = "INTSALISANI_TOP_KAP", columnDefinition = "numeric(18,2)")
	private Double instalisaniToplotniKapacitet;
	
	@Column(name = "TIP_KALORIMETRA", length = 300)
	private String tipKalorimetra;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrojPodstanice() {
		return brojPodstanice;
	}

	public void setBrojPodstanice(String brojPodstanice) {
		this.brojPodstanice = brojPodstanice;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Kotao getKotao() {
		return kotao;
	}

	public void setKotao(Kotao kotao) {
		this.kotao = kotao;
	}

	public String getGrejnaPovrsina() {
		return grejnaPovrsina;
	}

	public void setGrejnaPovrsina(String grejnaPovrsina) {
		this.grejnaPovrsina = grejnaPovrsina;
	}

	public Double getInstalisaniToplotniKapacitet() {
		return instalisaniToplotniKapacitet;
	}

	public void setInstalisaniToplotniKapacitet(Double instalisaniToplotniKapacitet) {
		this.instalisaniToplotniKapacitet = instalisaniToplotniKapacitet;
	}

	public String getTipKalorimetra() {
		return tipKalorimetra;
	}

	public void setTipKalorimetra(String tipKalorimetra) {
		this.tipKalorimetra = tipKalorimetra;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
