/*
 Use TreeSet to store all books in descending order of price.
  Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().
 */



package com.sunbeam;

import java.util.Comparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		
		 class pricecomparator implements Comparator<Book>
	        {

				@Override
				public int compare(Book b1, Book b2) {
					int diff=Double.compare(b1.getPrice(), b2.getPrice());
			
					return diff;
				}
	        	
	        }
	        
	        pricecomparator pricecomp=new pricecomparator();
		
		Set<Book>set=new TreeSet<>(pricecomp);
		

        set.add(new Book("a1","HP" ,"JKR", 20, 650));
        set.add(new Book("a3", "DS", "ZXC", 30,305));		
        set.add(new Book("a4", "CPP", "RPS", 65,120));
        set.add(new Book("a2", "LOR", "ASD", 25,405));

        set.add(new Book("a5", "C", "ME", 26,601));
        set.add(new Book("a5", "C", "DNR", 89,809));

        set.add(new Book("a6", "C", "ME", 26,625));
        set.add(new Book("a6", "DM", "ME", 26,625));

        
         System.out.println("Ascending Iterator:");   
        Iterator<Book>itr=set.iterator();
        while(itr.hasNext())
        {
        	Book b=itr.next();
        	System.out.println(b);
        }
        
     
         System.out.println("Descending Iterator:");
        Iterator<Book>itr2=((TreeSet<Book>) set).descendingIterator();
        while(itr2.hasNext())
        {
        	Book b=itr2.next();
        	System.out.println(b);
        }
        
       
        
        
        
        
        
	}
	
	
	

}

