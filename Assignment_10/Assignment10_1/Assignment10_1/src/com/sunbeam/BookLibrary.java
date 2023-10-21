//1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
//and DataInputStream.

package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookLibrary {
	
	public static int menu() {
		int choice , index ;
		System.out.println("-------------------------------");
		System.out.println("0. Exit"); //If book not present, then add a new book (hint - contains())
		                               //If book is present, increment its quantity.
		System.out.println("1. Add new book");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn (hint - indexOf())");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");
		
		System.out.print("Enter Your Choice: \t");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------");
		return choice;

	}

	public static void main(String[] args) {
		
		List<Book> lib = new ArrayList<>();
		Book book ; 
	
		
		
		
		while(true)
		{
			int choice = menu();
			switch(choice) {
			
			case 1 :
				book = new Book();
				book.accept();
				
				if(lib.contains(book)) {
					int index = lib.indexOf(book);
					book = lib.get(index);
				    book.setQuantity(book.getQuantity()+1);
				 System.out.println("Books after increment = " + book.getQuantity());
				}
				   
				     
				else { 
						lib.add(book);
						System.out.println("Book Added.");
					    
				}
				    
				break;
				
				
			case 2 :
			
			ListIterator<Book> itr = lib.listIterator();
			while(itr.hasNext()) {
				Book b = itr.next();
				System.out.println(b);
			}
				break;
				
			case 3 :
				
		         int index ;
		         String isbn3 ;
		         System.out.println("enter isbn to search book");
		         Scanner obj = new Scanner(System.in);
		         isbn3 = obj.next();
		         
		         Book b = new Book();
		         b.setIsbn(isbn3);
		         index = lib.lastIndexOf(isbn3);
		         if(index > 0 )
		         {
		        	 System.out.println(lib.get(index));
		         }
		         else
					 System.out.println("Book is not in the list");
				break;
			
			
		   
			case 4 :
				
				int index4 ;
				System.out.println("enter index (0 to " + lib.size() + " to delete object from list");
				Scanner obj4 = new Scanner(System.in);
				index4 = obj4.nextInt() ;
				lib.remove(index4);
				break;
				
			case 5: // Delete a book with given isbn.
				
				String key5 ;
				System.out.println("enter isbn to delete book ");
				Scanner obj5 = new Scanner(System.in);
				key5 = obj5.next();
				
				ListIterator <Book> booklist5 = lib.listIterator();
				if(lib.contains(key5));
				
				while (booklist5.hasNext())	
				{ 
					Book bookObj= booklist5.next();
		        	if(bookObj.equals(key5))
		        	{
		        		lib.remove(bookObj);
				        System.out.println("Book is deleted from the list");
		        	}
		         
		        
		         else 
		        System.out.println("Can't delete, Book is not in the list"); 
				
				}
				
	     		break;
	     		
			case 6:  //Reverse the list (hint - Collections.reverseList()) 
				Collections.reverse(lib);
				System.out.println(lib);
				
				break;



		
			}		
		}
		
	}

	}


