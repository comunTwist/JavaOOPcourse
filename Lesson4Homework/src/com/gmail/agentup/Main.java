//1. Усовершенствуйте класс Group добавив возможность
//интерактивного добавления объекта.
//2. Реализуйте возможность сортировки списка студентов
//по фамилии.
//3. Реализуйте возможность сортировки по параметру
//(Фамилия, успеваемость и т. д.).
//4. Реализуйте интерфейс Военком которые вернет из группы
//массив студентов юношей которым больше 18 лет.
//5. Протестируйте ее работу.

package com.gmail.agentup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Group gr = new Group();
		Student studentOne = new Student("Sam", "Pinkblock", "m", 26, "biology", 1000, 4, 8);
		Student studentTwo = new Student("Kate", "Svetska", "w", 19, "biology", 1001, 1, 9);
		Student studentThree = new Student("Artur", "Balozian", "m", 21, "pedagogue", 1002, 3, 10);
		Student studentFour = new Student("Boris", "Hodeev", "m", 24, "biology", 1003, 4, 7);
		Student studentFive = new Student("Iggy", "Pop", "m", 23, "physics", 1004, 4, 5);
		Student studentSix = new Student("Maria", "De Grazzia", "w", 23, "engineer", 1005, 4, 7);
		Student studentSeven = new Student("Tonia", "Peeva", "w", 19, "engineer", 1006, 1, 9);
		Student studentEight = new Student("Vlad", "Grin", "m", 17, "lawyer", 1007, 1, 4);
		Student[] studentArray = new Student[] { studentOne, studentTwo, studentThree, studentFour, studentFive,
				studentSix, studentSeven, studentEight };
		for (Student student : studentArray) {
			try {
				gr.setStudentInGroup(student);
			} catch (ArithmeticException e) {
				System.out.println("Error: complite group");
			}
		}
		System.out.println("All students:");
		for (Student student : gr.getStudents()) {
			System.out.println(student);
		}
		while (true) {
			System.out.println("Add student (y/n):");
			String select = sc.nextLine();
			if (select.equals("y")) {
				System.out.println("Input name:");
				String name = sc.nextLine();
				System.out.println("Input surname:");
				String surname = sc.nextLine();
				System.out.println("Input sex:");
				String sex = sc.nextLine();
				System.out.println("Input age:");
				int age = sc.nextInt();
				System.out.println("Input faculty:");
				String faculty = sc.nextLine();
				sc.nextLine();
				System.out.println("Input number of record book:");
				int record = sc.nextInt();
				System.out.println("Input course number:");
				int course = sc.nextInt();
				System.out.println("Input medium:");
				int performance = sc.nextInt();
				try {
					gr.setStudentInGroup(new Student(name, surname, sex, age, faculty, record, course, performance));
				} catch (ArithmeticException e) {
					System.out.println("Error: complite group");
				}
			} else if (select.equals("n")) {
				break;
			} else {
				System.out.println("Error: incorrect entry");
			}
		}
		System.out.println("All students:");
		for (Student student : gr.getStudents()) {
			System.out.println(student);
		}
		System.out.println();
		int param = 0;
		System.out.println("Input sort parametr(1 name,2 surname,3 age, 4 performance): ");
		param = sc.nextInt();
		if (param == 1) {
			Arrays.sort(gr.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getName().compareTo(b.getName()));
		}
		if (param == 2) {
			Arrays.sort(gr.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getSurname().compareTo(b.getSurname()));
		}
		if (param == 3) {
			Arrays.sort(gr.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getAge() - b.getAge());
		}
		if (param == 4) {
			Arrays.sort(gr.getStudents(), (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
					? CheckNull.checkNull(a, b) : a.getPerformance() - b.getPerformance());
		}
		System.out.println("All students:");
		for (Student student : gr.getStudents()) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Adult guys:");
		for (Student student : gr.getAdultGuys()) {
			System.out.println(student);
		}
		sc.close();
	}

}
