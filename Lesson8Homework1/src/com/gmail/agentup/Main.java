//Используя стандартный методы сериализации создайте мини базу
//данных для работы с группами студентов (возможность записи и чтения
//базы из файла по запросу пользователя).

package com.gmail.agentup;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Group groupOne = new Group();
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
				groupOne.setStudentInGroup(student);
			} catch (ArithmeticException e) {
				System.out.println("Error: complite group");
			}
		}
		File base = new File("base.txt");
		
		if(Console.saveData(sc, groupOne)){
			Base.saveObject(groupOne, base);
		}
		
		if(Console.readData(sc, groupOne)){
			Group baseGroup = (Group) Base.readObject(base);
			System.out.println(baseGroup);
		}
		
		sc.close();
	}

}
