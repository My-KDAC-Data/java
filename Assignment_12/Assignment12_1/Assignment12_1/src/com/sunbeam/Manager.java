package com.sunbeam;

public class Manager implements Emp{
	private double bs  ;
	private double da ;
	
	
	
	
	public Manager(double bs, double da) {
		super();
		this.bs = bs;
		this.da = da;
	}




	@Override
	public double getSal() {
		
		return bs + da;
	}




	@Override
	public double calcIncentive() {
		
		return 0.2*bs;
	}
	
	
	

}
