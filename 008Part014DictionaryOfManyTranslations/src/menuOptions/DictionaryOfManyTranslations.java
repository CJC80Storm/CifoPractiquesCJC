package menuOptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
	HashMap<String, ArrayList<String>> dicList =new HashMap<String, ArrayList<String>>();
	
	public DictionaryOfManyTranslations() {
		this.dicList=dicList;
	}

	public HashMap<String,ArrayList<String>> getDicList() {
		return dicList;
	}

	public void add(String word, String translation) {
		//adds the translation for the word and preserves the old translations.
		boolean controlExistingWord=false;
		for(String wordSearched: this.dicList.keySet()) {
			if(wordSearched.equals(word)) {
				controlExistingWord=true;
				this.dicList.get(wordSearched).add(translation);
				break;
			}
		}
		if(!controlExistingWord) {
			ArrayList<String> traslationsList =new ArrayList<String>();
			traslationsList.add(translation);
			this.dicList.put(word, traslationsList);
		}
		}
	
	public ArrayList<String> translate(String word){
		//returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
		ArrayList<String> traslatedList=new ArrayList<String>();
		for(String wordSearched: this.dicList.keySet()) {
			if(wordSearched.equals(word)) {
				traslatedList.addAll(this.dicList.get(wordSearched));
				break;
			}
		}
		if(traslatedList.size()==0) {
			traslatedList.add("There is no traslations.");
		}
		
		return traslatedList;
	}
	public void remove(String word) {
		//removes the word and all its translations from the dictionary.
		for(String wordSearched: this.dicList.keySet()) {
			if(wordSearched.equals(word)) {
				this.dicList.remove(wordSearched);
				break;
			}
		}
	}
	
	public int hashCode() {
		return this.dicList.keySet().hashCode();
	}
}
