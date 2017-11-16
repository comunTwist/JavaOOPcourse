package com.gmail.agentup;

public class Student extends Person {
	private String faculty;
	private int record;
	private int course;

	public Student(String name, String surname, String sex, int age, String faculty, int record, int course) {
		super(name, surname, sex, age);
		this.faculty = faculty;
		this.record = record;
		this.course = course;
	}

	public Student() {
		super();
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "faculty=" + faculty + ", record=" + record + ", course=" + course
				+ "]";
	}

}
