package com.gmail.agentup;

import java.util.Arrays;
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
			Arrays.sort(group.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getName().compareTo(b.getName()));
		}
		if (param == 2) {
			Arrays.sort(group.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getSurname().compareTo(b.getSurname()));
		}
		if (param == 3) {
			Arrays.sort(group.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getAge() - b.getAge());
		}
		if (param == 4) {
			Arrays.sort(group.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getPerformance() - b.getPerformance());
		}
	}
}
