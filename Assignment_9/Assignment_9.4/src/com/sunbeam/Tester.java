/*
4. Store book details in a library in a list -- ArrayList.
Book details: isbn(string), price(double), authorName(string), quantity(int)
Write a menu driven (do-while + switch-case) program to
1. Add new book in list.
2. Display all books in forward order.
3. Delete at book given index -- list.remove(index);
4. Check if book with given isbn is in list or not
5. Delete all books in list
6. Display number of books in list
7. Sort all books by price in desc order -- list.sort();
 */


package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		List<Book>list=new ArrayList<>();
		
		Book b;
		int index,choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			
			System.out.println("**********************************");
			System.out.println("1.Add new book in list");
			System.out.println("2.Display all books in forward order");
			System.out.println("3.Delete at book given index");
			System.out.println("4.Check if book with given isbn is in list or not");
			System.out.println("5.Delete all books in list");
			System.out.println("6.Display number of books in list");
			System.out.println("7.Sort all books by price in desc order");
			System.out.print("Enter your choice=");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: //Add Book
				    b=new Book();
				    b.acceptdata();
				    list.add(b);
				    break;
				    
			case 2: //Display Book
				     for (Book ele : list) {
						System.out.println(ele);
					}
			          break;
			case 3:
				     System.out.print("Enter the index at which want to delete=");
				     index=sc.nextInt();
				     list.remove(index);
				     break;
			case 4:
				   String isbn;
				   Scanner sc1=new Scanner(System.in);
				   isbn=sc1.next();
				   Book key=new Book();
				   key.setIsbn(isbn);
				   if(list.contains(key))
				    System.out.println("Key is Found");
				   else
					 System.out.println("Key is not Found"); 
				   break;
				   
			case 5://Delete Book
				    list.clear();
				    
				    break;
				    
			case 6: //Display all books
				   System.out.println("Size="+list.size());
				   
				   break;
				   
		     
			case 7: 
				class BookPriceComparator implements Comparator<Book>
				{
					public int compare(Book b1,Book b2) 
					{
						int diff=Double.compare(b1.getPrice(), b2.getPrice());
						
						return diff;
					
					}
					
				}
				
				BookPriceComparator priceComparator=new BookPriceComparator();
				list.sort(priceComparator);
				break;
			   
				   
			}	   
			
			
		}while(choice !=0);
		
		
		}
	}


	
	
