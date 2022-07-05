package com.tnsif.FrameWork;

public interface BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalary);
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit);

}
