package com.gmail.agentup;

public class Triangle {
	private double a;
	private double b;
	private double c;
	private double p;
	private double s;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double triangleArea(double a, double b, double c) {
		p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

}
