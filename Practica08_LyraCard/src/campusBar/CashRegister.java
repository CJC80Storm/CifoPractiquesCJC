package campusBar;

import java.util.Scanner;
import modelCard.LyyraCard;

public class CashRegister {
	
	static double cashInBox;   // the amount of cash in the register
	int economicalSold;   // the amount of economical lunches sold
	int gourmetSold;       // the amount of gourmet lunches sold
	double cardGot;

	//constructor
	public CashRegister (double cashInRegister,int economicalSold,int gourmetSold) {
		this.cashInBox=cashInBox;
		this.economicalSold=economicalSold;
		this.gourmetSold=gourmetSold;
		this.cardGot=cardGot;
	}



	/* public CashRegister() {
	cashInRegister=1000;
	economicalSold=0;
	gourmetSold=0;
	}*/


	public void CashInRegister() {
		CashRegister.cashInBox=1000.00;
		
	}



	public double payEconomical(double cashGiven) {
	   double ecoMenu=2.50;
	   if(cashGiven>=ecoMenu) {
		   this.economicalSold=this.economicalSold+1;
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



	public double payGourmet(double cashGiven) {
	   double luxMenu=2.50;
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
		double b= card.balance;
	    card.balance=b+sum;
	}

	public String toString() {
		return "money in register ";//+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	}
}




