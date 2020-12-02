package mainTest;

import java.util.ArrayList;

import people.Person;
import people.Student;
import people.Teacher;

public class App {

	public static void main (String[] args) {
		Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
		Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
		System.out.println(ada);
		System.out.println(esko);
		System.out.println(" ");
		
		Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
		System.out.println(ollie);
		System.out.println("Study credits " + ollie.credits());
		ollie.study();
		System.out.println("Study credits "+ ollie.credits());
		System.out.println(" ");
		
		Teacher adaTeacher = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
		Teacher eskoTeacher = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
		System.out.println(adaTeacher);
		System.out.println(eskoTeacher);
		System.out.println(" ");
	
		int counter=0;
		
		while(counter<24) {
			ollie.study();
			if (counter==25)break;
			counter++;
		}
		System.out.println(ollie);
		System.out.println(" ");
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
	    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
	    printPersons(persons);
		
		
	}

	private static void printPersons(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		for(Person personSingle: persons)
		System.out.println(personSingle);
		
	}
}

