package com.gmail.agentup;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String faculty;
	private int record;
	private int course;
	private int performance;

	public Student(String name, String surname, String sex, int age, String faculty, int record, int course,
			int performance) {
		super(name, surname, sex, age);
		this.faculty = faculty;
		this.record = record;
		this.course = course;
		this.performance = performance;
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

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", faculty=" + faculty + ", record=" + record + ", course=" + course
				+ ", performance=" + performance + "]";
	}
}
