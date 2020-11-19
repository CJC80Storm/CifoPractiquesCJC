package searching;

import java.util.ArrayList;
import java.util.Scanner;
import itemToSearch.Book;
import menu.ChoicesHelp;

public class SearchTest {
	
	public static void main (String[] args) {
		ArrayList<Book> books=new ArrayList<Book> ();
		int searchedID;
		Scanner reader=new Scanner(System.in);
		
		ChoicesHelp.fillArray(books, reader);
		
		System.out.print("Type the book to search [id]: "  );
		int typeInt=reader.nextInt();
		
		int searchedPosition=ChoicesHelp.linearSearch(books, typeInt);
		int sidePosition=ChoicesHelp.binarySearch(books, typeInt);
		String data="error";
		if(sidePosition==(books.size()/2)) {
			data="the middle of the List";
		} else if(sidePosition<(books.size()/2)) {
			data="below the middle of the list";
		}else if(sidePosition>(books.size()/2)) {
			data="above the middle of the list";
		}
		
		if(searchedPosition>=0) {
			System.out.println("The position in our database is: "+searchedPosition+" and it belongs at: "+data);
		} else{
			System.out.println("This book is not in our database.");
		}
		
				
	
	}

}
