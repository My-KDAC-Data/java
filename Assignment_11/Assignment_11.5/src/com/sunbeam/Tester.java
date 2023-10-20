package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		
		Map<Integer,Book>map= new HashMap<>();
		
	    map.put(101,new Book("a1","HP" ,"JKR", 20, 650));
	    map.put(101,new Book("a3", "DS", "ZXC", 30,305));
	    map.put(101,new Book("a4", "CPP", "RPS", 65,120));
	    map.put(101,new Book("a2", "LOR", "ASD", 25,405));
	    map.put(101,new Book("a5", "C", "ME", 26,601));
	    
	    map.put(101,new Book("a6", "C", "ME", 26,625));
	    map.put(101,new Book("a5", "C", "DNR", 89,809));
	    
	    map.put(101,new Book("a6", "C", "ME", 26,625));
	    
	    
	    set.add(new Book("a1","HP" ,"JKR", 20, 650));
        set.add(new Book("a3", "DS", "ZXC", 30,305));		
        set.add(new Book("a4", "CPP", "RPS", 65,120));
        set.add(new Book("a2", "LOR", "ASD", 25,405));

        set.add(new Book("a5", "C", "ME", 26,601));
        set.add(new Book("a5", "C", "DNR", 89,809));

        set.add(new Book("a6", "C", "ME", 26,625));
        set.add(new Book("a6", "DM", "ME", 26,625));
		
	}

}
