package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Generic implements Comparator<Double>{

	
	@Override
	public int compare(Double d1, Double d2) {
		int diff=Double.compare(d1, d2);
		return diff;
	}


	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
}
}

	
 public static void main(String[] args) {
	 
	 Double[] arr=new Double[5];
	 
	 arr[0]=28.36;
	 arr[1]=26.25;
	 arr[2]=40.25;
	 arr[3]=98.28;
	 arr[4]=41.25;
	 
	 System.out.println("Before Sorting:");
	 for (Double ele : arr) {
		System.out.println(ele);
	}
	 Generic gen = new Generic();
	 Generic.selectionSort(arr,gen);
	 
	 System.out.println("After Sorting:");
	 for (Double ele : arr) {
		System.out.println(ele);
	}

 }

}