import java.util.Scanner;

public class LyyraCard {
	public double balance;

	public LyyraCard(double balance) {
	Scanner amountcard = new Scanner(System.in);
	this.balance= amountcard.nextDouble();
	    }

	    public double totalBalance() {
	        return this.balance;
	    }

	    public void loadMoney(double amount) {
	        double b=this.balance;
	        this.balance= b-amount;
	    }

	    public boolean pay(double amount){
	       // the method checks if the balance of the card is at least the amount given as parameter if not, the method returns false meaning that the card could not be used for the payment if the balance is enough, the given amount is taken from the balance and true is returned
	    double a=amount;
	    if(this.balance>=a){
	    return true;
	    }else {
	    return false;
	    }
	    }
}
