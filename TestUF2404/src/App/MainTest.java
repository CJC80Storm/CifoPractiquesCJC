package App;

import java.util.ArrayList;
import basic.Book;
import basicList.Author;
import menu.Menu;

public class MainTest {


	public static void main(String[] args) {
	
		String Name="Test2404";
		ArrayList<Author> db=Menu.setDataBase();
	
		
		
		
		Menu.setmenu(db);
		
		//System.out.println("The books of "+author1.getName()+"are: "+author1.getBooks());
		//System.out.println("The books of "+author2.getName()+"are: "+author2.getBooks());
		//System.out.println("The books of "+author3.getName()+"are: "+author3.getBooks());					
		
		System.out.println("See you in the bookshop!");
	}


}

