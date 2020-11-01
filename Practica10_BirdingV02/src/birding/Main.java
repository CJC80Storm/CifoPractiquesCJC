package birding;

import menu.MenuOptions;

public class Main {
	public static void main(String[] args) {
		int actionCounter=0;
		
		actionCounter=MenuOptions.choiceOption(actionCounter);
			 
		System.out.println("This time was done "+actionCounter+" actions.");
		System.out.println("See you in the sky!!");
	    
	        
	    }

}
