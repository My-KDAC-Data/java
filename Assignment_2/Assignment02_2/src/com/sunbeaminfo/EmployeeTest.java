/*
 * Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/



package com.sunbeaminfo;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println("Employee 1");
		Employee emp1=new Employee("Shubham","Walke",10000);
		System.out.println("Before Increment");
		emp1.yearsal();
		emp1.incrpermonth();
		System.out.println("After Increment");
		emp1.yearsal();
		
		System.out.println("Employee 2");
		Employee emp2=new Employee("Harshad","Mehta",20000);
		System.out.println("Before Increment");
		emp2.yearsal();
		emp2.incrpermonth();
		System.out.println("After Increment");
		emp2.yearsal();

	}

}
