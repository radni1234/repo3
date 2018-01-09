package com.isem.mvc.mail;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MailTekstDao {
	@PersistenceContext
	EntityManager entityManager;
	
	private final Log logger = LogFactory.getLog(this.getClass());
	

	public String alarmKorisnikProc(Long kor_id) {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("alarm_korisnik");
		storedProcedure.registerStoredProcedureParameter(0 , Long.class , ParameterMode.IN);
         
        storedProcedure.setParameter(0, kor_id);
        
        logger.info("MailDao - korisnik");
        
        return (String) storedProcedure.getSingleResult();    

	}   
	
	public String alarmMenadzerProc(Long men_id) {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("alarm_menadzer");
		storedProcedure.registerStoredProcedureParameter(0 , Long.class , ParameterMode.IN);
         
        storedProcedure.setParameter(0, men_id);
        
        logger.info("MailDao - menadzer");
        
        return (String) storedProcedure.getSingleResult();    

	} 
	
	public void alarmTrendIzracunajProc() {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("trend_izracunaj_pokretanje");
	        
        logger.info("trend_izracunaj");
        storedProcedure.execute();
//        return (String) storedProcedure.getSingleResult();    

	} 
	
	public String alarmTrendPorukaProc(Long kor_id) {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("trend_poruka");
		storedProcedure.registerStoredProcedureParameter(0 , Long.class , ParameterMode.IN);
         
        storedProcedure.setParameter(0, kor_id);
        
        logger.info("trend_poruka");
        
        return (String) storedProcedure.getSingleResult();    

	} 
}
