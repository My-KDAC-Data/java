package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class String_highest_length {

	public static void main(String[] args) {
		
		
		List <String> list = new ArrayList<>();
		list.add("Nilesh");
		list.add("Nitin");
		list.add("Vishal");
		list.add("Prashant");
		list.add("Ramesh");
		
		System.out.println(Collections.max(list , new String_Comparator()) );
		
		

	}

}
