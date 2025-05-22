package com.atria.static_final;

public class Emploice {
	private String name;
	private int Slno;
	static String clg="Atria";
	Emploice(String name, int Slno){
		this.name=name;
		this.Slno=Slno;
		}
	@Override
	public String toString() {
		return "Emploice [name=" + name + ", Slno=" + Slno +" Company :" +clg+"]";
	}
	

}
