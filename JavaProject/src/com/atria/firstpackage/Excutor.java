package com.atria.firstpackage;

public class Excutor {

	public static void main(String[] args) {
		Base b=new Base();
		b.prot=456;
		b.pub=123;
		b.def=789;
		b.setPri(18.08f);
		b.MethodDef();
		b.MethodPro();
		b.MethodPub();
		System.out.println(b);
		

	}

}
