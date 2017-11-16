package com.gmail.agentup;

import java.util.Arrays;

public class Group {
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

	public Student[] setStudentInGroup(Student student) {
		int countNull = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				countNull++;
				break;
			}
		}
		try {
			if (countNull == 0) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("Error: complite group");
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

	public String searchStudentInGroup(String surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {
				i++;
				return "Student " + surname + " number: " + i;
			}
		}
		return "Student " + surname + " no found";
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

	// @Override
	// public String[] toString() {
	// int count=0;
	// for (int i = students.length - 1; i > 0; i--) {
	// if (students[i] != null) {
	// count++;
	// for (int j = 0; j < i; j++) {
	// if (students[j + 1] != null
	// && students[j].getSurname().charAt(0) > students[j +
	// 1].getSurname().charAt(0)) {
	// Student tmp = new Student();
	// tmp = students[j];
	// students[j] = students[j + 1];
	// students[j + 1] = tmp;
	// }
	// }
	// }
	// }
	// String[]result=new String[count];
	// for (int i = 0; i < result.length; i++) {
	// result[i]=students[i].toString();
	// }
	// return result;
	// }

}
