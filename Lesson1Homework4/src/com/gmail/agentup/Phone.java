package com.gmail.agentup;

public class Phone {
	private int phoneNumber;
	private int callNumber;
	private int[] network;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}

	public int[] getNetwork() {
		return network;
	}

	public void setNetwork(int[] network) {
		this.network = network;
	}

	public int[] regInNetwork(int[] network, int phoneNumber) {
		int[] tmp = new int[network.length + 1];
		System.arraycopy(network, 0, tmp, 0, network.length);
		network = tmp;
		network[network.length - 1] = phoneNumber;
		return network;
	}
}
