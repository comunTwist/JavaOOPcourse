package com.gmail.agentup;

public class Circle extends Shape {
	private Point a;
	private Point c;

	public Circle(Point a, Point c) {
		super();
		this.a = a;
		this.c = c;
	}

	public Circle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public Point getC() {
		return c;
	}

	public double getLine(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	@Override
	public double getPerimetr() {
		return 2 * Math.PI * getLine(c.getX(), c.getY(), a.getX(), a.getY());
	}

	@Override
	public double getArea() {
		return Math.pow(Math.PI * getLine(c.getX(), c.getY(), a.getX(), a.getY()), 2);

	}
}
