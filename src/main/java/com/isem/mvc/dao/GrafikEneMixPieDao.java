package com.isem.mvc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.GrafikEneMixPie;

@Repository
public class GrafikEneMixPieDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<GrafikEneMixPie> grafEneMixPie(String obj_id, String ene_tip_id,Date datum_od, Date datum_do) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("graf_ene_mix_pie")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class, ParameterMode.IN)
                .registerStoredProcedureParameter(3 , Date.class, ParameterMode.IN);
         
        storedProcedure .setParameter(0, obj_id)
        				.setParameter(1, ene_tip_id)
                        .setParameter(2, datum_od)
                        .setParameter(3, datum_do);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<GrafikEneMixPie> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new GrafikEneMixPie((String) row[0],
            						(Double) row[1],
                                    (Double) row[2],
                                    (Double) row[3],
                                    (Double) row[4]));
        }
        
        return result;
	}
}

