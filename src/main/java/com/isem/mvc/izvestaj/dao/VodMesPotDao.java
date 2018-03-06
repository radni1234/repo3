package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.VodMesPot;

@Repository
public class VodMesPotDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<VodMesPot> vodMesPot(Integer grupa_id, String vod_id, Date datum_od, Date datum_do) {
		
		if (grupa_id == 2) {
			StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_vod_mes_pot")
	                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(1 , Date.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
	                ;
	         
	        storedProcedure.setParameter(0, vod_id);
	        storedProcedure.setParameter(1, datum_od);
	        storedProcedure.setParameter(2, datum_do);
	         
	        List<Object[]> rows = storedProcedure.getResultList();
	        
	        List<VodMesPot> result = new ArrayList<>(rows.size());
	        for (Object[] row : rows) {
				//        	row[0] je id
	            result.add(new VodMesPot((String) row[1],
	            						(String) row[2],
	        							(Double) row[3],
	                                    (Double) row[4],
	                                    (Double) row[5]));
	        }
	        
	        return result;
	        
		} else if (grupa_id == 1) {
			StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_vod_mes_pot_proiz")
	                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(1 , Date.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
	                ;
	         
	        storedProcedure.setParameter(0, vod_id);
	        storedProcedure.setParameter(1, datum_od);
	        storedProcedure.setParameter(2, datum_do);
	         
	        List<Object[]> rows = storedProcedure.getResultList();
	        
	        List<VodMesPot> result = new ArrayList<>(rows.size());
	        for (Object[] row : rows) {
				//        	row[0] je id
	            result.add(new VodMesPot((String) row[1],
	            						(String) row[2],
	        							(Double) row[3],
	                                    (Double) row[4],
	                                    (Double) row[5],
	                                    (Double) row[6],
	                                    (Double) row[7]));
	        }
	        
	        return result;
		}
		
        return null;
	}
}
