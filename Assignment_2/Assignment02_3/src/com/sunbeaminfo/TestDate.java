/*
 * Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.
 */


package com.sunbeaminfo;

public class TestDate {

	public static void main(String[] args) {
		
		Date d1=new Date(02,12,2023);
		d1.displaydate();
		
		System.out.println("Month="+d1.getMonth());
		
		Date d2=new Date(8,28,1999);
		d2.displaydate();
		d2.setYear(2000);
		d2.displaydate();
		
		System.out.println("Month="+d2.getMonth());

	}

}
