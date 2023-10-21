package com.sunbeam;

public interface Emp {
	public double getSal();

	default double calcIncentive() {
		return 0;
	}
	
	static double calcTotalIncome(Emp arr[])
	{
		double total = 0.0;
		for( Emp ele : arr) 
			 total += ele.getSal() + ele.calcIncentive() ;
			return total ;
		
	}

}
