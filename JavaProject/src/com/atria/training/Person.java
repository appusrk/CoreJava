package com.atria.training;
import java.util.*;
public class Person {
	public static void main(String args[]) {
	 int income;
	 String name;
	 int age;
	 double tax;
	String gender;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name, age, income,gender and tax");
	name=sc.next();
	age=sc.nextInt();
	income=sc.nextInt();
	gender=sc.next();
	tax=sc.nextDouble();
	System.out.println("Name : "+name+"\nAge: "+age+"\nIncome: "+income+"\nGender: "+gender+"\nTax: "+tax);
	sc.close();;
}
}
