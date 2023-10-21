package com.sunbeam;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Random_numbers {

	public static void main(String[] args) {
		
//		IntStream strm1 = IntStream.range(1, 10);
//		int res = strm1.sum() ;
//		System.out.println(res);
//		
		Random r = new Random() ;
		Stream<Integer> strm = Stream.generate(()->r.nextInt(10)).limit(10) ;
		int res = strm.reduce(0, (a,e)-> a + e  );
		System.out.println(res);
	}

}
