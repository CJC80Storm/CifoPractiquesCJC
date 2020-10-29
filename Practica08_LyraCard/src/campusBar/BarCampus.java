package campusBar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import menuOptions.MenuToChoose;
import modelCard.LyyraCard;
import person.Person;

public class BarCampus {
	ArrayList<Person> persons=new ArrayList<Person>();
	CashRegister barAttendant;

	public BarCampus (ArrayList<Person> persons,CashRegister barAttendant){
		this.persons=persons;
		this.barAttendant=barAttendant;
	}


	/*System.out.println("Introduce balance: (in €,)");
	Scanner money= new Scanner(System.in);
	cash= money.nextDouble();
	CashRegister).balance);
	//CashRegister.CashRegister();
	*/


	//return persons;
	
	public double CashInRegister() {
		CashRegister.cashInBox=1000.00;
		return CashRegister.cashInBox;
	}

	public double payEconomical(double cashGiven) {
	   double ecoMenu=2.50;
	   
	   if(cashGiven>=ecoMenu) {
				   return cashGiven-ecoMenu;
	   }else {
	   		System.out.println("Sorry, there is not enoff.");
	   		return cashGiven;
	   }
	       // the price of the economical lunch is 2.50 euros
	       // if the given cash is at least the price of the lunch:
	       //    the price of lunch is added to register
	       //    the amount of the sold lunches is incremented by one
	       //    the method returns cashGiven - lunch price
	       // if not enough money is given, all is returned and nothing else happens
	}

/*
	public double payGourmet(double cashGiven) {
	   double luxMenu=4.00;
	   if(cashGiven>=luxMenu) {
		   this.gourmetSold=this.gourmetSold+1;
		   return cashGiven-luxMenu;
	   }else{
		   System.out.println("Sorry, there is not enoff.");
		   return cashGiven;
	   }
	}  
	// the price of the gourmet lunch is 4.00 euros
	       // if the given cash is at least the price of the lunch:
	       //    the price of lunch is added to the register
	       //    the amount of the sold lunches is incremented by one
	       //    the method returns cashGiven - lunch price
	       // if not enough money is given, all is returned and nothing else happen

	public boolean payEconomical(LyyraCard card) {
	double ecoMenu=2.50;
	   if(card.balance>=ecoMenu) {
		   card.balance=card.balance-ecoMenu;
		   economicalSold=economicalSold+1;
		   return true;
	   }else {
		   System.out.println("Sorry, there is not enoff.");
		   return false;
	   }

	// the price of the economical lunch is 2.50 euros
	       // if the balance of the card is at least the price of the lunch:
	       //    the amount of sold lunches is incremented by one
	       //    the method returns true
	       // if not, the method returns false
	}

	   
	public boolean payGourmet(LyyraCard card) {
	double ecoMenu=2.50;
	   if(card.balance>=ecoMenu) {
		   double b= card.balance;
	    	card.balance=b-ecoMenu;
	    	economicalSold=economicalSold+1;
	    	return true;
	   }else {
		   System.out.println("Sorry, there is not enoff.");
		   return false;
	   }

	// the price of the gourmet lunch is 4.00 euros
	       // if the balance of the card is at least the price of the lunch:
	       //    the amount of sold lunches is incremented by one
	       //    the method returns true
	       // if not, the method returns false
	}


	public void loadMoneyToCard(LyyraCard card, double sum) {
		
	}

	public String toString() {
		return "money in register ";//+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	}


	public static CashRegister payEconomical(CashRegister box1, ArrayList<Person> customers) {
		// TODO Auto-generated method stub
		return null;
	}
*/

}


	
	

