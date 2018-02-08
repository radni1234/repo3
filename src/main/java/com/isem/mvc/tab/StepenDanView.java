package com.isem.mvc.tab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StepenDanView {
	@Id
	private Long id;
	private Long opstinaId;
	private String opstina;
	private Integer godina;
	private String mesec;
	private Double sd_iznos;
	
	public Long getId() {
		return id;
	}
	public String getOpstina() {
		return opstina;
	}
	public Integer getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}
	public Double getSd_iznos() {
		return sd_iznos;
	}
	public Long getOpstinaId() {
		return opstinaId;
	}
		
}
