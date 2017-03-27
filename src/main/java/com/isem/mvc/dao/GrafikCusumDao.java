package com.isem.mvc.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.GrafikCusum;

@Repository
public class GrafikCusumDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<GrafikCusum> grafCusumPre(BigInteger mera_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("graf_cusum_pre")
                .registerStoredProcedureParameter(0 , BigInteger.class , ParameterMode.IN);
         
        storedProcedure .setParameter(0, mera_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<GrafikCusum> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new GrafikCusum((Integer) row[0],
        							(Integer) row[1],
                                    (BigDecimal) row[2],
                                    (BigDecimal) row[3]));
        }
        
        return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<GrafikCusum> grafCusumPosle(BigInteger mera_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("graf_cusum_posle")
                .registerStoredProcedureParameter(0 , BigInteger.class , ParameterMode.IN);
         
        storedProcedure .setParameter(0, mera_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<GrafikCusum> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new GrafikCusum((Integer) row[0],
        							(Integer) row[1],
                                    (BigDecimal) row[2],
                                    (BigDecimal) row[3]));
        }
        
        return result;
	}
}
