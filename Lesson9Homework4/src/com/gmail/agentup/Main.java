//Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди
//за «двойной колой». Как только человек выпьет такой колы он
//раздваивается и оба становятся в конец очереди, что бы выпить еще
//стаканчик.
//Напишите программу которая выведет на экран
//состояние очереди в зависимости от того сколько стаканов колы
//выдал аппарат с чудесным напитком. Например если было выдано
//только два стакана, то очередь выглядит как:
//[Volovitc, Kutrapalli, Penny,Sheldon,Sheldon,Leonard,Leonard]

package com.gmail.agentup;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		
		ArrayDeque<String> cokeQueue = new ArrayDeque<>();
		cokeQueue.addLast("Sheldon");
		cokeQueue.addLast("Leonard");
		cokeQueue.addLast("Volovitc");
		cokeQueue.addLast("Kutrapalli");
		cokeQueue.addLast("Penny");
		
		System.out.println("Before: " + cokeQueue);
		glassesCounter(cokeQueue, 8);
		System.out.println("After: " + cokeQueue);

	}

	public static void glassesCounter(ArrayDeque<String> queue, int count) {
		for (int i = 0; i < count; i++) {
			String tmp = queue.poll();
			for (int j = 0; j < 2; j++) {
				queue.addLast(tmp);
			}
		}
	}

}
