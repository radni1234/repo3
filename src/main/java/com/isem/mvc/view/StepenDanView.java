package com.isem.mvc.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StepenDanView {
	@Id
	private Long id;
	private String opstina;
	private String godina;
	private String mesec;
	private Double sd_iznos;
	
	public Long getId() {
		return id;
	}
	public String getOpstina() {
		return opstina;
	}
	public String getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}
	public Double getSd_iznos() {
		return sd_iznos;
	}
	
	
}
