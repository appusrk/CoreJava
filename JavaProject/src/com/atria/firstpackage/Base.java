package com.atria.firstpackage;

public class Base {
	int def;
	public int pub;
	protected int prot;
	private float pri;
	
	public float getPri() {
		return pri;
	}
	public void setPri(float pri) {
		this.pri = pri;
	}
	void MethodDef()
	{
		System.out.println("This is a default method");
		System.out.println("Default variable : "+def);
		
	}
	public void MethodPub()
	{
		System.out.println("This is a public method");
		System.out.println("Public variable : "+pub);
		
	}
	protected void MethodPro()
	{
		System.out.println("This is a protected method");
		System.out.println("Protected variable : "+prot);
		
	}
	private void MethodPri()
	{
		System.out.println("This is a private method");
		System.out.println("Private variable : "+pri);
		
	}
	@Override
	public String toString() {
		return "Base [pri=" + pri + "]";
	}
	

}
