package com.isem.mvc.lov;

import java.math.BigInteger;

//@Entity
//@Entity
//@NamedNativeQuery(name = "lov", query = "select id, naziv as name from energent order by naziv", resultClass = Lov.class)
public class Lov {
	private BigInteger id;	
	private String name;	
	
	public Lov() {
		super();
	}	
	
	public Lov(BigInteger id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public BigInteger getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	
	
	
}
