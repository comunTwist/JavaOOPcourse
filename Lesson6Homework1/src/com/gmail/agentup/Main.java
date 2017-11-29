//Создайте сто потоков которые будут вычислять факториал
//числа равного номеру этого потока и выводить результат на
//экран.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Thread[] thared = new Thread[100];
		for (int i = 0; i < thared.length; i++) {
			thared[i] = new Thread(new FactorialThread(i));
			thared[i].start();
		}

	}

}
