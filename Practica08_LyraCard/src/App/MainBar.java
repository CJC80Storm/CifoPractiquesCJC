package App;

import java.util.ArrayList;

import campusBar.CashRegister;
import person.Person;
import menuApp.Operations;
import person.Person;
import createFolks.ArrayCustomer;

public class MainBar {
	
	public static void main (String[] args) {
		
		ArrayList<Person> customers= new ArrayList<Person>();
		customers=ArrayCustomer.SetMoneyToBuy();
		
		Operations.setOperations1(customers);
				
			
		System.out.println("Thanks for your buying our Menus!");
	}

}
