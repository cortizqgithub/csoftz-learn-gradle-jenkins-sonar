package com.csoftz.learn.gradle.jenkins.sonar.test.databuilder;

import com.csoftz.learn.gradle.jenkins.sonar.domain.Person;

public class PersonTestDataBuilder {
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "Ceiba";
		this.lastName = "Software House";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(this.name, this.lastName);
	}
}
