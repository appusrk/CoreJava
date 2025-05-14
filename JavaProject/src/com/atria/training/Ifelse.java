package com.atria.training;

public class Ifelse {

	public static void main(String[] args) {
		int a=10, b=20, c=5;
		
		if(b>a)
		{
			if(b>c)
				System.out.println("Largest number is b: "+b);
		}
		else if(a>b){
			if(a>c)
			System.out.println("Largest number is: "+a);
		}
		else if(c>b){
			if(c>b)
			System.out.println("Largest number is: "+c);
	}

}}
