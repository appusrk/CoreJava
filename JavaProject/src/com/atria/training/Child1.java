package com.atria.training;

public class Child1 extends Parent {
	private int empID;
	private float salary;
	private String dept;

	public Child1(String name, String city, int empID, float salary, String dept) {
		super(name, city);
		this.dept=dept;
		this.empID=empID;
		this.salary=salary;
		
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Child1 [empID=" + empID + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	

}
