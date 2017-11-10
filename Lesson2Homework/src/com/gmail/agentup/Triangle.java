package com.gmail.agentup;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	public double getLine(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	@Override
	public double getPerimetr() {
		return getLine(a.getX(), a.getY(), b.getX(), b.getY()) + getLine(b.getX(), b.getY(), c.getX(), c.getY())
				+ getLine(c.getX(), c.getY(), a.getX(), a.getY());
	}

	@Override
	public double getArea() {
		double p = (getLine(a.getX(), a.getY(), b.getX(), b.getY()) + getLine(b.getX(), b.getY(), c.getX(), c.getY())
				+ getLine(c.getX(), c.getY(), a.getX(), a.getY())) / 2;
		return Math.sqrt(p * (p - getLine(a.getX(), a.getY(), b.getX(), b.getY()))
				* (p - getLine(b.getX(), b.getY(), c.getX(), c.getY()))
				* (p - getLine(c.getX(), c.getY(), a.getX(), a.getY())));

	}
}
