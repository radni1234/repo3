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
//	    query.setParameter("param1", arg1);
//	    query.setParameter("param2", arg2);
	    return query.getResultList();
	}

}
