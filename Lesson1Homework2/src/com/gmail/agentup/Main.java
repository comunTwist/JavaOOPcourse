//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Triangle areaOne = new Triangle();
		areaOne.setA(4);
		areaOne.setB(5);
		areaOne.setC(6);
		System.out.println("Area one: " + areaOne.triangleArea());

		Triangle areaTwo = new Triangle();
		areaTwo.setA(8);
		areaTwo.setB(9);
		areaTwo.setC(16);
		System.out.println("Area two: " + areaTwo.triangleArea());
	}

}
