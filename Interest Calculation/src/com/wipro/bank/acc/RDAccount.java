package com.wipro.bank.acc;

public class RDAccount extends Account{
	public RDAccount(int tenure, float principal)
	
	{
		this.tenure=tenure;
		this.principal=principal;
	}

	
	@Override
	public float calculateInterest() {
		return principal*tenure*12;
	}

	@Override
	public float calculateAmountDeposited() {
		float r=rateOfInterest/100;
		float sum=0;
		float t=tenure*12;
		for(float i=t;i>0;i--)
		{
			sum=(float) (sum+principal*((Math.pow(1+r/4,4*(i)/12))-1));
		}
		return sum;
	}
	
	

}
