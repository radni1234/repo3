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
	

	@Scheduled(cron = "0 0 6 ? * MON-FRI")
    public void reportCurrentTime() {
		logger.info("@Scheduled radi!!!");
		
		List<User> korisnici = korisnikDao.korisnikAlarm();		

	    for (User u : korisnici) {
	    	mailClient.SendKorisnik(u);
	    }
		
	    List<User> menadzeri = korisnikDao.menadzerAlarm();	
	    
	    for (User u : menadzeri) {
	    	mailClient.SendMenadzer(u);
	    }

    }	

}
