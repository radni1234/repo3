package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.EfikObj;

@Repository
public class EfikObjDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<EfikObj> efikObj(String obj_id, String ene_tip_id, Date datum_od, Date datum_do, String indikator) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_efik_obj")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
                .registerStoredProcedureParameter(3 , Date.class , ParameterMode.IN)
                .registerStoredProcedureParameter(4 , String.class , ParameterMode.IN)
                ;
         
        storedProcedure.setParameter(0, obj_id);
        storedProcedure.setParameter(1, ene_tip_id);
        storedProcedure.setParameter(2, datum_od);
        storedProcedure.setParameter(3, datum_do);
        storedProcedure.setParameter(4, indikator);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<EfikObj> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new EfikObj((String) row[0],
        							(String) row[1],
                                    (Double) row[2],
                                    (Double) row[3],
                                    (Double) row[4]));
        }
        
        return result;
	}
}


