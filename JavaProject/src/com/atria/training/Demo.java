package com.atria.training;

public class Demo {
	int sno, age;
	String name;
	public void show() {
		System.out.println("Serial number: "+sno+"\nName: "+name+"\nAge: "+age);
	}
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.sno=1;
		d.name="Appu";
		d.age=20;
		d.show();
	}


}
