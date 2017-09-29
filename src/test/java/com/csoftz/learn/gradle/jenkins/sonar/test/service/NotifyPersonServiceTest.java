package com.csoftz.learn.gradle.jenkins.sonar.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.csoftz.learn.gradle.jenkins.sonar.domain.Person;
import com.csoftz.learn.gradle.jenkins.sonar.service.EmailService;
import com.csoftz.learn.gradle.jenkins.sonar.service.NotifyPersonService;
import com.csoftz.learn.gradle.jenkins.sonar.test.databuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;

	@Before
	public void setup() {
		//emailService = new EmailService();
		emailService = Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		// Arrange
		Person person = new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendMail(Mockito.anyString())).thenReturn("Hello World");

		// Act
		String message = notifyPersonService.notifyPerson(person);
		
		// Assert
		System.out.println(message);
		assertNotNull(message);		
	}
}
