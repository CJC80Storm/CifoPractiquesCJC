package packlibrary;
import java.util.Scanner;
import java.util.ArrayList;

public class MenuOpciones {
	public static void main (String[] args) {

		String menu;
		String readed;
		String titleBook;
		String  authorBook;
		int yearBook;
		int counterInsertedBooks=0;
		int counterActions=0;
		String menu1="insert book";
		String menu2="search book";
		String menu3="quit";
		String LibDB="Libreria";
		boolean controlQuit=true;
		int controlAnswer=0;
	
		System.out.println("Welcome to Library New Book Generation X.");
		System.out.println("How procedure? (Type your choice: Insert Book/Search Book/Quit).");
	
		Scanner readerMenu= new Scanner(System.in);
		readed= readerMenu.nextLine();
		menu=Book.convertLetter(readed);
		
		Library.baseConditions(counterInsertedBooks);
		
		//public libraryDB (String LibDB){
			//this.library=ArrayList<Library>();
			//this.dbName= LibDB;
		//}

	
		while(menu.contentEquals(menu3)){
			while(true) {
				
				if(menu.contentEquals(menu1)) { //Insert book
					
					controlQuit=insertBook();
					if(controlQuit==false)break;
					counterInsertedBooks++;
				} else {
					controlAnswer++;
				}
				
				if(menu.contentEquals(menu2)){ //Search Book
					
					System.out.println("Introduce de title of the searched book: (if you want to quit: type 'Quit'.)");
					Scanner readerString= new Scanner(System.in);
					titleBook= readerString.nextLine();
					titleBook=Book.convertLetter(titleBook);
					
					if (titleBook==menu3) break;
					
					Library.searchOnLibrary(titleBook);
					
					counterActions=counterActions+1;
				} else {
					controlAnswer++;
				}
							
				if (controlAnswer==2) { //Reactive the bucle.
					System.out.println("How procedure? (Type your choice: Insert Book/Search Book/Quit).");
					Scanner readerMenu20= new Scanner(System.in);
					menu= readerMenu20.nextLine();
					menu=Book.convertLetter(menu);
					
					if (menu.contentEquals(menu3)) break;
				}
				System.out.println("How procedure? (Type your choice: Insert Book/Search Book/Quit).");
			}
		}
		System.out.println("There is: "+counterInsertedBooks+" new books added.");
		System.out.println("It is done: "+counterActions+" actions this time.");
		System.out.println("Thanks for using our services. Library New Book Generation X.");
	}

	private static boolean insertBook() {
		
		String titleBook;
		String  authorBook;
		int yearBook;
		String menu3="quit";
		
		System.out.println("Introduce de Title: (if unkwoned: Unkwoned).");
		Scanner readerString= new Scanner(System.in);
		titleBook= readerString.nextLine();
		titleBook=Book.convertLetter(titleBook);
		if (titleBook==menu3) {return false;}

		System.out.println("Introduce de author: (if unkwoned: Unkwoned).");
		Scanner readerString2= new Scanner(System.in);
		authorBook= readerString2.nextLine();
		authorBook=Book.convertLetter(authorBook);

		System.out.println("Introduce de year: (if unkwoned: 100).");
		Scanner readerint= new Scanner(System.in);
		yearBook=readerint.nextInt();
		
		Book bookAdd = new Book(titleBook,authorBook,yearBook);
		return true;
	}
}
