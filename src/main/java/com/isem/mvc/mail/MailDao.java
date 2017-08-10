package com.isem.mvc.mail;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MailDao {
	@PersistenceContext
	EntityManager entityManager;
	
	private final Log logger = LogFactory.getLog(this.getClass());
	

	public String alarmKorisnik(String kor_id) {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("alarm_korisnik");
		storedProcedure.registerStoredProcedureParameter(0 , String.class , ParameterMode.IN);
         
        storedProcedure.setParameter(0, kor_id);
        
        logger.info("MailDao");
        
        return (String) storedProcedure.getSingleResult();    

	}   
}
