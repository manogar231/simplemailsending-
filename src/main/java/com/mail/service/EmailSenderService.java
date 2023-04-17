package com.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mail.MailRepository.MailRepository;
import com.mail.model.User;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender; 
	
	@Autowired
	private MailRepository mailRepository;
	
	//FOR SAVE THE DETAILS IN DATABASE
	public Object saveMailinfo(User user) {
		
		User users=new User();
    	users.setFromMail(user.getFromMail());
    	users.setTomail(user.getTomail());
    	users.setBody(user.getBody());
    	users.setSubject(user.getSubject());
    	sendmail(users);
    	
    	return mailRepository.save(users);
    	 
	}	
       //SENDING THE MAIL	
	public Object sendmail(User user) {
		
	SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom(user.getFromMail());
		message.setTo(user.getTomail());
		message.setText(user.getBody());
		message.setSubject(user.getSubject());
		mailSender.send(message);
		
		return "Mail Sending Successfully";
		
	}
}
	