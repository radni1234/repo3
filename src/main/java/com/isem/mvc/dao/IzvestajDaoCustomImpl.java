package com.isem.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Izvestaj;

@Repository
public class IzvestajDaoCustomImpl implements IzvestajDaoCustom {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Izvestaj> izvApsMesPot(Long obj_id) {
		Query query = entityManager.createNamedQuery("izv_aps_mes_pot");
		query.setParameter(1, obj_id);
	    return query.getResultList();
	}	
	
}
