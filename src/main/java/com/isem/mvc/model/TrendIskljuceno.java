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
public class TrendIskljuceno {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "OBJEKAT_ID", nullable = false, 
            foreignKey = @ForeignKey(name = "TREND_ISKLJUCENO_FK1")
    )
	private Objekat objekat;
	
	@Column(name = "PERIOD", nullable = false,  columnDefinition = "int(6)")
	private Integer period;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Objekat getObjekat() {
		return objekat;
	}

	public Integer getPeriod() {
		return period;
	}

	public Integer getVersion() {
		return version;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	

}
