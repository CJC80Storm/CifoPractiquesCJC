package appTest;

import java.util.ArrayList;

import model.Quote;

public class App {
	public static void main(String[] args) {
		
		String Name="Test2404";
		ArrayList<Quote> db=Operations.setDataBaseInitial();
		
	
				
		Operations.setmenu(db);
		

		System.out.println("See you in the bookshop!");
	}

}
