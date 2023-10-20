/*
 Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and 
 display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem
 */


package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		Set<Book>set=new HashSet<>();
		
	//	Set<Book>set=new LinkedHashSet<>();
		
	//	Set<Book>set=new TreeSet<Book>();
		
		set.add(new Book("a1","HP" ,"JKR", 20, 250));
		set.add(new Book("a3", "DS", "ZXC", 30,305));
				
		set.add(new Book("a4", "CPP", "RPS", 65,345));
		set.add(new Book("a2", "LOR", "ASD", 25,300));
		
		set.add(new Book("a5", "C", "ME", 26,601));
		set.add(new Book("a5", "C", "DNR", 89,400));
		
		set.add(new Book("a6", "C", "ME", 26,601));
		set.add(new Book("a6", "DM", "ME", 26,601));
		
		
		System.out.println("Iterarte in forward Order");
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b);
		}
		
		
 		//For Hashset duplicate are not allowed and order is random in output...
		//  and must implements equals() and hashcode() compulsory...
		
		
		
		

		
	}

}
