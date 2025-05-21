package com.atria.BankApplication;

public class BankApp {

	public static void main(String[] args) {
		BankImp b=new BankImp();
		Account a=new Account(5001,"Appu","Xyz",65478);
		b.deposit(a, 5342);
		b.withdraw(a, 1000);

	}

}
