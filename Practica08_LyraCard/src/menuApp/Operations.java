package menuApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import campusBar.BarCampus;
import campusBar.CashRegister;
import menuOptions.MenuToChoose;
import modelCard.LyyraCard;
import person.Person;
import menuOptions.MenuToChoose;

public class Operations {
	/*
	public CashRegister setOperations1(ArrayList<Person> customers) {
		CashRegister box1;
		MenuToChoose menu=ListForChoosing();
		int i;
		int dishchoice;
		int numberOfDishes=menu.getDishes().size();
		int CustomerPositionInArray;
		String typed;
		
		box1=SetInitialRegisterBox(box1);
		
		while (true) {
			CustomerPositionInArray= ScanNameInArray(customers);
			
			
			System.out.println("What is your choice:");
			i=0;
			while(i<numberOfDishes) {
				System.out.println(menu.getDishes().get(i)+menu.getPrizes().get(i));
				i++;
			}
			System.out.println("Please, type your choice:(quit to finish)");
			Scanner reader= new Scanner(System.in);
			typed=reader.nextLine();
			
			while(dishchoice<numberOfDishes)
				if(typed.contains("Quit")) break;
				if(typed.contentEquals(menu.getDishes().get(dishchoice))) break;
				dishchoice++;
			}
			if(typed.contains("Quit")) {break;
			}else if(typed.contains("Economichal Menu")) {
				box1=BarCampus.payEconomical(box1,customer,CustomerPositionInArray);
			}else if(typed.contains("Gourmet Menu")) {
				box1=BarCampus.paygourmet(box1,customers);
			}
			
		}

	private int ScanNameInArray(ArrayList<Person> customers) {
		int position=0;
	
		System.out.println("Who are you:");
		Scanner reader=new Scanner(System.in);
		String name=reader.nextLine(); 
		
		while(position<customers.size()) {
			if(name.equals(customers.get(position))) break;
			position++;
		}
		System.out.println("Thanks for your collaboration.");
		return position;
	}

	public CashRegister SetInitialRegisterBox(CashRegister box1) {
		double cash=1000.0;
		
		CashRegister BoxRegister1= new CashRegister(cash,0,0);
		
		return BoxRegister1;
	}
	
	public MenuToChoose ListForChoosing() {
		ArrayList<String> dish=null;
		Collections.addAll(dish,"Economichal Menu","Gourmet Menu");
		ArrayList<Double> prize=null;
		Collections.addAll(prize,2.5,4.0);
		
		MenuToChoose menu=new MenuToChoose(dish,prize);
		return menu;
	}

	public void SetMoneyToBuy(){
		
	}
	*/
	

}
