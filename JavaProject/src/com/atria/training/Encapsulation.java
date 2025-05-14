package com.atria.training;

public class Encapsulation {
	private int sno;
	private String name;
	private int age;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "sno=" + sno + ", name=" + name + ", age=" + age ;
	}
	

}
