package com.atria.BankApplication;

public interface Bank {
	double min_bal=1000.0;
	double deposit_limit=25000.0;
	public void deposit(Account acc, double amt);
	public void withdraw(Account acc, double amt);
	

}
