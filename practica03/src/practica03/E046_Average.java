package practica03;

public class E046_Average {
	
	public static double average(int number1, int number2, int number3, int number4) 
	{ // write your code here  
		int Sum=number1+number2+number3+number4;
		double Aver = Sum /4.0;
		return (Aver);
	}
	public static void main(String[] args) { 
		double answer = average(4, 3, 6, 1); 
		System.out.println("average: " + answer); 
	} 
}		
