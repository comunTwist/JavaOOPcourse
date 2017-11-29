package com.gmail.agentup;

public class Dock {
	private int craneCount;
	private boolean[] reserve = new boolean[craneCount];
	private int speed;
	private String value;
	private boolean turn = false;
	private boolean stop = false;

	public Dock(int craneCount, int speed) {
		super();
		this.craneCount = craneCount;
		this.speed = speed;
	}

	public Dock() {
		super();
	}

	public boolean[] getReserve() {
		return reserve;
	}

	public void setReserve(boolean[] reserve) {
		this.reserve = reserve;
	}

	public int getCraneCount() {
		return craneCount;
	}

	public void setCraneCount(int craneCount) {
		this.craneCount = craneCount;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public synchronized int craneReserve(boolean reserve) {
		int id = -1;
		while (id < 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
			for (int i = 0; i < this.reserve.length; i++) {
				if (this.reserve[i] == false) {
					this.reserve[i] = true;
					id = i;
					break;
				}
			}
		}
		notifyAll();
		return id;
	}

	public synchronized String getValue() {
		for (; turn == false;) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String tmp = this.value;
		turn = false;
		notifyAll();
		System.out.println("Accepted " + this.value);
		return tmp;
	}

	public synchronized void setValue(String value) {
		for (; turn == true;) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.value = value;
		turn = true;
		//System.out.println("Send " + this.value);
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
