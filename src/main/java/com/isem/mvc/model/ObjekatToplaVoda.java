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
public class ObjekatToplaVoda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
    @JoinColumn(name = "OBJEKAT_ID",
            foreignKey = @ForeignKey(name = "OBJEKAT_TOPLA_VODA_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "OPIS", nullable = false, length = 1000)
	private String opis;
	
	@Column(name = "TEMP_VODE_ULAZ", columnDefinition = "numeric(18,2)")
	private Double tempVodeUlaz;
	
	@Column(name = "TEMP_VODE", columnDefinition = "numeric(18,2)")
	private Double tempVode;
	
	@Column(name = "POTROSNJA", columnDefinition = "numeric(18,2)")
	private Double potrosnja;
	
	@Column(name = "UK_SNAGA", columnDefinition = "numeric(18,2)")
	private Double ukSnaga;
	
	@Column(name = "POTREBNO_TV", columnDefinition = "numeric(18,2)")
	private Double potrebnoTv;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
	
	public Long getId() {
		return id;
	}

	public String getOpis() {
		return opis;
	}

	public Double getTempVodeUlaz() {
		return tempVodeUlaz;
	}

	public Double getTempVode() {
		return tempVode;
	}

	public Double getPotrosnja() {
		return potrosnja;
	}

	public Double getUkSnaga() {
		return ukSnaga;
	}

	public Double getPotrebnoTv() {
		return potrebnoTv;		
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	@Override
	public String toString() {
		return "ObjekatToplaVoda [id=" + id + ", objekat=" + objekat + ", opis=" + opis + ", tempVodeUlaz="
				+ tempVodeUlaz + ", tempVode=" + tempVode + ", potrosnja=" + potrosnja + ", ukSnaga=" + ukSnaga
				+ ", potrebnoTv=" + potrebnoTv + ", version=" + version + "]";
	}

	
	 
}
