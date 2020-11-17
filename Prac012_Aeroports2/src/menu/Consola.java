package menu;

import java.util.ArrayList;
import java.util.Scanner;

import aeroprts.Flight;
import aeroprts.Plane;

public class Consola {

	public static boolean menuPrint(ArrayList<Plane> planes, Scanner reader) {
		
		System.out.println("Choose an option:");
		System.out.println("[1] Print Planes.");
		System.out.println("[2] Print Flights.");
		System.out.println("[3] Print .");
		System.out.println("[x] Quit.");
		System.out.print(">");
		String type=reader.next();
		String typeLowCase=type.toLowerCase();
		
		if(typeLowCase.equals("1")){
			printPlanes(planes, reader);
		} else if(typeLowCase.equals("2")){
			printFlights(planes, reader);
		} else if(typeLowCase.equals("3")){
			printAPlane(planes, reader);
		}else if(typeLowCase.equals("x")) {
			return false;
		}
		return true;
		
	}
	
	//imprimir avions, imprimir vols i imprimir informació de l'avió
	public static void printPlanes(ArrayList<Plane> planes, Scanner reader) {
		for (Plane plane: planes) {
			if(plane.getFligths().size()==0) {
				System.out.println(plane.toString()+", Sense cap vol assignat");
			} else if((plane.getFligths().size()>=1) ) {
				for (Flight flight:plane.getFligths()){
					System.out.println(plane.toString()+", ("+flight.toStringFlight());
				}
			}
		}
	}
	
	public static void printFlights(ArrayList<Plane> planes, Scanner reader) {
		for (Plane plane: planes) {
			//System.out.println(plane.toStringPlane());
		}
	}
	
	public static void printAPlane(ArrayList<Plane> planes, Scanner reader) {
		System.out.print("Doneu codi avió: ");
		String typed=reader.nextLine();
		String idLowCase=typed.toLowerCase();
		int existingPlane=searchPlane(idLowCase,planes);
		
		System.out.println(planes.get(existingPlane).toString());
	}

	public static int searchPlane(String idLowCase, ArrayList<Plane> planes) {
		for(Plane planeObject: planes) {
			if(planeObject.equals(idLowCase)) {
				return planes.indexOf(planeObject);
			}
		}
		return planes.size()+1;
	}
	
}
