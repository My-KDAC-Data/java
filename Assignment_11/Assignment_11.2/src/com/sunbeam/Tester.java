/*
 2. In above assignment use LinkedHashSet instead of HashSet.
  If any book with duplicate isbn is added, what will happen? Books are stored in which order?
 */


package com.sunbeam;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		
		
		Set<Book>set=new LinkedHashSet<>();
		
 
        set.add(new Book("a1","HP" ,"JKR", 20, 250));
		set.add(new Book("a3", "DS", "ZXC", 30,305));		
		set.add(new Book("a4", "CPP", "RPS", 65,345));
		set.add(new Book("a2", "LOR", "ASD", 25,300));
		
		set.add(new Book("a5", "C", "ME", 26,601));
		set.add(new Book("a5", "C", "DNR", 89,400));
		
		set.add(new Book("a6", "C", "ME", 26,601));
		set.add(new Book("a6", "DM", "ME", 26,601));
		
		
//		for (Book ele : set) {
//			System.out.println(ele);
//		}
    
		   
		System.out.println("Iterate in forward order");
		
		Iterator <Book>itr=set.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b);
		}
		
		//Output shows as order of insertion in linkedHashSet.
		//Duplicate are not allowed .
		//must implements equals() and hashcode() method...
}
}

