package practica03;

public class E044_least {
	
	public static void least(int number1, int number2) { 

	// write program code here 
	// do not print anything inside the method 
	// method needs a return in the end
	} 

	public static void main(String[] args) { 

	int answer = leastInt(2, 7); 

	System.out.println("least: " + answer); 

	}

	private static int leastInt(int j, int k){
		int answer2;
		if(j>k) {
			answer2 = k;
		} else {
			answer2 = j;
					}
		return (answer2);
	}
	
	

}
