package com.sunbeaminfo;

import java.util.Scanner;

public class Car {
	
	private int totalMiles;
	private int costGas;
	private int avgMiles;
	private int parkFees;
	private int tollPerDay;
	
	Scanner sc=new Scanner(System.in);
	
	public Car()
	{
		
	}

	public Car(int totalMiles, int costGas, int avgMiles, int parkFees, int tollPerDay)
	{
		this.totalMiles = totalMiles;
		this.costGas = costGas;
		this.avgMiles = avgMiles;
		this.parkFees = parkFees;
		this.tollPerDay = tollPerDay;
		
	}
	
	public void accept()
	{
		System.out.println("Enter the Details:");
		
		System.out.print("Enter Total Miles per Day=");
		totalMiles=sc.nextInt();
		
		System.out.print("Enter Cost Of Gas per Kg=");
		costGas=sc.nextInt();
		
		System.out.print("Enter Average Miles per Day=");
		avgMiles=sc.nextInt();
		
		System.out.print("Enter Parking Fees per Day=");
		parkFees=sc.nextInt();
		
		System.out.print("Enter Toll Amount per Day=");
		tollPerDay=sc.nextInt();
		
	}
	
	public int calculateCost()
	{
		int totalCost;
		
		totalCost=((totalMiles/avgMiles)*costGas+parkFees+tollPerDay);
		
		return totalCost;			
		
	}
	
	public void display()
	{
		System.out.println("Daily Driving Cost=Rs "+calculateCost());
		
		if(calculateCost() > 500 )
		{
			System.out.println("Please use Car Pooling....");
		}
	}
	
	
	

}
