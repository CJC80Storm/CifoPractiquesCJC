
public class CashRegister {
	public static double cashInRegister;   // the amount of cash in the register
	public int economicalSold;   // the amount of economical lunches sold
	public int gourmetSold;       // the amount of gourmet lunches sold



	private static void CashRegister() {
	CashRegister.cashInRegister=1000;
	System.out.print(cashInRegister);// at start the register has 1000 euros
	}

	public CashRegister (double cashInRegister,int economicalSold,int gourmetSold) {
	this.cashInRegister=0;
	this.economicalSold=0;
	this.gourmetSold=0;
	}

	public CashRegister() {
	cashInRegister=1000;
	economicalSold=0;
	gourmetSold=0;


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
}
