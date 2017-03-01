package com.isem.mvc.lov;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ObjekatLov {
	@Id
	private Long id;	
	private String name;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}	
	
	
}
