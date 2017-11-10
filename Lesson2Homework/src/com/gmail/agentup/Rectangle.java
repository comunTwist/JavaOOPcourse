package com.gmail.agentup;

public class Rectangle extends Shape{
	private Point a;
	private Point c;

	public Rectangle(Point a, Point c) {
		super();
		this.a = a;
		this.c = c;
	}

	public Rectangle() {
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
		return getLine(a.getX(), a.getY(), c.getX(), a.getY()) + getLine(c.getX(), a.getY(), c.getX(), c.getY())
				+ getLine(c.getX(), c.getY(), a.getX(), c.getY())+ getLine(a.getX(), a.getY(), a.getX(), c.getY());
	}

	@Override
	public double getArea() {
		return getLine(a.getX(), a.getY(), c.getX(), a.getY()) * getLine(c.getX(), a.getY(), c.getX(), c.getY());

	}
}
