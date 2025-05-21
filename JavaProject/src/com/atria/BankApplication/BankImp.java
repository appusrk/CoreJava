package com.atria.BankApplication;

public class BankImp implements Bank {
	public void deposit(Account acc, double amt)
	{
		if(amt>deposit_limit)
			System.out.println("Amount exceed deposit limit");
		else {
			acc.setBal(acc.getBal()+amt);
			System.out.println(amt+" added to Account"+ acc.getAcc_no()+"\n Current Balance "+acc.getBal());
		}
	}
	public void withdraw(Account acc, double amt)
	{
		if(acc.getBal()-amt<=min_bal)
			System.out.println("Insufficent balance");
		else {
			acc.setBal(acc.getBal()-amt);
			System.out.println(amt+" withdrawn from Account "+acc.getAcc_no()+"\n Current Balance "+acc.getBal());
		
	}
	

}}
