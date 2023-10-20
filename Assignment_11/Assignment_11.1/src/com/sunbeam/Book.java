package com.sunbeam;

import java.util.Objects;

import java.util.Scanner;



public class Book  {

   private String isbn;
   private String title;
   private String author;
   private int quantity;
   private double price;
   
   
   
   public Book()
    {
	
   }
   
   
  public Book(String isbn, String title, String author, int quantity, double price)
  {

	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.quantity = quantity;
	this.price = price;
}


public String getIsbn() {
	return isbn;
}


public void setIsbn(String isbn) {
	this.isbn = isbn;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
			+ price + "]";
}


public void acceptdata()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter Book ISBN= ");
	isbn=sc.next();
	System.out.print("Enter Book Title= ");
	title=sc.next();
	System.out.print("Enter Book Author= ");
	author=sc.next();
	System.out.print("Enter Book Quantity= ");
	quantity=sc.nextInt();
	System.out.print("Enter Book price= ");
	price=sc.nextDouble();
	
}


@Override
public int hashCode() {
	return Objects.hash(isbn);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(isbn, other.isbn);
}













//@Override
//public boolean equals(Object obj)
//{
//	if (obj == null)
//		return false;
//	if (this == obj )
//		return true;
//	
//	if(obj instanceof Book) {
//		Book other=(Book) obj;
//		if(this.isbn.equals(other.isbn));
//			return true;
//	}
//	return false;
//}


    
	
 
   
   
   
}

