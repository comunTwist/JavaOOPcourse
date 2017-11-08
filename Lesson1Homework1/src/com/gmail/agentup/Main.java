//Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
//Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
//класса. Использовать эти объекты.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat(4, 4.5, "male", "white", "May");
		System.out.println("Cat one: " + catOne);
		catOne.setAge(5);
		catOne.setWeigth(5);
		System.out.println("Cat one: " + catOne);

		System.out.println();

		Cat catTwo = new Cat();
		catTwo.setColor("Gray");
		catTwo.setVoice("Mrrr");
		System.out.println("Cat two: " + catTwo.getColor() + ", " + catTwo.getVoice());

		System.out.println();

		Cat catThree = catTwo;
		catThree.setAge(7);
		catThree.setSex("male");
		System.out.println("Cat three: " + catThree);
		
		System.out.println();
		
		System.out.println("Cat two: " + catTwo.getAge() + ", " + catTwo.isSex() + ", " + catTwo.getColor() + ", "
				+ catTwo.getVoice());
	}

}
