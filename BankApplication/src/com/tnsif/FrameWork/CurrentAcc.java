package com.tnsif.FrameWork;

public class CurrentAcc extends BankAcc{
	
	public float creditLimit;

	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float charges) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}
	

}
