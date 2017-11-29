//Существуют три корабля. На каждом из них 10 ящиков груза.
//Они одновременно прибыли в порт в котором только два
//дока. Скорость разгрузки 1 ящик в 0.5 сек. Напишите
//программу которая управляя кораблями позволит им
//правильно разгрузить груз.

package com.gmail.agentup;

public class Main {

	public static void main(String[] args) {
		Dock dock = new Dock();
		Ship shipOne = new Ship(dock, 10, "Black");
		Ship shipTwo = new Ship(dock, 10, "White");
		Ship shipThree = new Ship(dock, 10, "Yellow");
		Port port = new Port(dock);
		
		Thread tharedShipOne = new Thread(shipOne);
		Thread tharedShipTwo = new Thread(shipTwo);
		Thread tharedShipThree = new Thread(shipThree);
		Thread tharedPort = new Thread(port);
		
		tharedShipOne.start();
		//tharedShipTwo.start();
		//tharedShipThree.start();
		tharedPort.start();
		//System.out.println("jjk");
		
	}

}
