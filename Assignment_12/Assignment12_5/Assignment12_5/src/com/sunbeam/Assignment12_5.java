package com.sunbeam;



interface Check<T>{
	  boolean Compare (T x , T y);
		  
}	  
public class Assignment12_5 {
	
	
	 static <T> int countIf(T[] arr , T key ,Check <T> c)
	{
		int count= 0 ;
		for( T ele : arr) {
			if(c.Compare(ele, key))
				count++ ;		
		}
			return count ;
	}
		

	  
  
	
	public static void main(String[] args) {
		Double key = 1.2 ;
		Double[] arr = {1.1 , 1.2 ,1.3 ,1.4 ,1.5 ,1.2 ,1.4};
		int count = countIf(arr, key, (e,k)->e.equals(k)) ;
		System.out.println("result = " + count);
		

		
	}

 }
  
  