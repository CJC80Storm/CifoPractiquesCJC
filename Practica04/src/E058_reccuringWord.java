import java.util.ArrayList;
import java.util.Scanner;

public class E058_reccuringWord {
	
	public static void main (String[] args) {
	
		ArrayList<String> words = new ArrayList<String>();
		for(int i=0; i<4;i++){
			System.out.print("Type a word: ");
			words.add(Contains());
		}
		System.out.print("The size of the List is:");
		System.out.println(words.size());
		words.remove(0);
		System.out.println(" ");
		System.out.println("If the first element is deleted:");
		System.out.print("The size of the List is:");
		System.out.println(words.size());
		System.out.print("And the Elements are:");
		System.out.println(words);
	}
	public static String Contains(){
		Scanner name =  new Scanner(System.in);
		String a = name.nextLine();
		return(a);
		
	}
}
