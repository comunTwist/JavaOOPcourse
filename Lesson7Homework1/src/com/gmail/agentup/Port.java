package com.gmail.agentup;

public class Port implements Runnable {
	private Dock dock;

	public Port(Dock dock) {
		super();
		this.dock = dock;
	}

	public Port() {
		super();
	}

	@Override
	public void run() {
		for (; !dock.isStop();) {
			System.out.println("Accepted: <- " + dock.getValue());
			//dock.getValue();
		}
	}
}
