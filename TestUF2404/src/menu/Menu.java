package menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import basic.Book;
import basicList.Author;

public class Menu {
	private static char m;
	private static char f;
	
	public static ArrayList<Author > setDataBaseInitial(){
	
	ArrayList<Author> db= new ArrayList<Author>();
	
	Author author1 = new Author("Fulanito","ful2322@mail.net", m);
	Author author2 = new Author("Menganita","mengarodri55@mail.net", f);
	Author author3 = new Author("Jaimito","toloco69@mail.net", m);
	Collections.addAll(db,author1,author2,author3);
	
	return db;
	}
	
	public static void setmenu(ArrayList<Author> db) {
		String typed;
		int indexPrint=0;
		
		while(true) {
			
			System.out.println("Type you choice(letter); Start, Create book, ReAssing, or Quit.");
			typed = Scanner();
			
			ArrayList<String>optionsDB= new ArrayList<String>();
			Collections.addAll(optionsDB,"Start", "Create book", "ReAssing", "Quit");	
			
			if (typed.equals(optionsDB.get(3)))break;
			else if(typed.equals(optionsDB.get(0))){
				db=start(db);
			}else if(typed.equals(optionsDB.get(1))){
				db=createBook(db);
				System.out.println("Size:" + db);
			}else if(typed.equals(optionsDB.get(2))){
				db=assign(db);
			}
		} 
		while(indexPrint<db.size()){
			System.out.println("The books of "+db.get(indexPrint).getName()+" are: "+db.get(indexPrint).getBooks());	
			indexPrint++;
		}
	}

	public static ArrayList<Author> start(ArrayList<Author> db){
		
		ArrayList<Book> books1 =new ArrayList<Book>();
			Book Sabor= new Book("Sabor",2001,"EdicionesA",20.0);
			Book Olor= new Book("Olor",2002,"EdicionesB",30.0);
			Book Vista = new Book("Vista",2020,"EdicionesC",15.0);		
		
			books1.add(Sabor);
			books1.add(Olor);
			books1.add(Vista);
	
		//Asignar libros a autor1, nota: el nombre del author se asignan de serie a author1
			db.get(0).setBooks(books1);
	
		//quedan sin asignarles libros
		ArrayList<Book> books2 =new ArrayList<Book>();
			db.get(1).setBooks(books2);
		ArrayList<Book> books3 =new ArrayList<Book>();
			db.get(2).setBooks(books3);
			
			return db;
	}

	public static ArrayList<Author> createBook(ArrayList<Author> db){
		int index=0;
		ArrayList<Book> books2 =new ArrayList<Book>();
	
		while (true) {
			System.out.println("Type Title, (if you want to finish, type 'quit'). ");
			String bookTitle=Scanner();
			if (bookTitle.contains("quit")) break;
			//String autName=db.get(1).getName(); //author Name, ArrayList code had his/her name.
			System.out.println("Type Year Publishing:");
			int publishYear=ScannerInt();
			System.out.println("Type Editorial:");
			String editorial=Scanner();
			System.out.println("Type Price:");
			double price=ScannerDouble();
			
			String bookName="name"+Integer.toString(index);
			index++;
				
			books2.add(new Book(bookTitle,publishYear,editorial,price));
		}
		
		db.get(1).setBooks(books2); 
		System.out.println("  ");
		return db;
	}

	private static String Scanner() {
		String typed;
		
		Scanner reader =new Scanner(System.in);
		typed = reader.nextLine();
		return typed;
	}

	private static int ScannerInt() {
		int typed;
		
		Scanner reader =new Scanner(System.in);
		typed = reader.nextInt();
		return typed;
	}

	private static double ScannerDouble() {
		double typed;
		
		Scanner reader =new Scanner(System.in);
		typed = reader.nextLong();
		return typed;
	}
	
	public static ArrayList<Author> assign(ArrayList<Author> db){
		//Reasignar libros de un author
		int y=0;
		int x=0;
		
		
		while(true){
			db=Menu.createBook(db);
			while(y<db.size()) {
				System.out.println(db.get(y)+" and their books are: ");
				while(x<db.get(y).getBooks().size()){
					System.out.println(db.get(y).getBooks().get(x));
					x++;
				}
				y++;
			}
			
			System.out.println("It is Correct?(YES/NO)");
			String answer=Scanner();
			if(answer.equals("NO")) {
				db.get(2).getBooks().add(db.get(1).getBooks().get(0));
				db.get(1).getBooks().remove(0);
			}else break;
		}
		return db;
	}
	
	public static void setdbName(String DB1){
		
	}
	
	

}
