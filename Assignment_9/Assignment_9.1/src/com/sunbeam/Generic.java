/*
 * . Write a generic static method to ﬁnd minimum from an array of "Number".
 */


package com.sunbeam;

 class Generic<T> {
	
	public static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i].doubleValue()<min.doubleValue())
			min = arr[i];
			
		}
		
		return min;
	}	
		
	

	public static void main(String[] args) {
		
		Integer[] arr1 = { 22, 55, 77, 11, 33,45 };
		//Integer min1 = findMin(arr1);
		System.out.println("Min Number:"+Generic.findMin(arr1));
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		//Double min2 = findMin(arr2);
		System.out.println("Min Number:"+Generic.findMin(arr2));
		

	}

}
