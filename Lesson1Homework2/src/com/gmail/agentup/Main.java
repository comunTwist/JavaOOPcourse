//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Triangle areaOne = new Triangle();
		Triangle areaTwo = new Triangle();
		System.out.println("Area one: " + areaOne.triangleArea(4, 5, 6));
		System.out.println("Area two: " + areaTwo.triangleArea(8, 11, 14));
	}

}
