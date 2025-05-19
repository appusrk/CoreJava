package com.atria.Abstraction;

public abstract class Shape {
	protected float area;
	abstract void calArea();
	public void show() {
		System.out.println("The area is "+area);
	}

}
