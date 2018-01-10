package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrendIskljucenoView {
	@Id
	private Long id;
	private Long objekatId;
	private String objekat;
	private Long godina;
	private String mesec;
	
	public Long getId() {
		return id;
	}	
	public Long getObjekatId() {
		return objekatId;
	}
	public String getObjekat() {
		return objekat;
	}
	public Long getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}	
	
}
