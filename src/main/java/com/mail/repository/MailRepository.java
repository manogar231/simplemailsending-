package com.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mail.model.User;

@Repository
public interface MailRepository extends JpaRepository<User, Integer> {
	

}
