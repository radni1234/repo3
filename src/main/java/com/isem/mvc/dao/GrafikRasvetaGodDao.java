package com.isem.mvc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.GrafikRasvetaGod;

@Repository
public class GrafikRasvetaGodDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<GrafikRasvetaGod> grafRasvetaGod(String trafo_id, Date datum_od, Date datum_do) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("graf_rasveta_god")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , Date.class, ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class, ParameterMode.IN);
         
        storedProcedure .setParameter(0, trafo_id)
                        .setParameter(1, datum_od)
                        .setParameter(2, datum_do);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<GrafikRasvetaGod> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new GrafikRasvetaGod((String) row[0],(Double) row[1], (Double) row[2], (Double) row[3]
									)          		
            		
            		);
        }
        
        return result;
	}
}
