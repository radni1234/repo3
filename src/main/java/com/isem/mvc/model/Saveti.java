package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Saveti {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String savet_en;
	private String savet_sr;
	private String savet_de;
	private String savet_it;
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;

	public String getSavet_en() {
		return savet_en;
	}

	public void setSavet_en(String savet_en) {
		this.savet_en = savet_en;
	}
	
	public String getSavet_sr() {
		return savet_sr;
	}

	public void setSavet_sr(String savet_sr) {
		this.savet_sr = savet_sr;
	}
	
	public String getSavet_de() {
		return savet_de;
	}

	public void setSavet_de(String savet_de) {
		this.savet_de = savet_de;
	}
	
	public String getSavet_it() {
		return savet_it;
	}

	public void setSavet_it(String savet_it) {
		this.savet_it = savet_it;
	}

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "JedMere [id=" + id + ", savet_sr=" + savet_sr + ", savet_de=" + savet_de + ", savet_it=" + savet_it + ", savet_en=" + savet_en + ", version=" + version + "]";
	}
	
	
}

