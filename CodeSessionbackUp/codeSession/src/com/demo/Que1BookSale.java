package com.demo;

import java.util.ArrayList;
import java.util.HashMap;

/*"There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map."
*/

class Book{
	private int bookid;
	private String author;
	private double price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookid, String author, double price) {
		super();
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", author=" + author + ", price=" + price + "]";
	}
	
}

class BookSale{
	private Book b;
	private int copiesSold;
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}
	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		this.copiesSold = copiesSold;
	}
	@Override
	public String toString() {
		return "BookSale [b=" + b + ", copiesSold=" + copiesSold + "]";
	}
	
}

public class Que1BookSale {
	public static void main(String[] args) {
		Book b=new Book(101,"john",120.55);
		Book b1=new Book(102,"Steve",550.50);
		Book b2=new Book(103,"Balguruswamy",650.55);
		Book b3=new Book(104,"Jenefer",320.55);
		Book b4=new Book(105,"seron",850.55);
		ArrayList<BookSale> bal=new ArrayList<>();
		bal.add(new BookSale(b, 10));
		bal.add(new BookSale(b1, 5));
		bal.add(new BookSale(b2, 15));
		bal.add(new BookSale(b3, 10));
		bal.add(new BookSale(b, 5));
		bal.add(new BookSale(b1, 4));
		
		HashMap<Integer,Double> hm=new HashMap<>();
		
		for(BookSale bs:bal) {
			int bookid=bs.getB().getBookid();
			double amt=bs.getB().getPrice();
			int copies=bs.getCopiesSold();
			double total_amt=amt*copies;
			if(hm.containsKey(bookid)) {
				double d=hm.get(bookid);
				d=d+total_amt;
				hm.put(bookid, d);
			}
			else {
				hm.put(bookid, total_amt);
			}
		}
		System.out.println(hm);
	}

}
