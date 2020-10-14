import java.util.Scanner;

public class E069_Palidrome {

	public static void main (String[] args) {
			
		while(true) {
				
			System.out.println("Type a Name: ");
			Scanner line = new Scanner(System.in);
			String NameTyped = line.nextLine();
			
			if (Palidrome(NameTyped)){
				System.out.println("This word is a Palidrome");
			}else {
				System.out.println("This word is not a Palidrome");
			};
			System.out.print("  ");
			System.out.print("In reverse Order: ");
			int j = (NameTyped.length()-1);
			for(int i=j; i>=0; i--) {
				char Answer = Reverse(NameTyped, i);
				System.out.print(Answer);
				
			}
			System.out.println(" ");
		}
	}
	private static boolean Palidrome(String name) {
		boolean a=true; 
		int j=name.length()-1;
		for(int i=j; i>=0;i--){
			if(name.charAt(j-i) == name.charAt(i)){
			a=true;
			}else {
			a=false; 
			break;
			}
		}
		return(a);
	}

	public static char Reverse(String Name, int t) {
		int l=Name.length();	
		char answer = Name.charAt(t);
		return(answer);
	}
}
