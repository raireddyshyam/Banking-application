package com.tnsif.ApplicationPart;

import com.tnsif.FrameWork.BankFactory;
import com.tnsif.FrameWork.CurrentAcc;
import com.tnsif.FrameWork.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalary) {
		SavingAcc mmsaccount=new SavingAcc(accNo,accName,accBal,isSalary);
		return mmsaccount;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {
		CurrentAcc mmcaccount=new CurrentAcc(accNo,accName,accBal,creditLimit);
		return mmcaccount;
	}

	
	}
