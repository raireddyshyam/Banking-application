package com.tnsif.main;

import com.tnsif.ApplicationPart.MMBankFactory;
import com.tnsif.ApplicationPart.MMCurrentAcc;
import com.tnsif.ApplicationPart.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		
		//step A 
		
		MMBankFactory mmbfactory=new MMBankFactory();
		mmbfactory.getNewSavingAccount(101, "shyam", 4000, true);
		mmbfactory.getNewCurrentAccount(102, "manu", 5000, 40000);
		
		//step B
		MMSavingAcc mmsaccount=new MMSavingAcc(101, "shyam", 4000, true);
		
		//step C 
		MMCurrentAcc mmcaccount=new MMCurrentAcc(102, "manu", 5000, 40000);
		
		//step D 
		mmsaccount.withdraw(3000);
	    mmcaccount.withdraw(2000);
	    
	    //step E
	    mmsaccount.toString();
	    mmcaccount.toString();

	}

}
