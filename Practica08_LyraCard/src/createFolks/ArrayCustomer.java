package createFolks;

import person.Person;
import modelCard.LyyraCard;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayCustomer {

	public static ArrayList<Person> SetMoneyToBuy() {
		LyyraCard card1= new LyyraCard(20.0);
		LyyraCard card2=new LyyraCard(3.0);
		LyyraCard card3=new LyyraCard(2.0);
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Juanito","Perez",123,195,32,card1,6.0));
		persons.add(new Person("Jim","Cortes",75,180,23,card2,2.0));
		persons.add(new Person("Pekka","Smith",60,175,18,card3,4.0));
				
		return persons;
	}
	
}
