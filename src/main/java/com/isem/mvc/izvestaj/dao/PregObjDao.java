package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.PregObj;

@Repository
public class PregObjDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<PregObj> pregObj(String obj_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_preg_obj")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                ;
         
        storedProcedure.setParameter(0, obj_id);

         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<PregObj> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
            result.add(new PregObj((String) row[0],
        							(BigDecimal) row[1],
                                    (BigDecimal) row[2],
                                    (BigDecimal) row[3],
                                    (BigDecimal) row[4],
                                    (BigDecimal) row[5],
                                    (BigDecimal) row[6]));
        }
        
        return result;
	}
}

