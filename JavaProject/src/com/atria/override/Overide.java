package com.atria.override;

public class Overide {

	public static void main(String[] args) {
		RBI rbi;
		rbi =new SBI();
		System.out.println("SBI: "+rbi.getRate());
		
		rbi=new HDFC();
		System.out.println("HDFC: "+rbi.getRate());

	}

}
