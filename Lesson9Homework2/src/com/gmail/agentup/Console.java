package com.gmail.agentup;

import java.util.Scanner;

public class Console {
	public static void setStudent(Scanner scanner, Group group) {
		while (true) {
			System.out.println("Add student (y/n):");
			String select = scanner.nextLine();
			if (select.equals("y")) {
				System.out.println("Input name:");
				String name = scanner.nextLine();
				System.out.println("Input surname:");
				String surname = scanner.nextLine();
				System.out.println("Input sex:");
				String sex = scanner.nextLine();
				System.out.println("Input age:");
				int age = scanner.nextInt();
				System.out.println("Input faculty:");
				String faculty = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Input number of record book:");
				int record = scanner.nextInt();
				System.out.println("Input course number:");
				int course = scanner.nextInt();
				System.out.println("Input medium:");
				int performance = scanner.nextInt();
				try {
					group.setStudentInGroup(new Student(name, surname, sex, age, faculty, record, course, performance));
				} catch (ArithmeticException e) {
					System.out.println("Error: complite group");
				}
			} else if (select.equals("n")) {
				break;
			} else {
				System.out.println("Error: incorrect entry");
			}
		}
	}

	public static void setParam(Scanner scanner, Group group) {
		int param = 0;
		System.out.println("Input sort parametr(1 name,2 surname,3 age, 4 performance): ");
		param = scanner.nextInt();
		if (param == 1) {
			group.getStudents().sort(Console::myCompOne);
		}
		if (param == 2) {
			group.getStudents().sort(Console::myCompTwo);
		}
		if (param == 3) {
			group.getStudents().sort(Console::myCompThree);
		}
		if (param == 4) {
			group.getStudents().sort(Console::myCompFour);
		}
	}

	public static int myCompOne(Student a, Student b) {

		if (CheckNull.checkNull(a, b) != CheckNull.NOT_NULL) {
			return CheckNull.checkNull(a, b);
		}
		return a.getName().compareTo(b.getName());

	}

	public static int myCompTwo(Student a, Student b) {

		if (CheckNull.checkNull(a, b) != CheckNull.NOT_NULL) {
			return CheckNull.checkNull(a, b);
		}
		return a.getSurname().compareTo(b.getSurname());

	}

	public static int myCompThree(Student a, Student b) {

		if (CheckNull.checkNull(a, b) != CheckNull.NOT_NULL) {
			return CheckNull.checkNull(a, b);
		}
		return a.getAge() - b.getAge();

	}

	public static int myCompFour(Student a, Student b) {

		if (CheckNull.checkNull(a, b) != CheckNull.NOT_NULL) {
			return CheckNull.checkNull(a, b);
		}
		return a.getPerformance() - b.getPerformance();

	}

	public static boolean saveData(Scanner scanner, Group group) {
		System.out.println("Save data to file (y/n): ");
		String select = scanner.nextLine();
		if (select.equals("y")) {
			return true;
		}
		return false;
	}

	public static boolean readData(Scanner scanner, Group group) {
		System.out.println("Read from data to file (y/n): ");
		String select = scanner.nextLine();
		if (select.equals("y")) {
			return true;
		}
		return false;
	}
}
