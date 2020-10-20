import java.util.Scanner;

public class BarCampus {
	public static void main(String[] args) {
		double cash;
	
		System.out.println("Introduce balance: (in €, Euros)");
		Scanner money= new Scanner(System.in);
		cash= money.nextDouble();
		LyyraCard cardPerson = new LyyraCard (cash);
		//CashRegister register1 = new CashRegister ((CashRegister).balance);
		//CashRegister.CashRegister();



		}

}
