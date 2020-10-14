import java.util.Scanner;

public class SumSet {
	public static void main (String[] args){
		int SumTot = 0;
		while(true){
			System.out.println ("Until what number do you require?");
			Scanner S = new Scanner (System.in);
			int E = S.nextInt();
			
			Sumafacto (E, SumTot);
		}
		
	}



	private static void Sumafacto(int E, int SumTot) {
		// TODO Auto-generated method stub
		while (E > 0) {
			SumTot = E + SumTot;
			E = E - 1;
		}
		System.out.println ("The result is:" + SumTot);
	}
}