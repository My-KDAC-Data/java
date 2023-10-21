package com.sunbeam;

import java.util.stream.IntStream;

public class CheckIntStream {

	public static void main(String[] args) {
		IntStream strm1 = IntStream.range(1, 10);
		int res = strm1.sum() ;
		System.out.println(res);

	}

	

}
