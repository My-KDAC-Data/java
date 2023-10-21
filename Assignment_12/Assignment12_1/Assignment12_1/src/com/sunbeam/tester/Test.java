package com.sunbeam.tester;

import com.sunbeam.*;

public class Test {

	public static void main(String[] args) {
		
		Emp[] arr = new Emp[3];
		arr[0] = new Manager(20000.0, 4000);
		arr[1] = new Labour(9, 100.0);
		arr[2] = new Clerk(30000);
		
		
		double totalIncome =  Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);
		
		
		

	}

}
