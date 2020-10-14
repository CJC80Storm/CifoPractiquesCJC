import java.util.Scanner;

public class Circumference {
	public static void main (String[] args) {
		Scanner readers = new Scanner (System.in);
		int radius = readers.nextInt();
		double Pi = Math.PI;
		double Circle = 2 * Pi * radius;
		System.out.println ( "La circunferencia es:" + Circle );
	}
}
