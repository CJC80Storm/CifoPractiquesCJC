package menu;

import java.util.Scanner;

import packBasic.Container;

public class Operations {
	
	public static void menuOperations(Container firstContainer, Container secondContainer, Scanner reader) {
		
		while(true) {
			System.out.println(firstContainer.toString());
			System.out.println(secondContainer.toString());
			System.out.println("[Add1-'quantity']:to add at 1st Container, type quantity as integer.");
			System.out.println("[Add2-'quantity']:to add at 2nd, type quantity as integer.");
			System.out.println("[move-'quantity'] :to move of 1st to 2nd, type quantity as integer.");
			System.out.println("[remove1-'quantity']: to remove at 1st Container, type quantity as integer."); 
			System.out.println("[remove2-'quantity'] to remove at 2nd Container, type quantity as integer."); 
			System.out.print("Type your choice: ");
			
			String type=reader.next();
			String[] parts= type.split("-");
			String typed=parts[0].toLowerCase(); 
			int i=Integer.valueOf(parts[1]);
							
			if(typed.contains("add1")) {
				firstContainer.add(i);
			} else if(typed.contains("add2")) {
				secondContainer.add(i);
			}else if(typed.contains("move")){
				move1to2( firstContainer, secondContainer, i);	
			} else if(typed.contains("remove1")){
				firstContainer.remove(i);
			}else if(typed.contains("remove2")){
				secondContainer.remove(i);
			} else if(typed.contains("quit"))break;
		
		}
		
		
		
	}
	
	
	public static void move1to2(Container firstContainer, Container secondContainer, int toMove) {
		firstContainer.remove(toMove);
		secondContainer.add(toMove);
	}
}
