/*
  Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */



package com.sunbeaminfo;

public class Test {

	public static void main(String[] args) {
	
		Car c1=new Car();
		c1.accept();
		c1.calculateCost();
		c1.display();

	}

}
