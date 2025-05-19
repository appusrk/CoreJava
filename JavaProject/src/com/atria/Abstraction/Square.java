package com.atria.Abstraction;

public class Square extends Shape {
	private float side;
	public Square() {
		this.side=8.0f;
	}
	void calArea() {
		area=side*side;
	}

}
