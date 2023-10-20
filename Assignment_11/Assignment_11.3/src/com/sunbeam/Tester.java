package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		Set<Book>set=new TreeSet<>();
		

        set.add(new Book("a1","HP" ,"JKR", 20, 250));
        set.add(new Book("a3", "DS", "ZXC", 30,305));		
        set.add(new Book("a4", "CPP", "RPS", 65,345));
        set.add(new Book("a2", "LOR", "ASD", 25,300));

        set.add(new Book("a5", "C", "ME", 26,601));
        set.add(new Book("a5", "C", "DNR", 89,400));

        set.add(new Book("a6", "C", "ME", 26,601));
        set.add(new Book("a6", "DM", "ME", 26,601));

        
        
        Iterator<Book>itr=set.iterator();
        while(itr.hasNext())
        {
        	Book b=itr.next();
        	System.out.println(b);
        }
	}
	//Duplicates are not allowed in TreeSet...
	//Output are shown in sorted order.
	//comparable must be implement to avoid duplicates...
	

}
