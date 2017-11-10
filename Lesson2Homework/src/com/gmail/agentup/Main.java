//1. Создайте абстрактный класс Shape в котором есть два
//абстрактных метода double getPerimetr() и double getArea().
//2. Создайте класс Point в котором есть два свойства double x
//double y.
//3. Создайте классы которые описывают как минимум 3
//геометрические фигуры (они должны быть подклассами
//Shape), при этом они в качестве свойств должны содержать
//классы Point.
//4. Создайте класс доска. Доска поделена на 4 части в каждую
//часть доски можно положить одну из фигур. У доски должны
//быть методы которые помещают и удаляют фигуру с доски.
//Также должен быть метод который выводит информацию о
//всех фигурах лежащих на доске и их суммарную площадь.
//5. * Нарисуйте UML диаграмму проекта

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(2,0);
		
		Triangle tr = new Triangle(a,b,c);
		System.out.println(tr.getPerimetr());
		System.out.println(tr.getArea());
		
		Rectangle rc= new Rectangle(a,b);
		System.out.println(rc.getPerimetr());
		System.out.println(rc.getArea());
		
		Circle cr= new Circle(a,b);
		System.out.println(cr.getPerimetr());
		System.out.println(cr.getArea());
	}

}
