package com.tnsif.FrameWork;

public class SavingAcc extends BankAcc{
	
	public boolean isSalary;

	public SavingAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float balance) {
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal
				+ "]";
	}
	
	
}
