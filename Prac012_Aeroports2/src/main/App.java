package main;

import java.util.Scanner;
import java.util.ArrayList;

import aeroprts.Plane;
import menu.Consola;
import menu.MenuFirstOptions;


public class App {
	
	public static void main (String[] args) {
		boolean controlOptions=true;
		boolean controlPrint=true;
		Scanner reader=new Scanner(System.in);		
		ArrayList<Plane> planes= new ArrayList<Plane>();
		
		while (controlOptions) {
			controlOptions=MenuFirstOptions.menuConsola(planes, reader);
		}
		
		while (controlPrint) {
			controlPrint=Consola.menuPrint(planes,reader);
		}
		
		System.out.println("Thanks for using the service of Airports. See you in sky!!");
	}

}
