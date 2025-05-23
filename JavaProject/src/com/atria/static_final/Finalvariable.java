package com.atria.static_final;

public class Finalvariable {
	final int x=100;
	final static int y;
	final static int z=80;
	void change()
	{
		x=30;
		y=100;
	}
	@Override
	public String toString() {
		return "Finalvariable [x=" + x + "]";
	}
	static {
		y=20;
		z=100;
		System.out.println("Value of y is "+y);
	}
}
