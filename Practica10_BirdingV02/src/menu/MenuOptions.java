package menu;

import java.util.ArrayList;
import java.util.Scanner;

import animal.Bird;
import animalDB.BirdDataBase;
import people.Person;


public class MenuOptions {
    
	public static int choiceOption (int counterActions) {
		Scanner scanner = new Scanner(System.in);
		String nameDB="DataBaseOfBirds.";
		ArrayList<Bird> birds=new ArrayList<Bird>();
		
		BirdDataBase dB=new BirdDataBase(birds,nameDB);
		String option="introduce data.";
		
		dB.setBirds(InitialBirds(dB.getBirds()));
		
		while (true) {
			counterActions++;
			String command = ask(scanner, option);
			   	 
			if (command.equals("quit")) {
				break;
			} else if (command.equals("add")) {
				dB=add(scanner,dB);
			} else if (command.equals("observation")) {
				dB=observation(scanner,dB);
			} else if (command.equals("show")) {
				show(scanner,dB);
			} else if (command.equals("statistics")) {
            	statistics(scanner,dB);
        	}else {
            	System.out.println("Unknown command!");
        	}
		}
		return counterActions;
	}
	
	public static String ask(Scanner input, String option) {
		System.out.println("Choose your choice: 'Add', 'Observation', 'Show', 'Statistics'.");
		System.out.print("?");
		option=ScannString(input);
		return option;
	}
	 
	public static BirdDataBase add(Scanner input, BirdDataBase db) {    
		boolean control=true;
		
		System.out.println("Name: ");
		System.out.print("?");
		String name=ScannString(input);
		System.out.println("Latin Name: ");
		System.out.print("?");
		String nameLatin=ScannString(input);
		System.out.println("Time this bird was see.");
		System.out.print("?");
		int times=ScannInt(input);
		
		//System.out.println("Do you know who see in first time?(Yes/No)");
		//System.out.print("?");
		//String command=ScannString(input);
		
		//while(command.contains("yes")||command.contains("no")) {
			//if(command.contains("yes")) {
				System.out.println("Who see first?(First Name)");
				System.out.print("?");
				String firstName=ScannString(input);
				System.out.println("Last Name.");
				System.out.print("?");
				String lastName=ScannString(input);
				System.out.println("Age.");
				System.out.print("?");
				int age=ScannInt(input);
				
				db.getBirds().add(new Bird(name, nameLatin,new Person(firstName,lastName,age),times));		
			//}else if(command.contains("no")) {
				//db.getBirds().add(new Bird(name, nameLatin,times));	
				//}
				//System.out.println("Unknown command! Repeat Answer");
			//} 
		return db;
	}
 
    public static BirdDataBase observation(Scanner input, BirdDataBase db) {  
    	System.out.println("What was observed? ");
    	String name=ScannString(input);
		int indexBird=0;
		while(indexBird<db.getBirds().size()) {
			if(db.getBirds().get(indexBird).equals(name)) {
				int a=(db.getBirds().get(indexBird).getNumberOfTimesSeen());
				db.getBirds().get(indexBird).setNumberOfTimesSeen(db.getBirds().get(indexBird).getNumberOfTimesSeen()+1);
				break;
			}
			indexBird++;
		}
		if(indexBird++>=db.getBirds().size()) {
			System.out.println("It is not a bird!!");
		}
		return db;		
    }
 
    public static void show(Scanner input, BirdDataBase db) {  
    	System.out.println("What? ");
    	String name=ScannString(input);
    	int indexBird=0;
		while(indexBird<db.getBirds().size()) {
			if(db.getBirds().get(indexBird).equals(name)) {
				int a=(db.getBirds().get(indexBird).getNumberOfTimesSeen());
				db.getBirds().get(indexBird).setNumberOfTimesSeen(db.getBirds().get(indexBird).getNumberOfTimesSeen()+1);
				break;
			}
			indexBird++;
		}
		System.out.println(db.getBirds().get(indexBird).getName()+" ("+db.getBirds().get(indexBird).getNameLatin()+"): "+db.getBirds().get(indexBird).getNumberOfTimesSeen()+" observations.");
    }
 
    public static void statistics(Scanner input, BirdDataBase db) {  
    	int indexBird=0;
    	while(indexBird<db.getBirds().size()){
    		System.out.println(db.getBirds().get(indexBird).getName()+" ("+db.getBirds().get(indexBird).getNameLatin()+"): "+db.getBirds().get(indexBird).getNumberOfTimesSeen()+" observations.");
    		indexBird++;
    	}
    }
    
	public static String ScannString(Scanner input) {
		String typed=input.nextLine();
		String typedLowerCase=typed.toLowerCase();
		return typedLowerCase;
	}
	
	public static int ScannInt(Scanner input) {
		int typed=input.nextInt();
		return typed;
	}
	
	public static ArrayList<Bird> InitialBirds(ArrayList<Bird> birds) {
		birds.add(new Bird("seagull", "dorkus dorkus", 0));
		birds.add(new Bird("raven", "corvus corvus", 0));
		birds.add(new Bird("Owls","Owls",5));
    	birds.add(new Bird("Columbidae","Columbidae",6));
    	birds.add(new Bird("Finches", "Finches",9));
    	birds.add(new Bird("Finches", "Finches",12));
    	birds.add(new Bird("Pigeon", "Pigeon",5));
		return birds;
	}

	public static int searchPerson(String name,String nameLat, BirdDataBase db) {
		int indexbird=0;
		while (indexbird<=db.getBirds().size()) {
			
			if((db.getBirds().get(indexbird).getName()).equals(name)) {
				return indexbird;
			}
			indexbird++;
		}
		return db.getBirds().size()+1;
	}

	
}
