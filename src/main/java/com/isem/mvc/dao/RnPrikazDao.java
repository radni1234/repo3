package com.isem.mvc.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.RnPrikaz;

@Repository
public class RnPrikazDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<RnPrikaz> rnPrikaz(String bro_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("rn_prikaz")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN);
         
        storedProcedure .setParameter(0, bro_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        return generisiPrikaz(rows);
	}
	
	@SuppressWarnings("unchecked")
	public List<RnPrikaz> rnPrikazKotlarnica(String kot_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("rn_prikaz_kotlarnica")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN);
         
        storedProcedure .setParameter(0, kot_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        return generisiPrikaz(rows);
	}
	
	@SuppressWarnings("unchecked")
	public List<RnPrikaz> rnPrikazVodozahvat(String vod_id) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("rn_prikaz_vodozahvat")
                .registerStoredProcedureParameter(0 , String.class , ParameterMode.IN);
         
        storedProcedure .setParameter(0, vod_id);
         
        List<Object[]> rows = storedProcedure.getResultList();
        
        return generisiPrikaz(rows);
	}
	
	
	private List<RnPrikaz> generisiPrikaz(List<Object[]> rows){
		List<RnPrikaz> result = new ArrayList<>(rows.size());
        for (Object[] row : rows) {
        	Integer duzina = row.length;
        	if (duzina == 24) {
        		result.add(new RnPrikaz((BigInteger) row[0],
            						(String) row[1],
            						(String) row[2],
            						(String) row[3],
                                    (String) row[4],
                                    (String) row[5],
                                    (String) row[6],
                                    (String) row[7],
                                    (Date) row[8],
                                    (String) row[9],
                                    (String) row[10],
                                    (Date) row[11],
                                    (String) row[12],
                                    (Date) row[13],                      
                                    (BigDecimal) row[14],
                                    (BigDecimal) row[15],
                                    (BigDecimal) row[16],
				            		(BigDecimal) row[17],
				                    (BigDecimal) row[18],
				                    (BigDecimal) row[19],
            						(BigDecimal) row[20],
                                    (BigDecimal) row[21],
                                    (BigDecimal) row[22],
                                    (BigDecimal) row[23]));
        	} else if (duzina == 23) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17],
	                    (BigDecimal) row[18],
	                    (BigDecimal) row[19],
						(BigDecimal) row[20],
                        (BigDecimal) row[21],
                        (BigDecimal) row[22]));
        	} else if (duzina == 22) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17],
	                    (BigDecimal) row[18],
	                    (BigDecimal) row[19],
						(BigDecimal) row[20],
                        (BigDecimal) row[21]));
        	} else if (duzina == 21) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17],
	                    (BigDecimal) row[18],
	                    (BigDecimal) row[19],
						(BigDecimal) row[20]));
        	} else if (duzina == 20) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17],
	                    (BigDecimal) row[18],
	                    (BigDecimal) row[19]));
        	} else if (duzina == 19) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17],
	                    (BigDecimal) row[18]));
        	} else if (duzina == 18) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16],
	            		(BigDecimal) row[17]));
        	}  else if (duzina == 17) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15],
                        (BigDecimal) row[16]));
			} else if (duzina == 16) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14],
                        (BigDecimal) row[15]));
			}	else if (duzina == 15) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13],                      
                        (BigDecimal) row[14]));
			}	else if (duzina == 14) {
        		result.add(new RnPrikaz((BigInteger) row[0],
						(String) row[1],
						(String) row[2],
						(String) row[3],
                        (String) row[4],
                        (String) row[5],
                        (String) row[6],
                        (String) row[7],
                        (Date) row[8],
                        (String) row[9],
                        (String) row[10],
                        (Date) row[11],
                        (String) row[12],
                        (Date) row[13]));
			}
        }
        
        return result;        
        
	}
}
