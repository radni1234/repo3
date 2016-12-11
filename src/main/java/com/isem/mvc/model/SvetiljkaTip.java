package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class SvetiljkaTip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 200)
	private String naziv;
	
	@Column(name = "IZVOR", length = 100)
	private String izvor;
	
	@Column(name = "SNAGA", columnDefinition = "numeric(18,2)")
	private Double snaga;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
}
