package Utils;

import java.util.Scanner;
import java.util.ArrayList;

import packlibrary.Book;
import packlibrary.Library;

public class MenuOpciones {
	
	public static void main (String[] args) {
		String menu;
		String titleBook;
		int counterInsertedBooks=0;
		int counterActions=0;
		String menu1="insert book";
		String menu2="search book";
		String menu3="quit";
		int positionFindedInArray;
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to Library New Book Generation X.");
				
		ArrayList<Book> books= new ArrayList<Book>();
		books=baseConditions(books);
			
		while(true) {
			System.out.println("How procedure? (Type your choice: Insert Book/Search Book/Quit).");
			menu=MenuOpciones.scannString(reader);		
			
			if(menu.contentEquals(menu1)) { //Insert book
				books.add(insertBook(books, reader));
				counterInsertedBooks++;
				counterActions++;
								
			} else if(menu.contentEquals(menu2)){ //Search Book
					
				System.out.println("Introduce de title of the searched book:");
				titleBook=scannString(reader);		
				positionFindedInArray=Library.searchOnLibrary(titleBook,books);
					
				if(positionFindedInArray<books.size()) {
					System.out.println("The book searched, has the Title: "+books.get(positionFindedInArray).getAuthor()+", edited for: "+books.get(positionFindedInArray).getAuthor()+", in the year: "+books.get(positionFindedInArray).getYear());
				} else {
					System.out.println("Your search is not in our database. Our deepest apologies.");
				}
				counterActions++;
				
			
			}else if(menu.contentEquals(menu3))break;
			
		}
		System.out.println("There is: "+counterInsertedBooks+" new books added.");
		System.out.println("It is done: "+counterActions+" actions this time.");
		System.out.println("Thanks for using our services. Library New Book Generation X.");
	}

	public static String scannString(Scanner reader) {
		
		
		String typed=reader.nextLine();
		String typeconverted=Book.convertLetter(typed);
		return typeconverted;
	}
	
	public static int scannInt(Scanner reader) {
		int typed;
		
			typed= reader.nextInt();
		
		return typed;
	}

	public static ArrayList<Book> baseConditions (ArrayList<Book> books) {
		books.add(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		books.add(new Book("NHL Hockey", "Stanley Kupp", 1952));	
		return books;
	}

	public static Book insertBook(ArrayList<Book> books,Scanner reader) {
		String titleBook;
		String  authorBook;
		int yearBook;
		
		System.out.println("Introduce de Title: (if unkwoned: Unkwoned).");
		titleBook=MenuOpciones.scannString(reader);

		System.out.println("Introduce de author: (if unkwoned: Unkwoned).");
		authorBook= MenuOpciones.scannString(reader);
		
		System.out.println("Introduce de year: (if unkwoned: 100).");
		yearBook=MenuOpciones.scannInt(reader);
		
		Book book=new Book(titleBook,authorBook,yearBook);
		
		return book;
	}
}

