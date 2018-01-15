package com.isem.mvc.izvestaj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.izvestaj.RasMesPot;

@Repository
public class RasMesPotDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<RasMesPot> rasMesPot(String trafo_id, Date datum_od, Date datum_do) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("izv_ras_mes_pot")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN)
                .registerStoredProcedureParameter(1 , Date.class , ParameterMode.IN)
                .registerStoredProcedureParameter(2 , Date.class , ParameterMode.IN)
                ;
         
        storedProcedure.setParameter(0, trafo_id);
        storedProcedure.setParameter(1, datum_od);
        storedProcedure.setParameter(2, datum_do);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        List<RasMesPot> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
			//        	row[0] je id
            result.add(new RasMesPot((String) row[1],
            						(String) row[2],
        							(Double) row[3],
                                    (Double) row[4],
                                    (Double) row[5]));
        }
        
        return result;
	}
}
