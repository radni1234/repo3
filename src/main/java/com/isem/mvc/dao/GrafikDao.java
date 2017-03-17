package com.isem.mvc.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.Grafik;

@Repository
public class GrafikDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Grafik> grafEfikObjKwhPov(String obj_id, Date datum_od, Date datum_do) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("graf_efik_obj_kwh_pov")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , Date.class, ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class, ParameterMode.IN);
         
        storedProcedure .setParameter(0, obj_id)
                        .setParameter(1, datum_od)
                        .setParameter(2, datum_do);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<Grafik> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new Grafik((String) row[0],
                                    (BigDecimal) row[1],
                                    (BigDecimal) row[2]));
        }
        
        return result;
	}
}
