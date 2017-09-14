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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RnStavkeKotlarnica {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "RN_KOTLARNICA_ID",
            foreignKey = @ForeignKey(name = "RN_STAVKE_KOTLARNICA_FK1")
    )
	private RnKotlarnica rn;

	@ManyToOne
    @JoinColumn(name = "BROJILO_VRSTA_KOLONE_ID",
            foreignKey = @ForeignKey(name = "RN_STAVKE_KOTLARNICA_FK2")
    )
	private BrojiloVrstaKolone brojiloVrstaKolone;
	
	@Column(name = "VREDNOST", columnDefinition = "numeric(18,2)")
	private Double vrednost;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}
	
	@JsonIgnore
	public RnKotlarnica getRn() {
		return rn;
	}

	public BrojiloVrstaKolone getBrojiloVrstaKolone() {
		return brojiloVrstaKolone;
	}

	public Double getVrednost() {
		return vrednost;
	}

	public Integer getVersion() {
		return version;
	}

	public void setRn(RnKotlarnica rn) {
		this.rn = rn;
	}

	public void setBrojiloVrstaKolone(BrojiloVrstaKolone brojiloVrstaKolone) {
		this.brojiloVrstaKolone = brojiloVrstaKolone;
	}

	public void setVrednost(Double vrednost) {
		this.vrednost = vrednost;
	}
}
