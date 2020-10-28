package App;

import java.util.ArrayList;
import basicList.Author;
import menu.Menu;

public class MainTest {


	public static void main(String[] args) {
	
		String Name="Test2404";
		ArrayList<Author> db=Menu.setDataBaseInitial();
		
	
				
		Menu.setmenu(db);
		

		System.out.println("See you in the bookshop!");
	}


}

