package com.isem.mvc.dao;

import java.util.Date;
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
	public List<Izvestaj> izvApsMesPot(String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		Query query = entityManager.createNamedQuery("izv_aps_mes_pot");
		query.setParameter(1, obj_id);
		query.setParameter(2, ene_tip_id);
		query.setParameter(3, datum_od);
		query.setParameter(4, datum_do);
	    return query.getResultList();
	}	
	
}
