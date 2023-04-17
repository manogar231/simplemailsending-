package com.mail.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fromMail")
	private String fromMail;
	@Column(name="tomail")
    private String toMail;
	@Column(name="subject")
	private String subject;
	@Column(name="body")
	private String body;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFromMail() {
		return fromMail;
	}
	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}
	
	public String getTomail() {
		return toMail;
	}
	public void setTomail(String tomail) {
		this.toMail = tomail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
