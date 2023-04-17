package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.model.User;
import com.mail.service.EmailSenderService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class MailController {
	
	
	@Autowired 
	private EmailSenderService emailSenderService;
	
	
	@PostMapping("/sendmail")
	 public ResponseEntity<Object> savemailinfo(@RequestBody User user){
		 return  ResponseEntity.ok().body(emailSenderService.saveMailinfo(user));
	 }
	
}
