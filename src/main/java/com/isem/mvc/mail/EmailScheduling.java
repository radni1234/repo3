package com.isem.mvc.mail;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.isem.mvc.dao.KorisnikDao;
import com.isem.mvc.model.security.User;

@Component
public class EmailScheduling {
	private final Log logger = LogFactory.getLog(this.getClass());
	
	
	@Autowired
    public MailClient mailClient;
	
	@Autowired
    public KorisnikDao korisnikDao;
	
	@Autowired
	private MailTekstDao mailTekstDao;
	

	@Scheduled(cron = "0 37 11 ? * MON-FRI")
    public void reportCurrentTime() {
		logger.info("@Scheduled radi!!!");
		
		List<User> korisnici = korisnikDao.korisnikAlarm();		

	    for (User u : korisnici) {
	    	logger.info("@korisnik " + u.getId() + " pocetak!!!");
	    	String content =  mailTekstDao.alarmKorisnikProc(u.getId());  
	    	logger.info(content);
	    	
	    	logger.info(content.length());
	    	
	    	if (content.length() > 1) {
	    		mailClient.SendKorisnik(u, content);
	    	}
	    }
		
	    List<User> menadzeri = korisnikDao.menadzerAlarm();	
	    
	    for (User u : menadzeri) {
	    	logger.info("@menadzer " + u.getId() + " pocetak!!!");
	    	String content =  mailTekstDao.alarmMenadzerProc(u.getId());
	    	logger.info(content);
	    	logger.info(content.length());
	    	if (content.length() > 1) {
	    		mailClient.SendMenadzer(u, content);
	    	}
	    }

    }	

}
