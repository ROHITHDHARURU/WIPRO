package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService{
	public boolean validateData(float principal, int tenure, int age, String gender)
	{
		try
		{
		if(principal>=500 && (tenure==5 ||tenure==10) && (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")) && (age>=1 && age<=100))
			return true;	
		else
			throw new BankValidationException();
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;	
		}
		
	}
	public void calculate(float principal,int tenure, int age, String gender)
	{
		if(validateData(principal, tenure, age, gender))
				{
			        RDAccount r=new RDAccount(tenure,principal);
			        r.setInterest(age, gender);
			        float a=r.calculateInterest();
			        System.out.println(""+r.calculateInterest());
			        System.out.println(""+r.calculateAmountDeposited());
			        System.out.println(""+r.calculateMaturityAmount(principal,a));
				}
		
	}

}
