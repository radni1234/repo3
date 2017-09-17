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
public class Svetiljka {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "STUB_ID",
            foreignKey = @ForeignKey(name = "SVETILJKA_FK1")
    )
	private Stub stub;
	
	@ManyToOne
    @JoinColumn(name = "SVETILJKA_TIP_ID",
            foreignKey = @ForeignKey(name = "SVETILJKA_FK2")
    )
	private SvetiljkaTip svetiljkaTip;
	
	@Column(name = "KOM", columnDefinition = "int(10)")
	private Double kom;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

	public Long getId() {
		return id;
	}

	public Stub getStub() {
		return stub;
	}

	public SvetiljkaTip getSvetiljkaTip() {
		return svetiljkaTip;
	}

	public Double getKom() {
		return kom;
	}

	public Integer getVersion() {
		return version;
	}

	public void setStub(Stub stub) {
		this.stub = stub;
	}

	public void setSvetiljkaTip(SvetiljkaTip svetiljkaTip) {
		this.svetiljkaTip = svetiljkaTip;
	}

	public void setKom(Double kom) {
		this.kom = kom;
	}

	@Override
	public String toString() {
		return "Svetiljka [id=" + id + ", stub=" + stub + ", svetiljkaTip=" + svetiljkaTip + ", kom=" + kom
				+ ", version=" + version + "]";
	}
	
	
}
