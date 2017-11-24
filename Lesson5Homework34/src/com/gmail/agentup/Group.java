package com.gmail.agentup;

import java.io.*;

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

	public void saveGroupToFile(File file, String string) {
		createFileGroup(file);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(string);
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public void createFileGroup(File file) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public Group createGroupFromFile(File file) {
		Group group = new Group();
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		for (String student : sb.toString().split(System.lineSeparator())) {
			String[] param = student.split("[=,]");
			String name = param[1];
			String surname = param[3];
			String sex = param[5];
			int age = Integer.parseInt(param[7]);
			String faculty = param[9];
			int record = Integer.parseInt(param[11]);
			int course = Integer.parseInt(param[13]);
			int performance = Integer.parseInt(param[15].split("]")[0]);
			group.setStudentInGroup(new Student(name, surname, sex, age, faculty, record, course, performance));
		}
		return group;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Student student : students) {
			if (student != null) {
				sb.append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
}
