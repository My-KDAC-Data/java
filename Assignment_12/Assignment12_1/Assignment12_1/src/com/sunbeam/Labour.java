package com.sunbeam;

public class Labour implements Emp {
	
	private double hrs ;
	private double rate ;
	
	
	
	public Labour(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}



	@Override
	public double getSal() {
		
		return hrs * rate;
	}



	@Override
	public double calcIncentive() {
		// TODO Auto-generated method stub
		if(hrs > 300) {
			return 0.05 * hrs * rate ;
		}
		return 0 ;
	}
    	
    	

}
