//1)Создайте класс описывающий человека (создайте метод
//выводящий информацию о человеке)
//2)На его основе создайте класс студент (переопределите
//метод вывода информации)
//3)Создайте класс группа — который содержит массив из 10
//объектов класса студент. Реализуйте методы добавления,
//удаления студента и метод поиска студента по фамилии. В
//случае
//попытки добавления 11 студента создайте
//собственное исключение и обработайте его. Определите
//метод toString() для группы так, что бы он выводил список
//студентов в алфавитном порядке.
//4) * Нарисуйте UML диаграмму проекта

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Person ps = new Person("Sam", "Pinkblock", "m", 26);
		System.out.println(ps);
		System.out.println();
		Student studentOne = new Student("Sam", "Pinkblock", "m", 26, "biology", 1000, 4);
		Student studentTwo = new Student("Kate", "Svetska", "w", 19, "biology", 1001, 1);
		Student studentThree = new Student("Artur", "Balozian", "m", 21, "pedagogue", 1002, 3);
		Student studentFour = new Student("Boris", "Hodeev", "m", 24, "biology", 1003, 4);
		Student studentFive = new Student("Iggy", "Pop", "m", 23, "physics", 1004, 4);
		Student studentSix = new Student("Maria", "De Grazzia", "w", 23, "engineer", 1005, 4);
		Student studentSeven = new Student("Tonia", "Peeva", "w", 19, "engineer", 1006, 1);
		Student studentEight = new Student("Vlad", "Grin", "m", 20, "lawyer", 1007, 2);
		Student studentNine = new Student("Pitter", "Griffin", "m", 17, "biology", 1008, 1);
		Student studentTen = new Student("Lia", "Borisenko", "w", 18, "engineer", 1009, 1);
		Student studentEleven = new Student("John", "Stalevar", "m", 25, "physics", 1010, 5);
		System.out.println(studentOne);
		System.out.println();
		Group gr = new Group();
		gr.setStudentInGroup(studentOne);
		gr.setStudentInGroup(studentTwo);
		gr.setStudentInGroup(studentThree);
		gr.setStudentInGroup(studentFour);
		gr.setStudentInGroup(studentFive);
		gr.setStudentInGroup(studentSix);
		gr.setStudentInGroup(studentSeven);
		gr.setStudentInGroup(studentEight);
		gr.setStudentInGroup(studentNine);
		gr.setStudentInGroup(studentTen);
		gr.setStudentInGroup(studentEleven);
		System.out.println("11 students err: "+gr);
		System.out.println();
		gr.offsetStudentAfterGroup(studentOne);
		gr.offsetStudentAfterGroup(studentThree);
		System.out.println("8 students: "+gr);
		System.out.println();
		gr.setStudentInGroup(studentEleven);
		System.out.println("9 students: "+gr);
		System.out.println();
		System.out.println(gr.searchStudentInGroup("Svetska"));
		System.out.println(gr.searchStudentInGroup("Pinkblock"));
		System.out.println(gr.searchStudentInGroup("Stalevar"));
		
	}

}
