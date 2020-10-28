package basicList;
import java.util.ArrayList;

import basic.Book;

public class Author {
	private String name; 
	private String email;
	private char gender;
	private ArrayList<Book> books;
	private ArrayList<Author> db;
	
	 public Author(String name, String email, char gender) {
	 	this.name = name;
	 	this.email = email;
	 	this.gender = gender;
		this.books = new ArrayList<Book>();
	 }
	 	 
	 public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public String getName() {
		return this.name;
	}
	 
	public String getEmail() {
			return this.email;
	 }
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
		 
	 public String toString() {
		// to-do, print books as well
	 	String author = this.name + "(" + this.gender + ") at " + this.email;
	 	return author;
	 }
}	 