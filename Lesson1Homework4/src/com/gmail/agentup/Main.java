//Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//класс Network (сеть мобильного оператора).
//Телефон должен иметь метод
//регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//(номер другого телефона), который переберет все телефоны, зарегистрированные в
//сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
//о неправильности набранного номера.

package com.gmail.agentup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] phoneNumbers = new int[2];
		for (int i = 0; i < phoneNumbers.length; i++) {
			phoneNumbers[i] = (int) (1000000 + Math.random() * 10000000);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your phone number: ");
		int myNumber = sc.nextInt();

		Phone myPhone = new Phone();
		myPhone.setPhoneNumber(myNumber);

		Network base = new Network(phoneNumbers);
		base.setPhoneNumbers(myPhone.regInNetwork(base.getPhoneNumbers(), myPhone.getPhoneNumber()));

		System.out.println("Network base: " + Arrays.toString(base.getPhoneNumbers()));
		System.out.println("Input call number: ");
		int searchPhone = sc.nextInt();

		int id = 0;
		for (int i = 0; i < base.getPhoneNumbers().length; i++) {
			if (base.getPhoneNumbers()[i] == searchPhone && searchPhone != myNumber) {
				id = i + 1;
				break;
			}
		}

		if (id != 0) {
			System.out.println("Call " + searchPhone);
		} else {
			System.out.println("Invalid number");
		}
		sc.close();
	}

}
