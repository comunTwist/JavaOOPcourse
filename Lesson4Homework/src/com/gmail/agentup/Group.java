package com.gmail.agentup;

import java.util.Arrays;

public class Group implements MilitaryOffice {
	private Student[] students = new Student[10];

	public Group(Student[] students) {
		super();
		this.students = students;
	}

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Student[] setStudentInGroup(Student student) throws ArithmeticException {
		int countNull = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				countNull++;
				break;
			}
		}
		if (countNull == 0) {
			throw new ArithmeticException();
		}
		return students;
	}

	public Student[] offsetStudentAfterGroup(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;
				break;
			}
		}
		return students;
	}

	public Student searchStudentInGroup(String surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {
				return students[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		for (int i = students.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (students[j] != null) {
					if (students[j + 1] != null
							&& students[j].getSurname().charAt(0) > students[j + 1].getSurname().charAt(0)) {
						Student tmp = new Student();
						tmp = students[j];
						students[j] = students[j + 1];
						students[j + 1] = tmp;
					}
				} else {
					students[j] = students[j + 1];
					students[j + 1] = null;
				}
			}
		}
		return "Group [students=" + Arrays.toString(students) + "]";
	}

	public Student[] getAdultGuys() {
		Student[] adultGuys = new Student[0];
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSex().equals("m") && students[i].getAge() > 17) {
				Student[] tmp = new Student[adultGuys.length + 1];
				System.arraycopy(adultGuys, 0, tmp, 0, adultGuys.length);
				adultGuys = tmp;
				adultGuys[adultGuys.length - 1] = students[i];
			}
		}
		return adultGuys;
	}
}
