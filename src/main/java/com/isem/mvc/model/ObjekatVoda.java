package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class ObjekatVoda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_VODA_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "OPIS", length = 1000)
	private String opis;
	
	@Column(name = "POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double potrosnja;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public String getOpis() {
		return opis;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setPotrosnja(Double potrosnja) {
		this.potrosnja = potrosnja;
	}

	@Override
	public String toString() {
		return "ObjekatVoda [id=" + id + ", objekat=" + objekat + ", opis=" + opis + ", potrosnja=" + potrosnja
				+ ", version=" + version + "]";
	}
	
	
}
