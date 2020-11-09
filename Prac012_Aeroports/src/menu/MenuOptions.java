package menu;

import java.util.ArrayList;
import java.util.Scanner;

import aeroprts.Plane;

public class MenuOptions {
	
	public static boolean menuConsola(Scanner reader) {
		ArrayList<Plane> planes= new ArrayList<Plane>();
		
		System.out.println("Choose an option:");
		System.out.println("[1] Add a plane.");
		System.out.println("[2] Add a flight.");
		System.out.println("[x] Quit.");
		System.out.print(">");
		String type=reader.next();
		typeLowCase=type.toLowerCase();
		
		if(typeLowcase=="1"){
			addPlane(planes, reader);
		} else if(typeLowcase=="2") {
			addFlight(planes, reader);
		} else if(typeLowcase=="x") {
			return false;
		}
			
		return true; 
	}
	
	public static void addPlane(ArrayList<Plane> planes, Scanner reader) {
		System.out.print("Doneu codi avió: ");
		String typed=reader.nextLine();
		String idLowCase=typed.toLowerCase();
		System.out.print("Doneu la capacitat de l'avió");
		int capacity=reader.nextInt();
		
		planes.add(new Plane(idLowCase,capacity));
	}
	
	public static void addFligth(ArrayList<Plane> planes) {
		
		
	}
	

	
	
	
	
	
	
}
