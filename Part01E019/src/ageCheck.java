import java.util.Scanner;

public class ageCheck {
	public static void main (String[] args) {
		Scanner age = new Scanner(System.in);
		while (true) {
			System.out.println("How old are you?");
			int ageUser = age.nextInt();
			
			if(ageUser >= 0 && ageUser < 121) {
				System.out.println("Ok");
			} else {
				System.out.println("Impossible!");
			}
	}
	}
}
