package menuOptions;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		Scanner reader= new Scanner(System.in);
		System.out.println("Type the day of date: ");
		System.out.print("?");
		int day=reader.nextInt();
		System.out.println("Type the month of date: (in numbers) ");
		System.out.print("?");
		int month=reader.nextInt();
		System.out.println("Type the year of date: (in numbers) ");
		System.out.print("?");
		int year=reader.nextInt();
		
		checkValidDay(day,month,year);
		
	}

	public static void checkValidDay(int day, int month, int year) {
		int counterDays;
		int referenceDay=1;
		int referenceMonth=1;
		int referenceYear=1978;
		
		if(referenceYear<year) {
			if(true) {
				
			}
		}
		
	}
	
	

}
