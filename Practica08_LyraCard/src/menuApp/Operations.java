package menuApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import campusBar.CashRegister;
import createFolks.ArrayCustomer;
import menuOptions.MenuToChoose;
import modelCard.LyyraCard;
import person.Person;
import menuOptions.MenuToChoose;

public class Operations {

	public static void setOperations1(ArrayList<Person> customers) {
		CashRegister box1 = new CashRegister(0.0, 0, 0);
		
		MenuToChoose menu= new MenuToChoose();
		menu=ListForChoosing();
		int i;
		int dishchoice;
		int numberOfDishes=menu.getDishes().size();
		int CustomerPositionInArray;
		String typed;
		boolean enoffMoneyCard;
		boolean enoffMoneyCash;
		
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
						
			if(typed.contains("Quit")) break;
			if(typed.contains("Economichal Menu")) {
				String wayToPay=waytoPay();
				if(wayToPay.equals("Card")) {
					enoffMoneyCard=checkEconomicalCard(customers.get(CustomerPositionInArray).getBankCard().balance);
					if(enoffMoneyCard==true) {
						customers.get(CustomerPositionInArray).getBankCard().balance=customers.get(CustomerPositionInArray).getBankCard().balance-2.50;
						System.out.println("Thanks for your purchase. Enjoy your meal!");
						box1.economicalSold++;
					} else {
						System.out.println("try by cash, please.");
					}
				}else if(wayToPay.equals("Cash")) {
					enoffMoneyCash=checkEconomicalCash(customers.get(CustomerPositionInArray).getCash());
					if(enoffMoneyCash==true) {
						double x=customers.get(CustomerPositionInArray).getCash();
						customers.get(CustomerPositionInArray).setCash(x-2.50);
						System.out.println("Thanks for your purchase. Enjoy your meal!");
						box1.economicalSold++;
					} else {
						System.out.println("try by card, please.");
					}
				}	
			}else if(typed.contains("Gourmet Menu")) {
				String wayToPay=waytoPay();
				if(wayToPay.equals("Card")) {
					enoffMoneyCard=checkGourmetCard(customers.get(CustomerPositionInArray).getBankCard().balance);
					if(enoffMoneyCard==true) {
						customers.get(CustomerPositionInArray).getBankCard().balance=customers.get(CustomerPositionInArray).getBankCard().balance-4.00;
						System.out.println("Thanks for your purchase. Enjoy your meal!");
						box1.gourmetSold++;
					} else {
						System.out.println("try by cash, please.");
					}
				}
				else if(wayToPay.equals("Card")) {
					enoffMoneyCash=checkGourmetCash(customers.get(CustomerPositionInArray).getCash());
					if(enoffMoneyCash==true) {
					customers.get(CustomerPositionInArray).setCash(customers.get(CustomerPositionInArray).getCash()-4.00);
						System.out.println("Thanks for your purchase. Enjoy your meal!");
						box1.gourmetSold++;
					} else {
						System.out.println("try by card, please.");
					}				
				}
			}
		}
		
		checkingCustomers(customers);			
		System.out.println("The final balance in cash is "+box1.getCardGot()+" €uros");
		System.out.println("The restaurant sold "+box1.gourmetSold+" Gourmet Menu.");
		System.out.println("The restaurant sold "+box1.economicalSold+" Economichal Menu.");
	}
						
	private static boolean checkGourmetCash(double cash) {
		double gouMenu=4.00;
		   if(cash>=gouMenu) {
			   return true;
		   }else {
			   System.out.println("Sorry, there is not enoff cash.");
			   return false;
		   }
	}

	public static String waytoPay() {
		System.out.println("How do you want to pay? Please Type 'cash' or 'card'.");
		Scanner reader= new Scanner(System.in);
		String typed= reader.nextLine();
		return typed;
	}

	public static boolean checkEconomicalCash(double cash) {
		double ecoMenu=2.50;
		   if(cash>=ecoMenu) {
			   return true;
		   }else {
			   System.out.println("Sorry, there is not enoff cash.");
			   return false;
		   }
	}

	public static void checkingCustomers(ArrayList<Person> customers) {
		System.out.println("Do you want to check the money of the customers?(Yes/No)");
		Scanner reader=new Scanner(System.in);
		String typed=reader.nextLine();
		int index=customers.size();
		int i=0;
		if(typed.equals("Yes")) {
			while(i<index){
				System.out.println(customers.get(i).getFirstName()+" has in his Card "+customers.get(i).getBankCard().balance+" Euros and in his/her pocket "+customers.get(i).getCash()+" Euros");
				i++;
			} 
		}
		System.out.println("Thanks for your time.");
	}

	private static int ScanNameInArray(ArrayList<Person> customers) {
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
		
	public static CashRegister SetInitialRegisterBox(CashRegister box1) {
		double cash=1000.0;
		
		CashRegister BoxRegister1= new CashRegister(cash,0,0);
		
		return BoxRegister1;
	}

	public static MenuToChoose ListForChoosing() {
		ArrayList<String> dish=new ArrayList<String>();
		Collections.addAll(dish,"Economichal Menu","Gourmet Menu");
		ArrayList<Double> prize=new ArrayList<Double>();
		Collections.addAll(prize,2.5,4.0);
		
		MenuToChoose menu=new MenuToChoose(dish,prize);
		return menu;
	}
		
	public static boolean checkEconomicalCard(double balance) {
		double ecoMenu=2.50;
		   if(balance>=ecoMenu) {
			   return true;
		   }else {
			   System.out.println("Sorry, there is not enoff money in you card.");
			   return false;
		   }
	}
	
	public static boolean checkGourmetCard(double balance) {
		double gourMenu=4.00;
		   if(balance>=gourMenu) {
			   return true;
		   }else {
			   System.out.println("Sorry, there is not enoff money in you card.");
			   return false;
		   }
	}

	
}
