import java.util.Scanner;

public class AgeMajority {
	public static void main (String[] args) {
		Scanner r = new Scanner(System.in);
		
		while (true) {
			System.out.println("How old are you?");
			int AgeUser = r.nextInt();
			
			if (AgeUser<120 && AgeUser>0) {				
				if (AgeUser < 18){
					System.out.println ("You have not reached the age of majority!");
				} else {
					System.out.println ("You have reached the age of majority!");
				}
				
			} else {	
				System.out.println("Do you want to finish? (y/n)");
				String comman = r.nextLine();
				String comman2 = r.nextLine();
				
				if (comman2.equals("y")) break;
			}
		} 
		
		System.out.println ("End");
	}
}
