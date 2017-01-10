package com.isem.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.RnProc;

@Repository
public class RnProcDaoCustomImpl implements RnProcDaoCustom {
	@PersistenceContext
	EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<RnProc> vratiRn() {
		Query query = entityManager.createNamedQuery("rn_proc");
	    return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RnProc> vratiRnObj(Long obj_id) {
		Query query = entityManager.createNamedQuery("rn_obj_proc");
		query.setParameter(1, obj_id);
	    return query.getResultList();
	}

}
