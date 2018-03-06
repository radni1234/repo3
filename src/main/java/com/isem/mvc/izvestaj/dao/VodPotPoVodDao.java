package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.VodPotPoVod;

@Repository
public class VodPotPoVodDao {
	@PersistenceContext
	EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	public List<VodPotPoVod> vodPotPoVod(Integer grupa_id, String vod_id, Date datum_od, Date datum_do) {
		
		if (grupa_id == 2) {
			StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_vod_pot_po_vod")
	                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(1 , Date.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
	                ;
	         
	        storedProcedure.setParameter(0, vod_id);
	        storedProcedure.setParameter(1, datum_od);
	        storedProcedure.setParameter(2, datum_do);
	         
	        List<Object[]> rows = storedProcedure.getResultList();
	        
	        List<VodPotPoVod> result = new ArrayList<>(rows.size());
	        for (Object[] row : rows) {
				//        	row[0] je id
	        	result.add(new VodPotPoVod((String) row[1],            					
						(Double) row[2],
	                    (Double) row[3],
	                    (Double) row[4]));
	        }
	        
	        return result;
		} else if (grupa_id == 1) {
			
			StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_vod_pot_po_vod_proiz")
	                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(1 , Date.class , ParameterMode.IN)
	                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
	                ;
	         
	        storedProcedure.setParameter(0, vod_id);
	        storedProcedure.setParameter(1, datum_od);
	        storedProcedure.setParameter(2, datum_do);
	         
	        List<Object[]> rows = storedProcedure.getResultList();
	        
	        List<VodPotPoVod> result = new ArrayList<>(rows.size());
	        for (Object[] row : rows) {
				//        	row[0] je id
	        	result.add(new VodPotPoVod((String) row[1],            					
						(Double) row[2],
	                    (Double) row[3],
	                    (Double) row[4],
	                    (Double) row[5],
	                    (Double) row[6]));
	        }
	        
	        return result;
			
		}
		
		 return null;
	}
}
