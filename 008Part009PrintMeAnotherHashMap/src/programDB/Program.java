package programDB;

import java.util.HashMap;

public class Program {
	HashMap<String,Book> hashmap;
	
	public Program (HashMap<String,Book> hashmap) {
		this.hashmap=hashmap;
	}
	
	public HashMap<String, Book> getHashmap() {
		return hashmap;
	}

	public void setHashmap(HashMap<String, Book> hashmap) {
		this.hashmap = hashmap;
	}

	public String toString() {
		return hashmap.values().toString();
	
	}

	public static void printKeys(HashMap<String, Book> hashmap) {
		
		for(String h : hashmap.keySet()) {
			System.out.println(h);
		}
	}
	
	
	public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
		// TODO Auto-generated method stub
		
		/*for(HashMap<String,Book>.getBook book: hashmap.values() ) {
			
			if(hashmap.keySet().contains(text)) {
				System.out.println(hashmap.get(book).toString());
			}
		}*/
	}

}
