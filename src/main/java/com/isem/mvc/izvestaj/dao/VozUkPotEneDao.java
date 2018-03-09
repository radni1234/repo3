package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.VozUkPotEne;

	
@Repository
public class VozUkPotEneDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<VozUkPotEne> vozUkPotEne(String voz_id, String ene_id, Date datum_od, Date datum_do) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_voz_uk_pot_ene")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
                .registerStoredProcedureParameter(3 , Date.class , ParameterMode.IN)
                ;
         
        storedProcedure.setParameter(0, voz_id);
        storedProcedure.setParameter(1, ene_id);
        storedProcedure.setParameter(2, datum_od);
        storedProcedure.setParameter(3, datum_do);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<VozUkPotEne> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new VozUkPotEne((String) row[0],
        							(String) row[1],
                                    (String) row[2],
                                    (Double) row[3],
                                    (Double) row[4],
                                    (Double) row[5],
                                    (Double) row[6]));
        }
        
        return result;
	}

}
