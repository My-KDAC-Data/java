package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	
	//Book details: isbn(string), price(double), authorName(string), quantity(int)
	
	private String isbn ;
	private double price ;
	private String authorName ;
	private int quantity ;
	
	public Book()
	{
		
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void QuantityIncrement() {
		this.quantity = quantity++;
	}
	

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.print("Enter isbn for Book: \t");
		this.isbn = sc.next();
		System.out.print("Enter price of the Book: \t");
		this.price = sc.nextDouble();
		System.out.print("Enter Author Name of the Book: \t");
		this.authorName = sc.next();
		System.out.print("Enter Quantities of Book: \t");
		this.quantity = sc.nextInt();
		System.out.println("----------------------------");
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
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
		return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn) ;
				
	}


	
	

}