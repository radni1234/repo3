package com.isem.mvc.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduling {
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
    public EmailServiceImpl emailServiceImp;
	
	@Scheduled(cron = "0 0 6 ? * MON-FRI")
    public void reportCurrentTime() {
		logger.info("@Scheduled radi!!!");
		emailServiceImp.sendSimpleMessage("rkoledin@yahoo.com","test","scheduer");  
    }
}
