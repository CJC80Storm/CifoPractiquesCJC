
public class From1to100Alternative {
		
	public static void main (String[] args) {
		int min = 1;
		int max = 100;
		
		printNumbersMin (min, max);
		System.out.println();
		System.out.println();
		
		printNumbersMax (max, min);
		System.out.println();
	}

	private static void printNumbersMax(int max, int min) {
		// TODO Auto-generated method stub
		while(min < max){			
			System.out.print(max);	
			System.out.print(" ");
			max = max - 1;
		}
	}

	private static void printNumbersMin(int min, int max) {
		// TODO Auto-generated method stub
		while(min < max){			
			System.out.print(min);	
			System.out.print(" ");
			min++;
		}
	}
}
