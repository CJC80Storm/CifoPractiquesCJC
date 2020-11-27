package mainTest;

import programDB.Book;
import java.util.HashMap;


import programDB.Program;

public class AppTest {
	public static void main (String[] args) {
		
		HashMap<String, Book> hashmap = new HashMap<>();
		hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
		hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
		
		Program.printKeys(hashmap);
		System.out.println("---");
		Program.printValueIfNameContains(hashmap, "prejud");
	}
	
	

	
	
	
}
