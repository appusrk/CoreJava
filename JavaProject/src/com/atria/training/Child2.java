package com.atria.training;

public class Child2 extends Parent{

	private String usn;
	private float percent;
	
	public Child2(String name, String city, String usn, float percent) {
		super(name, city);
		this.usn=usn;
		this.percent=percent;
		
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Child2 [usn=" + usn + ", percent=" + percent + ", Name=" + getName() + ", City=" + getCity()
				+ "]";
	}
	
	

}
