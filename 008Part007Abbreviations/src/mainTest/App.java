package mainTest;

import abbHelper.Abbreviations;

public class App {

	public static void main(String[] args) {
		
		String text = "e.g. i.e. etc. lol";
		
		Abbreviations abbreviations = new Abbreviations();
		
		abbreviations.addAbbreviation("e.g.", "for example");
		abbreviations.addAbbreviation("etc.", "and so on");
		abbreviations.addAbbreviation("i.e.", "more precisely");
		
		for (String part: text.split(" ")) {
		    if(abbreviations.hasAbbreviation(part)) {
		        part = abbreviations.findExplanationFor(part);
		    }
				
		System.out.print(part);
	    System.out.print(" ");
		}
	}
	
}
