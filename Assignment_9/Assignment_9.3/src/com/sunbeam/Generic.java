/*
 *. Use Arrays.sort() to sort array of Students using Comparator.
 * The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
3rd level sorting should be on name (asc). 
 */


package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Generic {

	public static void main(String[] args) {
		
		Student[] arr=new Student[6];
		
		 arr[0]=new Student(101, "Shubham", "Pune", 80);
	     arr[1]=new Student(103, "Shubham", "Pune", 90);
		 arr[2]=new Student(104, "Raj", "Pune", 80);
		 arr[3]=new Student(107, "Shubham", "Mumbai", 87);
		 arr[4]=new Student(108, "Shubham", "Solapur", 90);
		 arr[5]=new Student(109, "Shubham", "Pune", 99);
		 
		 
		 System.out.println("Before Sort:");
		 for (Student ele : arr) {
			System.out.println(ele);
		}
		 
		 Arrays.sort(arr);
		 
		 System.out.println("After Sort:");
		 for (Student ele : arr) {
			System.out.println(ele);
		}
		 
		class StuNameComparator implements Comparator<Student>
		{

			@Override
			public int compare(Student s1, Student s2) {
				int diff=s2.getCity().compareTo(s1.getCity());
				if(diff==0);
				  diff=-(Double.compare(s1.getMarks(),s2.getMarks()));
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		
		StuNameComparator nameComparator=new StuNameComparator();
		
		Arrays.sort(arr,nameComparator);
		
		System.out.println("After all Sorting:");
		for (Student ele : arr) {
			System.out.println(ele);
		}
		 
		 
		
		 
		
		

	}
	
	
	

}
