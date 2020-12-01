package mainTest;

import java.util.ArrayList;
import java.util.HashMap;

import plateDB.LicensePlate;

public class AppTest {
	public static void main(String[] args) {
	    // the following is the same sample program shown in ex 8.13 description

	        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
	        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
	        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

	        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
	        finnishPlates.add(li1);
	        finnishPlates.add(li2);

	        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
	        System.out.println(finnishPlates.contains(newLi));
	        if (!finnishPlates.contains(newLi)) {
	            finnishPlates.add(newLi);
	            
	            System.out.println(!finnishPlates.contains(newLi));
	        }
	        
	        System.out.println("finnish: " + finnishPlates);
	        // if the equals-method hasn't been overwritten, the same license number will be added to the list again

	        HashMap<LicensePlate, String> owners = new HashMap<>();
	        owners.put(li1, "Arto");
	        owners.put(li3, "Jürgen");

	        System.out.println("Owners:");
	        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
	        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
	        // if the hasCode-method hasn't been overwritten, the owners won't be found
	}
	
	
}
