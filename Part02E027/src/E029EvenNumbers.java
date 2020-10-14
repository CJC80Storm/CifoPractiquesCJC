import java.util.Scanner;

public class E029EvenNumbers {

	public static void main (String[] args) {
		System.out.println("Introduce min value:"); //note: for 29: i=2, j=100, delta=2
		Scanner i = new Scanner (System.in); 
		int Min = i.nextInt();
		
		System.out.println("Introduce max value:");//note: added for Exercise 31 
		Scanner j = new Scanner (System.in); 
		int Max = j.nextInt();
		
		System.out.println("Introduce Incremtation value:"); //note: added for Exercise 30 
		Scanner k = new Scanner (System.in); 
		int Delta = k.nextInt();
		
		Even2 (Min, Max, Delta);
		
		System.out.println (" ");
		System.out.println ("Finish!!");		
	}

	private static void Even2(int Min, int Max, int Delta) {
		// TODO Auto-generated method stub
		while (Min<Max) {
			System.out.print (Min + " ");
			Min = Min + Delta;
		}
	}
}
