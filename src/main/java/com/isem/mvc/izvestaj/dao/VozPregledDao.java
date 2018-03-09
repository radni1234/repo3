package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.VozPregled;

@Repository
public class VozPregledDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<VozPregled> vozPregled(String voz_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_voz_pregled")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                ;
         
        storedProcedure.setParameter(0, voz_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<VozPregled> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new VozPregled((String) row[0],
        							(String) row[1],
                                    (String) row[2],
                                    (String) row[3],
                                    (Integer) row[4],
                                    (Integer) row[5],
                                    (String) row[6]));
        }
        
        return result;
	}
}
