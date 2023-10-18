package question2;

import java.util.*;

public class ques2 {

	public static void main(String[] args) {
		double num1 ,num2 ;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter two numbers");
	
		
		if(obj.hasNextDouble() && !obj.hasNextInt())
		{
		  num1 = obj.nextDouble();
		   
		  if(obj.hasNextDouble() && !obj.hasNextInt())
		  {
			  num2 = obj.nextDouble();
			  double 
			  	average ;
			  average = (num1 + num2) /2 ;
			
			  System.out.println(" Average of two numbers = " + average ) ;
		  }	 
		  } else {
			   System.out.println("Wrong choice...");
			
		}
		

	}

}
