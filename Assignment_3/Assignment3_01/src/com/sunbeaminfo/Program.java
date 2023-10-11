package com.sunbeaminfo;

import java.util.Scanner;

public class Program {
	
	private int accno;
	private int bal;
	private int totalItemCharge;
	private int totalCredit;
	private int allowedLimit;
	
	
	public Program()
	{
		
	}
	
	public Program(int accno, int bal, int totalItemCharge, int totalCredit, int allowedLimit)
	{
		this.accno = accno;
		this.bal = bal;
		this.totalItemCharge = totalItemCharge;
		this.totalCredit = totalCredit;
		this.allowedLimit = allowedLimit;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Details:");
		
		System.out.print("Account No=");
		accno=sc.nextInt();
		
		System.out.print("bal=");
		bal=sc.nextInt();
		
		System.out.print("Total Item Charge =");
		totalItemCharge=sc.nextInt();
		
		System.out.print("Total Credit=");
		totalCredit=sc.nextInt();
		
		System.out.print("Allowed Limit No=");
		allowedLimit=sc.nextInt();

	}
	
	public int calculateNewBalance()
	{
		int newBalance=(this.bal+this.totalItemCharge-this.totalCredit);
		return newBalance;
		
	}
	
	public void display()
	{
		
		System.out.println("New Balance="+calculateNewBalance());
		
		if(calculateNewBalance() > this.allowedLimit)
		{
			System.out.println("Credit limit exceeded");
		}
		else
		{
			//System.out.println("New Balance="+calculateNewBalance());
		}
	}
	
	
	

	

}
