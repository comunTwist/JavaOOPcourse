package com.gmail.agentup;

public class Person {
	private String name;
	private String surname;
	private String sex;
	private int age;

	public Person(String name, String surname, String sex, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", sex=" + sex + ", age=" + age;
	}
}
