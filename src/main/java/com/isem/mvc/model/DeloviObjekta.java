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
public class DeloviObjekta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String naziv;
	
	@ManyToOne
    @JoinColumn(name = "delovi_objekta_prikaz_id",
    			foreignKey = @ForeignKey(name = "DELOVI_OBJEKTA_FK1"))	
    private DeloviObjektaPrikaz deloviObjektaPrikaz;
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;

	public Long getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public DeloviObjektaPrikaz getDeloviObjektaPrikaz() {
		return deloviObjektaPrikaz;
	}

	public Integer getVersion() {
		return version;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setDeloviObjektaPrikaz(DeloviObjektaPrikaz deloviObjektaPrikaz) {
		this.deloviObjektaPrikaz = deloviObjektaPrikaz;
	}

	@Override
	public String toString() {
		return "DeloviObjekta [Id=" + id + ", naziv=" + naziv + ", deloviObjektaPrikaz=" + deloviObjektaPrikaz
				+ ", version=" + version + "]";
	}	
	
	

}
