package sorting;

public class MainProgram {
	
	public static void main (String[] args) {
		int[] numbers = {6, 5, 8, 7, 11};
		 int result=smallest(numbers);
		 int result2=indexOfSmallestFrom(numbers);
		 if(result>=0) {
			 System.out.println("Smallest: "+numbers[result]);
			 System.out.print("Index of the smallest number: "+result);
		 }else {
			 System.out.print("Error System");
		 }
	}

	private static int indexOfSmallestFrom(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int smallest(int[] numbers) {
		int j=numbers.length-1;
		int helper=0;
		
		for( j=numbers.length-1;j>0;j--){
							
			if (numbers[j]<numbers[j-1]) {
				if(numbers[j]<numbers[helper]){
				helper=j;
				}
				
			}
			
		}
		return helper;
	}
}
