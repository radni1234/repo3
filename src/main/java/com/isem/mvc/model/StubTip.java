package com.isem.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class StubTip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAZIV", unique = true, nullable = false, length = 100)
	private String naziv;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
}
