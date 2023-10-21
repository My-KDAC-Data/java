package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		
		int num ;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter num");
		num = obj.nextInt();
		Stream<Integer> strm = Stream.iterate(1 , x->x+1).limit(num) ;
		
		int fact_res = strm.reduce(1, (a,e)-> a*e) ;
		System.out.println(fact_res);
		 
		 
		 
	}

}
