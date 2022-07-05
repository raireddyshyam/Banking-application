package com.tnsif.ApplicationPart;

import com.tnsif.FrameWork.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	public final float minBalance=1000;
	
	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal, isSalary);
	}
	
	public void withdraw(float balance) {
		
		System.out.println("saving account balance is "+balance);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [minBalance=" + minBalance + ", isSalary=" + isSalary + ", accNo=" + accNo + ", accName="
				+ accName + ", accBal=" + accBal + "]";
	}
	
	

	

	

}
