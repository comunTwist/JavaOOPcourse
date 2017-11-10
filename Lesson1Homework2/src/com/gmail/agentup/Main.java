//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Triangle areaOne = new Triangle();
		areaOne.setA(2);
		areaOne.setB(2);
		areaOne.setC(2.8);
		System.out.println("Area one: " + areaOne.triangleArea());

		Triangle areaTwo = new Triangle();
		areaTwo.setA(8);
		areaTwo.setB(9);
		areaTwo.setC(16);
		System.out.println("Area two: " + areaTwo.triangleArea());
	}

}
