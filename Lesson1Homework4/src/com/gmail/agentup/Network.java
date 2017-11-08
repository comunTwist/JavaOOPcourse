package com.gmail.agentup;

public class Network {
	private int[] phoneNumbers;

	public Network(int[] phoneNumbers) {
		super();
		this.phoneNumbers = phoneNumbers;
	}

	public Network() {
		super();
	}

	public int[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(int[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
