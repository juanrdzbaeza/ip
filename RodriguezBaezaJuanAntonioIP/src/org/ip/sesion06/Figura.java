package org.ip.sesion06;

public abstract class Figura {

	protected double x;
	protected double y;
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public abstract double area();
	
	
}
