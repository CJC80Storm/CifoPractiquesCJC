package Birding;
import java.util.ArrayList;
import java.util.Scanner;

public class CallOptions {

	public static void main (String[] args) {
		int referenceChoice;
		boolean answer=true;
			
		BirdsDB db = new BirdsDB( );
		
		while(answer) {
			referenceChoice=CallOptions.call();
			answer=choice(referenceChoice);
		}
		System.out.println("Thanks for use the Bird Data Base");
	}
	
	public static boolean choice(int i) {
		
		if(i==0) {
			return false;
		} else if(i==1){
			CallOptions.Add();
			return true;
		} else if(i==2) {
			CallOptions.Observation();
			 return true;
		} else if(i==3) {
			CallOptions.Show();
			return true;
		} else if(i==4) {
			CallOptions.Stadistics();
			return true;
		} 	
		return false;
	}
		
	public static int call() {
		int numberBack = 0;
		String optionName; 
		String option1="add";
		String option2="observation";
		String option3="stadistics";
		String option4="show";
		String option0="quit";
		
		System.out.println("Choose your option: add, Observation, Stadistics, Show, Quit" );
		while(true) {
			System.out.print("?");
			
			optionName=scanner();
					
			if(optionName.equals(option1)) {
				numberBack=1;
				break;
			}
			if(optionName.equals(option2)) {
				numberBack=2;
				break;
			}
			if(optionName.equals(option3)) {
				numberBack=3;
				break;
			}
			if(optionName.equals(option4)) {
				numberBack=4;
				break;
			}	
			if(optionName.equals(option0)) {
				numberBack=0;
				break;
			}
		}
			return numberBack;
	}
	
	private static String scanner() {
		String typed;
		Scanner reader =new Scanner(System.in);
		typed=reader.nextLine();
		typed=convertLetter(typed);
		return typed;
	}

	public static String convertLetter(String word) {
		String abcd ="ABCDEFGHIKLMNOPQRSTVXYZ abcdefghiklmnopqrstvxyz ";
		
		ArrayList<Character> abcCapAMinus= new ArrayList<Character>();
		for(int a=0;a<=abcd.length()-1;a++) {
			abcCapAMinus.add(abcd.charAt(a));
		}
		
		for(int i=0;i<=word.length()-1;i++){
			for(int b=0;b<=((abcCapAMinus.size()/2)-1);b++){
				if (abcCapAMinus.get(b)==word.charAt(i)) {
					int c=b+(abcCapAMinus.size()/2);
					word=word.replace(word.charAt(i),abcCapAMinus.get(c));									
					break;
				}
			}
		}
		return word;
	
}

	public static void Add() {
		System.out.print("Name: ");
		//BirdsDB.
		//Bird.setRegularName(scanner());
		
		System.out.print ("Latin Name: ");
		
		//BirdsDB.Bird.setLatinName(scanner());
		System.out.print("Observations: ");
		//BirdsDB.Bird.set
	
	
	}

	public static void Stadistics() {
	//
	
	}

	public static void Show() {
	// TODO Auto-generated method stub
	
	}

	public static void Observation() {
	// TODO Auto-generated method stub
	
	}
}
