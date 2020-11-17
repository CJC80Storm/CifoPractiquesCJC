package menu;

import java.util.ArrayList;
import java.util.Scanner;

import aeroprts.Flight;
import aeroprts.Plane;

public class MenuFirstOptions {
	
	public static boolean menuConsola(ArrayList<Plane> planes,Scanner reader) {
		
		System.out.println("Choose an option:");
		System.out.println("[1] Add a plane.");
		System.out.println("[2] Add a flight.");
		System.out.println("[x] Quit.");
		System.out.print(">");
		String type=reader.next();
		String typeLowCase=type.toLowerCase();
		
		if(typeLowCase.equals("1")){
			addPlane(planes, reader);
		} else if(typeLowCase.equals("2")) {
			addFlight(planes, reader);
		} else if(typeLowCase.equals("x")) {
			return false;
		}
			
		return true; 
	}
	
	public static void addPlane(ArrayList<Plane> planes, Scanner reader) {
		System.out.println("Doneu codi avió:");
		
		String typed=reader.next();
		String idLowCase=typed.toLowerCase();
		System.out.println("? ");
		System.out.print("Doneu la capacitat de l'avió:");
		int capacity=reader.nextInt();
				
		planes.add(new Plane(idLowCase,capacity));
	}
	
	public static void addFlight(ArrayList<Plane> planes, Scanner reader) {
		System.out.print("Doneu codi avió: ");
		String typed=reader.next();
		String idLowCase=typed.toLowerCase();
		int existingPlane=Consola.searchPlane(idLowCase,planes); 
		
		if(existingPlane>planes.size()) {
			System.out.print("Doneu codi aeroport  arribada(arrival): ");
			String typed1=reader.next();
			String idDeparture=typed1.toLowerCase();
			System.out.print("Doneu codi aeroport sortida(departure): ");
			String typed2=reader.next();
			String idArrival=typed2.toLowerCase();
			
			planes.get(existingPlane).getFligths().add(new Flight(idDeparture,idArrival));
		} else {
			System.out.print("Doneu la capacitat de l'avió");
			int capacity=reader.nextInt();
			System.out.print("Doneu codi aeroport arribada(arrival): ");
			String typed3=reader.next();
			String idDeparture=typed3.toLowerCase();
			System.out.print("Doneu codi aeroport sortida(departure): ");
			String typed4=reader.next();
			String idArrival=typed4.toLowerCase();
			
			Flight flightAux=new Flight(typed4,typed3);
			ArrayList<Flight> flightPerPlane= new ArrayList<Flight>();
			flightPerPlane.add(flightAux);
			planes.add(new Plane(idLowCase,capacity,flightPerPlane));
		}
	}
	
	
}
