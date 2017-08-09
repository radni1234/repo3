package com.isem.mvc.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {
	@Autowired
	 private JavaMailSender mailSender;
	 
    
//    public void MailService(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
// 
//    public void prepareAndSend(String recipient, String message) {
//        //TODO implement
//    }
  
//    @Autowired
//    public JavaMailSender emailSender;
//  
	
	public void prepareAndSend(String recipient, String message) {
	    MimeMessagePreparator messagePreparator = mimeMessage -> {
	        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
	        messageHelper.setFrom("isem@vrbas.net");
	        messageHelper.setTo(recipient);
	        messageHelper.setSubject("Sample mail subject");
	        messageHelper.setText(message);
	    };
	    try {
	        mailSender.send(messagePreparator);
	    } catch (MailException e) {
	        // runtime exception; compiler will not force you to handle it
	    }
	}
	
    public void sendSimpleMessage(
      String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("isem@vrbas.net");
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
 //       emailSender.send(message);
     
    }
}