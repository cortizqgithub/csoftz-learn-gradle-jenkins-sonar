package com.csoftz.learn.gradle.jenkins.sonar.domain;

public class Person {
	private String name;
	private String lastName;

	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

}
