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

	public static double getCashInBox() {
		return cashInBox;
	}

	public static void setCashInBox(double cashInBox) {
		CashRegister.cashInBox = cashInBox;
	}

	public int getEconomicalSold() {
		return economicalSold;
	}

	public void setEconomicalSold(int economicalSold) {
		this.economicalSold = economicalSold;
	}

	public int getGourmetSold() {
		return gourmetSold;
	}

	public void setGourmetSold(int gourmetSold) {
		this.gourmetSold = gourmetSold;
	}

	public double getCardGot() {
		return cardGot;
	}

	public void setCardGot(double cardGot) {
		this.cardGot = cardGot;
	}

}




