package com.tnsif.ApplicationPart;

import com.tnsif.FrameWork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public float creditLimit=40000;

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
	}
	
	public void withdraw(float balance) {
		
		System.out.println("current account balance is" +balance +"creditLimit"+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}

}
