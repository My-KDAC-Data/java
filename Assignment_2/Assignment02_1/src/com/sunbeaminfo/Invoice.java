package com.sunbeaminfo;

import java.util.Scanner;

public class Invoice {
	
	private String partname;
	private String partdesc;
	private int qty;
	private double price;
	
	Scanner sc=new Scanner(System.in);
	
	public Invoice()
	{
		
	}
	
	public Invoice(String partname, String partdesc, int qty, double price)
	{
		
		this.partname = partname;
		this.partdesc = partdesc;
		this.qty = qty;
		this.price = price;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public String getPartdesc() {
		return partdesc;
	}

	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double Amount() {
		return getPrice()*getQty();
	}

	public void accept()
	{
		System.out.println("***Enter the Product Details***");
		System.out.println("Enter the Name of Product:");
		partname=sc.next();
		System.out.println("Enter the Product Description:");
		partdesc=sc.next();
		System.out.println("Enter the Quantity of product:");
		qty=sc.nextInt();
		if(qty < 0)
		{
			qty=0;
		}
		System.out.println("Enter the Name of Product:");
		price=sc.nextDouble();
		if(price < 0)
		{
			price=0;
		}
	}
	
	public void Calculate()
	{
		System.out.println("**********Product Details*******");
		System.out.println("Name of product="+partname);
		System.out.println("Description of product="+partdesc);
		System.out.println("Quantity of product="+qty);
		System.out.println("Cost of product="+price);
		System.out.println("Total Amount="+Amount());
	}

	
		

	

}
