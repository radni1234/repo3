package com.isem.mvc.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.isem.mvc.model.security.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service
public class MailClient {
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
    private JavaMailSender mailSender;
    
    public void SendKorisnik(User u, String content){
    	mailSender.send(new MimeMessagePreparator() {
    		
    	   public void prepare(MimeMessage mimeMessage) throws MessagingException {    	     
    	     
    	    	 MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        	     message.setFrom("isem@vrbas.net");
        	     message.setTo("rkoledin@yahoo.com");
//        	     message.setTo(u.getMail());
        	     message.setSubject("ISEM alarm");
    	    	 message.setText(content, true);
//        	     message.setText("my text <img src='cid:myLogo'>", true);
//        	     message.addInline("myLogo", new ClassPathResource("img/mylogo.gif"));
//        	     message.addAttachment("myDocument.pdf", new ClassPathResource("doc/myDocument.pdf"));
    	    	 
    	    	 logger.info("@korisnik " + u.getId() + " salje!!!");
    	     }  
    	 
    	 });
    } 
    
    
    public void SendMenadzer(User u, String content){
    	mailSender.send(new MimeMessagePreparator() {
    		
    	   public void prepare(MimeMessage mimeMessage) throws MessagingException {
    	     MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
    	     message.setFrom("isem@vrbas.net");
    	     message.setTo("rkoledin@yahoo.com");
//    	     message.setTo(u.getMail());
    	     message.setSubject("ISEM alarm");
    	     message.setText(content, true);
//    	     message.setText("my text <img src='cid:myLogo'>", true);
//    	     message.addInline("myLogo", new ClassPathResource("img/mylogo.gif"));
//    	     message.addAttachment("myDocument.pdf", new ClassPathResource("doc/myDocument.pdf"));

    	     logger.info("@manager " + u.getId() + " salje!!!");

    	   }
    	 });
    }

}