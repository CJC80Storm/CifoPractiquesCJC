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
			
			String command = ask(scanner, option);
			   	 
			if (command.equals("quit")) {
				break;
			} else if (command.equals("add")) {
				add(scanner,dB);
			} else if (command.equals("observation")) {
				observation(scanner,dB);
			} else if (command.equals("show")) {
				show(scanner,dB);
			} else if (command.equals("statistics")) {
            	statistics(scanner,dB);
        	}else {
            	System.out.println("Unknown command!");
        	}
			counterActions++;
		}
		return counterActions;
	}
	
	public static String ask(Scanner input, String option) {
		System.out.println("Choose your choice: 'Add', 'Observation', 'Show', 'Statistics'.");
		System.out.print("?");
		option=ScannString(input);
		return option;
	}
	 
	public static void add(Scanner input, BirdDataBase db) {    
				
		System.out.println("Name: ");
		System.out.print("?");
		String name=ScannString(input);
		
		System.out.println("Latin Name: ");
		System.out.print("?");
		String nameLatin=ScannString(input);
		System.out.println("Time this bird was see.");
		System.out.print("?");
		int times=ScannInt(input);
		
		int existingBird=searchBird(name, db);
					
		if(existingBird==-1) {
			
			System.out.println("Do you know who see in first time?(Yes/No)");
			System.out.print("?");
			String command=ScannString(input);
			
			if(command.contains("yes")) {
				System.out.println("First Name");
				System.out.print("?");
				String firstName=ScannString(input);
				System.out.println("Last Name.");
				System.out.print("?");
				String lastName=ScannString(input);
				System.out.println("Age.");
				System.out.print("?");
				int age=ScannInt(input);
				
				db.getBirds().add(new Bird(name, nameLatin,new Person(firstName,lastName,age),times));
				
			}else if(command.equals("no")) {
				db.getBirds().add(new Bird(name, nameLatin,times));	
			} 
		} else {
			db.getBirds().get(existingBird).setNumberOfTimesSeen(db.getBirds().get(existingBird).getNumberOfTimesSeen()+times);
		}
			
		
	}
 
    private static int searchBird(String name, BirdDataBase db) {
		int index=0;
    	for(Bird bird: db.getBirds()) {
			if(bird.getName()==name) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static BirdDataBase observation(Scanner input, BirdDataBase db) {  
    	System.out.println("What was observed? ");
    	String name=ScannString(input);
		
		for(int indexBird=0;indexBird<db.getBirds().size();indexBird++) {
		
			if(db.getBirds().get(indexBird).equals(name)) {
				db.getBirds().get(indexBird).setNumberOfTimesSeen(db.getBirds().get(indexBird).getNumberOfTimesSeen()+1);
				break;
			}else if(indexBird==db.getBirds().size()) {
				System.out.println("It is not a bird!!");
			}
		}
		return db;		
    }
 
    public static void show(Scanner input, BirdDataBase db) {  
    	System.out.println("What? ");
    	String name=ScannString(input);
    			
		for(Bird bird : db.getBirds()) {
			
			if(bird.getName().equals(name)) {
				System.out.println(bird.toString());
				break;
			}
		}
    }
 
    public static void statistics(Scanner input, BirdDataBase db) {  
        	System.out.println(db.getBirds().toString());
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
		birds.add(new Bird("owls","owls",5));
    	birds.add(new Bird("columbidae","columbidae",6));
    	birds.add(new Bird("finches", "finches",9));
    	birds.add(new Bird("finches", "finches",12));
    	birds.add(new Bird("pigeon", "pigeon",5));
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
