package com.gmail.agentup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Group implements MilitaryOffice, Serializable {
	private static final long serialVersionUID = 1L;
	private List<Student> students = new ArrayList<>();

	public Group(List<Student> students) {
		super();
		this.students = students;
	}

	public Group() {
		super();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> setStudentInGroup(Student student) throws ArithmeticException {
		int countNull = 0;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) == null) {
				students.set(i, student);
				countNull++;
				break;
			}
		}
		if (countNull == 0) {
			throw new ArithmeticException();
		}
		return students;
	}

	public List<Student> offsetStudentAfterGroup(Student student) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) == student) {
				students.set(i, null);
				break;
			}
		}
		return students;
	}

	public Student searchStudentInGroup(String surname) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null && students.get(i).getSurname().equals(surname)) {
				return students.get(i);
			}
		}
		return null;
	}

	public List<Student> getAdultGuys() {
		List<Student> adultGuys = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null && students.get(i).getSex().equals("m") && students.get(i).getAge() > 17) {
				adultGuys.add(students.get(i));
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
