//Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
//class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.


package com.sunbeam;

import java.util.Scanner;

interface Arithmetic {
	  double calc(double x , double y ) ;
		
}	


  
public class Functiona_Interface_Arithmetic {
	
	
	static void calculate(double num1, double num2, Arithmetic op) {
		 double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
		public static void main(String[] args) {
			
				
			
			
			
			do {
				System.out.println("enter choice of operation");
				System.out.println("enter 0 . EXIT");
				System.out.println("enter 0 . ADDITION");
				System.out.println("enter 0 . SUBTRACT");
				System.out.println("enter 0 . MULTIPLY");
				System.out.println("enter 0 . DIVISION");
				
				int choice ;
				Scanner obj = new Scanner(System.in);
				choice = obj.nextInt();
				
				System.out.println("enter two double numbers ");
				double num1 = obj.nextDouble();
				double num2 = obj.nextDouble();
			
				
			  
				switch(choice) {
				
				
				case 1 : // add 
					
					
					 calculate(num1, num2, (x,y)->x+y);
					break ;
				
                   
				 case 2 : // subtract
					
					System.out.println("enter two double numbers ");
					
					 calculate(num1, num2, (x,y)->x-y);
					break ;
					
					
				 case 3 : // multiply
						
						System.out.println("enter two double numbers ");
						
						 calculate(num1, num2, (x,y)->x*y);
						break ;
						
						
				 case 4 : // division
						
						System.out.println("enter two double numbers ");
						
						 calculate(num1, num2, (x,y)->x/y);
						break ;		
			   		
					
					
			}
		
		

	

	}while(true);

}

		
}

