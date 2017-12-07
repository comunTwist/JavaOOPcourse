//Написать метод, который создаст список, положит в него 10
//элементов, затем удалит первые два и последний, а затем выведет
//результат на экран

package com.gmail.agentup;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add((int) (Math.random() * 10));

		}
		System.out.println("Before: " + myList);
		myList.remove(0);
		myList.remove(0);
		myList.remove(myList.size() - 1);
		System.out.println("After: " + myList);
	}

}
