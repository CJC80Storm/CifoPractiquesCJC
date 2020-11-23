package programDB;

import java.util.HashMap;

public class Program {
	HashMap<String,String> hashmap;
	
	public Program (HashMap<String,String> hashmap) {
		this.hashmap=hashmap;
	}
	
	public HashMap<String, String> getHashmap() {
		return hashmap;
	}

	public void setHashmap(HashMap<String, String> hashmap) {
		this.hashmap = hashmap;
	}
	
	public String toString() {
		return hashmap.values().toString();
	
	}

	public static void printKeys(HashMap<String,String> hashmap) {
		
		for(String h : hashmap.keySet()) {
			System.out.println(h);
		}
	}
	
	public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
		
		for(String keyControler: hashmap.keySet()) {
			if(keyControler.contains(text)) {
		
				System.out.println(keyControler);;
			}
		}
	}

	public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
		
		for(String keyControler : hashmap.keySet()) {
						
			if(keyControler.contains(text)) {
				System.out.println(hashmap.get(keyControler));
			}
		}
		
	}

	
	
}
