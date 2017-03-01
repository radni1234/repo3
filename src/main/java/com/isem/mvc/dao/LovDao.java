package com.isem.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.isem.mvc.lov.ObjekatLov;

@Repository	
public class LovDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<ObjekatLov> objekatLov() {
		Query query = entityManager.createNamedQuery("objekat_lov");		
	    return query.getResultList();
	}	
}
