import java.util.Scanner;

public class E04_Length {
	
	public static void main (String[] arg) {
		while(true) {
		System.out.println("Introduce name('Quit' to End):");
		
		Scanner i = new Scanner(System.in);
		String A = i.nextLine();
		
		if (A=="Quit") break;
		
		System.out.println("This word has : " +A.length());
		}
		System.out.println("End");
	}
}
