package mainTest;

import java.util.HashMap;
import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
		Scanner reader= new Scanner(System.in);
		HashMap<String, String> nickNameList =new HashMap<>();
		
		fillName(nickNameList);
		
		System.out.println("What's Matthew's nickname?");
		System.out.println("His Nickname is: "+nickNameList.get("matthew"));
		
	}

	private static void fillName(HashMap<String, String> nickNameList) {
				
		nickNameList.put("matthew", "Matt");
		nickNameList.put("michael","mix");
		nickNameList.put("arthur","artie");
		
		
	}
	

}
