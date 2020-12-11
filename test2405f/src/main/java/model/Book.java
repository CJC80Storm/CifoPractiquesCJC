package model;

import java.util.ArrayList;



public class Book {

	private Integer id;
	private String title;
	private ArrayList<Quote> quotes;

 Book() {}

public Book(Integer id, String name) {
		this.id = id;
		this.title = name;
		this.quotes =quotes; 
		
	}

public Book(String name) {
		this.title = name;
		this.quotes =quotes; 
	}

public Integer getId() {
		return id;
	}

public void setId(Integer id) {
		this.id = id;
	}

public String getTitle() {
		return title;
	}

public void setTitle(String name) {
		this.title = name;
	}
	
public ArrayList<Quote> getQuotes() {
		return quotes;
	}

public void setQuote (ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

@Override
public String toString() {

	return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + '}';


	}
}
