package abbHelper;

import java.util.HashMap;

public class Abbreviations {

	private HashMap<String,String> word=new HashMap<String,String>() ;
	
	
	public Abbreviations() {
		this.word=word;
	}
	
	public Abbreviations( HashMap<String ,String > word) {
		this.word=word;
	}

	public HashMap<String, String> getWord() {
		return word;
	}

	public void setWord(HashMap<String, String> word) {
		this.word = word;
	}

	public String toString() {
		return null;
	}

	public void addAbbreviation(String string, String string2) {
		this.word.put(string, string2);
	}

	public boolean hasAbbreviation(String part) {
		if(word.containsKey(part)) {
			return true;
		}else {
		return false;
		}
	}

	public String findExplanationFor(String part) {
		if(word.containsKey(part)) {
			return word.get(part);
		}else {
		return null;
		}
	}
	
	

}
