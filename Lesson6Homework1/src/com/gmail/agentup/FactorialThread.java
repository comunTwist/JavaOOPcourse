package com.gmail.agentup;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private BigInteger calculate(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i > 0; i -= 1) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " -> " + this.number + " != " + calculate(this.number));
		if (th.isInterrupted()) {
			System.out.println(th.getName() + "is interruped");
			return;
		}

	}
}
