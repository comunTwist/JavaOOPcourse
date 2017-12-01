//Существуют три корабля. На каждом из них 10 ящиков груза.
//Они одновременно прибыли в порт в котором только два
//дока. Скорость разгрузки 1 ящик в 0.5 сек. Напишите
//программу которая управляя кораблями позволит им
//правильно разгрузить груз.

package com.gmail.agentup;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Dock dock = new Dock(500);
		Ship shipOne = new Ship(dock, 11, "Puer");
		Ship shipTwo = new Ship(dock, 9, "Chesterfield");
		Ship shipThree = new Ship(dock, 10, "Black Jack");
		Port port = new Port(dock);

		Thread tharedShipOne = new Thread(shipOne);
		Thread tharedShipTwo = new Thread(shipTwo);
		Thread tharedShipThree = new Thread(shipThree);
		Thread tharedPort = new Thread(port);

		
		ExecutorService exSer = Executors.newFixedThreadPool(2);
		exSer.submit(tharedShipOne);
		exSer.submit(tharedShipTwo);
		exSer.submit(tharedShipThree);
		tharedPort.start();
		exSer.shutdown();

	}

}
