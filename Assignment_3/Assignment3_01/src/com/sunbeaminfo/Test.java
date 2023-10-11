/*
  Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".
 */



package com.sunbeaminfo;

public class Test {

	public static void main(String[] args) {
	
    	Program program1=new Program(1001,5000,2000,500,200);
    	program1.calculateNewBalance();
		program1.display();
		
		Program program=new Program (1001,10000,7000,3000,15000);
		program.calculateNewBalance();
		program.display();
		
		Program program2=new Program();
		program2.accept();
		program2.calculateNewBalance();
		program2.display();	
		
		
	}

}
