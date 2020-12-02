package mainTest;

import stores.StorageFacitlity;

public class App {

	public static void main(String[] args) {
		StorageFacitlity facility = new StorageFacitlity();
		facility.add("a14", "ice skates");
		facility.add("a14", "ice hockey stick");
		facility.add("a14", "ice skates");

		facility.add("f156", "rollerblades");
		facility.add("f156", "rollerblades");

		facility.add("g63", "six");
		facility.add("g63", "pi");

		System.out.println(facility.contents("a14"));
		System.out.println(facility.contents("f156"));
		
		
		
		facility.remove("f156", "rollerblades");

		System.out.println(facility.contents("f156"));

		facility.remove("f156", "rollerblades");

		System.out.println(facility.storageUnits());
	}
	
	
}
