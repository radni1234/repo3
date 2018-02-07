package com.isem.mvc.mail;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.dao.KorisnikDao;
import com.isem.mvc.model.security.User;

@RestController
@RequestMapping("/mail")
public class MailController {
private final Log logger = LogFactory.getLog(this.getClass());
	
	
	@Autowired
    public MailClient mailClient;
	
	@Autowired
    public KorisnikDao korisnikDao;
	
	@Autowired
	private MailTekstDao mailTekstDao;
	
	
	@RequestMapping(value="/racuni", method=RequestMethod.GET)
    public void alarmRacuni() {
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
	
	
	@RequestMapping(value="/trend", method=RequestMethod.GET)
    public void alarmTrend() {
		mailTekstDao.alarmTrendIzracunajProc();
		
		List<User> menadzeri = korisnikDao.trendAlarm();	
	    
	    for (User u : menadzeri) {
	    	logger.info("@menadzer trend " + u.getId() + " pocetak!!!");
	    	String content =  mailTekstDao.alarmTrendPorukaProc(u.getId());
	    	logger.info(content);
	    	logger.info(content.length());
	    	if (content.length() > 1) {
	    		mailClient.SendMenadzer(u, content);
	    	}
	    }
	}
}
