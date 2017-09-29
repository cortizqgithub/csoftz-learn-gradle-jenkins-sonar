package com.csoftz.learn.gradle.jenkins.sonar.service;

import com.csoftz.learn.gradle.jenkins.sonar.domain.Person;

public class NotifyPersonService {
	private EmailService emailService;

	public NotifyPersonService(EmailService emailService) {
		super();
		this.emailService = emailService;
	}
	
	public String notifyPerson(Person person) {
		String message = "Welcom " + person.getName();
		return emailService.sendMail(message);
	}

}
