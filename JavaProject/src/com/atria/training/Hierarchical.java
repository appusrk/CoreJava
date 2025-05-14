package com.atria.training;

public class Hierarchical {

	public static void main(String[] args) {
		Parent p;
		p=new Child1("Appu","Karnataka",123,54000.36f,"Full stack");
		System.out.println(p);
		p=new Child2("Kavi","Karnataka","1AT22IS013",85);
		System.out.println(p);

	}

}
