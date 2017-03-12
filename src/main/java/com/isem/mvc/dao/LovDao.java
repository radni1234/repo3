package com.isem.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.isem.mvc.lov.Lov;

@Repository	
public class LovDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Lov> objekatLov() {
		Query query = entityManager.createNamedQuery("objekat_lov");		
	    return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentLov() {
		Query query = entityManager.createNativeQuery(
				"select id, naziv as name from energent order by naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentLov(Long objId) {
		Query query = entityManager.createNativeQuery(
				"select e.id, e.naziv as name " +
				"from energent e " +
				"where energent_tip_id in (select t.id " +
				"							from brojilo b, brojilo_vrsta v, energent_tip t " +
				"							where b.brojilo_vrsta_id = v.id " +
				"								  and v.energent_tip_id = t.id " +
				"								  and b.objekat_id = " + objId + ") " +
				"order by e.naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentTipLov() {
		Query query = entityManager.createNativeQuery(
				    "SELECT id, naziv as name from energent_tip order by naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentTipLov(Long objId) {
		Query query = entityManager.createNativeQuery(
				    "select id, naziv as name " + 
					"from energent_tip " + 
					"where id in (select energent_tip_id " + 
					"			 from brojilo b, brojilo_vrsta v " + 
					"             where b.brojilo_vrsta_id = v.id " + 										
					"				  and b.objekat_id = " + objId + " ) " + 
					"order by naziv",
					"Lov");
	
		return query.getResultList();
	}
}
