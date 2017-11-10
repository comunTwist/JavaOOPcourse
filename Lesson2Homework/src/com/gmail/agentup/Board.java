package com.gmail.agentup;

public class Board {
	private double width;
	private double height;

	public Board(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Board() {
		super();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean setFigure(Triangle triangle, Point a,Point b,Point c) {
		double minX = triangle.getA().getX();
		double minY = triangle.getA().getY();
		if (triangle.getB().getX() < minX) {
			minX = triangle.getB().getX();
		}
		if (triangle.getB().getY() < minY) {
			minY = triangle.getB().getY();
		}
		if (triangle.getC().getX() < minX) {
			minX = triangle.getC().getX();
		}
		if (triangle.getC().getY() < minY) {
			minY = triangle.getC().getY();
		}
		
		if (triangle.getA().getX()==minX) {
			a.setX(minX);
			
		}
		// и так, пока не надоест
		return true;
	}

}
