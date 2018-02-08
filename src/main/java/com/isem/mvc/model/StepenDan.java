package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

@Entity
@Table(uniqueConstraints= @UniqueConstraint(columnNames = {"GODINA", "MESEC", "OPSTINA_ID"}) )
public class StepenDan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "GODINA", columnDefinition = "int(4)")
	private Integer godina;
	
	@Column(name = "MESEC", columnDefinition = "int(2)")
	private Integer mesec;
	
	@ManyToOne
    @JoinColumn(name = "OPSTINA_ID",
            foreignKey = @ForeignKey(name = "STEPEN_DAN_FK1")
    )
	private Opstina opstina;
	
	@Column(name = "SD_IZNOS", columnDefinition = "numeric(18,2)")
	private Double sdIznos;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Opstina getOpstina() {
		return opstina;
	}

	public Double getSdIznos() {
		return sdIznos;
	}

	public Integer getVersion() {
		return version;
	}

	public void setOpstina(Opstina opstina) {
		this.opstina = opstina;
	}

	public void setSdIznos(Double sdIznos) {
		this.sdIznos = sdIznos;
	}	

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public Integer getMesec() {
		return mesec;
	}

	public void setMesec(Integer mesec) {
		this.mesec = mesec;
	}

	@Override
	public String toString() {
		return "StepenDan [id=" + id + ", godina=" + godina + ", mesec=" + mesec + ", opstina=" + opstina + ", sdIznos="
				+ sdIznos + ", version=" + version + "]";
	}
	
	
}
