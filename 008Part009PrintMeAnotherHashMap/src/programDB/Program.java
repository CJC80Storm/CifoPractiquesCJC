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
		
		for(String h: hashmap.keySet() ) {
			
			if(hashmap.get(h).getTitle().contains(text)) {
				System.out.println("Name: "+hashmap.get(h).getTitle()+" ( "+hashmap.get(h).getYear()+")");
				System.out.println("Content: "+hashmap.get(h).getContent());
			}
		}
	}

}
