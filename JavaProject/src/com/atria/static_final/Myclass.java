package com.atria.static_final;

public class Myclass {
	private int section;
	private static int srNo;
	static {
		System.out.println("Within the static block");
		srNo=1000;
	}
	Myclass(){
		System.out.println( "Within Constructor" );
		srNo++;
		
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + " serial no= "+srNo+"]";
	}
	static void display() {
		//System.out.println("Section: "+section);not possible
		System.out.println("Serial no: "+srNo);
		
	}
	

}
