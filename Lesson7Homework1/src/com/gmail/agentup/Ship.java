package com.gmail.agentup;

public class Ship implements Runnable {
	private Dock dock;
	private int cargoCount;
	private String cargoTitle;

	public Ship(Dock dock, int cargoCount, String cargoTitle) {
		super();
		this.dock = dock;
		this.cargoCount = cargoCount;
		this.cargoTitle = cargoTitle;
	}

	public Ship() {
		super();
	}

	public Dock getDock() {
		return dock;
	}

	public void setDock(Dock dock) {
		this.dock = dock;
	}

	public int getCargoCount() {
		return cargoCount;
	}

	public void setCargoCount(int cargoCount) {
		this.cargoCount = cargoCount;
	}

	public String getCargoTitle() {
		return cargoTitle;
	}

	public void setCargoTitle(String cargoTitle) {
		this.cargoTitle = cargoTitle;
	}

	@Override
	public void run() {
		int place = dock.craneReserve(true);
		for (int i = 1; i <= cargoCount; i++) {
			dock.setValue("box " + i + ": " + cargoTitle);
		}
		boolean tmp[] = dock.getReserve();
		tmp[place] = false;
		dock.setReserve(tmp);
		 //dock.setStop(true);

	}
}
