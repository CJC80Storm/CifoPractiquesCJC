package practica03;
import java.util.ArrayList;


public class E045_greater {
			
	public static void main(String[] args) {
		int answer =  greatest(2, 7, 3);
		System.out.println("Greatest: " + answer);
	}
			
	public static int greatest(int number1, int number2, int number3) {
		ArrayList<Integer> listNumber= new ArrayList<Integer>();
		listNumber.add(number1);
		listNumber.add(number2);
		listNumber.add(number3);
	
		for (int m = listNumber.size(); m >= 0; m--) {
			for (int i=0; i<listNumber.size()-1;i++){
				
				int k=i+1; 
				if(listNumber.get(i) > listNumber.get(k)){
					swap(i,k,listNumber);
				}
			
				if(i<listNumber.size()) {
					i=listNumber.size()-1;
				}
			}
		}  	
		return (listNumber.get(listNumber.size()));		
	}
			
	private static void swap(int j, int b, ArrayList<Integer> n) {
		int X = n.get(j);
		n.set(j, n.get(b));
		n.set(b, X);
		}
		
		 
} 			

