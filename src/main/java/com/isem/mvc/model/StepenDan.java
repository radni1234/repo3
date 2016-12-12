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
@Table(uniqueConstraints= @UniqueConstraint(columnNames = {"GODINA_ID", "MESEC_ID", "OPSTINA_ID"}) )
public class StepenDan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "GODINA_ID",
            foreignKey = @ForeignKey(name = "STEPEN_DAN_FK1")
    )
	private Godina godina;
	
	@ManyToOne
    @JoinColumn(name = "MESEC_ID",
            foreignKey = @ForeignKey(name = "STEPEN_DAN_FK2")
    )
	private Mesec mesec;	
	
	@ManyToOne
    @JoinColumn(name = "OPSTINA_ID",
            foreignKey = @ForeignKey(name = "STEPEN_DAN_FK3")
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

	public Godina getGodina() {
		return godina;
	}

	public Mesec getMesec() {
		return mesec;
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

	public void setGodina(Godina godina) {
		this.godina = godina;
	}

	public void setMesec(Mesec mesec) {
		this.mesec = mesec;
	}

	public void setOpstina(Opstina opstina) {
		this.opstina = opstina;
	}

	public void setSdIznos(Double sdIznos) {
		this.sdIznos = sdIznos;
	}

	@Override
	public String toString() {
		return "StepenDan [id=" + id + ", godina=" + godina + ", mesec=" + mesec + ", opstina=" + opstina + ", sdIznos="
				+ sdIznos + ", version=" + version + "]";
	}
	
	
}
