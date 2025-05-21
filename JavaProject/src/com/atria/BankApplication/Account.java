package com.atria.BankApplication;

public class Account {
	private int Acc_no;
	private String name;
	private String bank;
	private double bal;
	public Account(int Acc_no, String name, String bank, double bal)
	{
		this.Acc_no=Acc_no;
		this.bal=bal;
		this.name=name;
		this.bank=bank;
	}
	public int getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [Acc_no=" + Acc_no + ", name=" + name + ", bank=" + bank + ", bal=" + bal + "]";
	}
	

}
