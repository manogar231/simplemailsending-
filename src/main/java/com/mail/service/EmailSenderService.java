package com.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mail.model.UserDto;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;
	@Value(value = "${spring.mail.username}")
    private	String fromMail;
	
	// SENDING THE MAIL
	public Object sendmail(UserDto user) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(fromMail);
		message.setTo(user.getmail());
		message.setText(user.getResetOtp());
		message.setSubject("OTP For Reset Password");
		mailSender.send(message);
		return "Mail Sending Successfully";
	}
}
