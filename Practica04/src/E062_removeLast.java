import java.util.ArrayList;
import java.util.Collections;

public class E062_removeLast {

	public static void main (String[] args) {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick"); 
		brothers.add("Henry"); 
		brothers.add("Michael"); 
		brothers.add("Bob"); 
		
		System.out.print("Brothers:");
		//System.out.print(brothers); //Comprobación
		//brothers.sort(null);
		brothers.sort(null);
		Collections.sort(brothers);
		System.out.print(brothers); //En Orden
		removeLast(brothers);
		System.out.print(brothers); //Eliminando al último.

	}

	private static void removeLast(ArrayList<String> brothers) {
		// TODO Auto-generated method stub
		brothers.remove(brothers.size()-1);
		
	}
	
	
}
