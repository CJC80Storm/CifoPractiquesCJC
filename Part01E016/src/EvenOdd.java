import java.util.Scanner;

public class EvenOdd {

public static void main (String[] args) {
	
	while (true) {
		System.out.println("What number do you want to analize?");
		Scanner k = new Scanner (System.in);
		int EvenOff = k.nextInt();
		if ( EvenOff % 2 == 0) {
			System.out.println("Number "+EvenOff+" is even.");
		} else {
			System.out.println("Number "+EvenOff+" is odd.");	
		}
		System.out.println("Do you want to continue? (y/n)");
		String command = k.nextLine();
		String command2 = k.nextLine();
		
		if (command2.equals("n")) break;
		}	System.out.println ("End");
	}
}
