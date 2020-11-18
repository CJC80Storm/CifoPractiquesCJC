package containing;

import java.util.Scanner;

import menu.Operations;
import packBasic.Container;

public class ContainTest {
	
	public static void main(String[] args) {
		int nivel;
		Scanner reader=new Scanner(System.in);
		
		
		Container firstContainer=new Container("First");
		Container secondContainer=new Container("Second");
		
		
		Operations.menuOperations(firstContainer, secondContainer, reader);
		
		System.out.println("After operations in each Deposit remains:");
		System.out.println(firstContainer);
		System.out.println( secondContainer);

		System.out.println("thanks for use our deposits");
		
	}
}
