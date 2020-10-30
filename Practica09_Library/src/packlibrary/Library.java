package packlibrary;
import java.util.ArrayList;

public class Library {
	int i=0;
	String Name;
	
	ArrayList<Book> library = new ArrayList<Book>();
	
	//Constructor
	public Library(ArrayList<Book>library,String Name) {
		this.library=library;
		this.Name=Name;
	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public ArrayList<Book> getLibrary() {
		return library;
	}


	public void setLibrary(ArrayList<Book> library) {
		this.library = library;
	}



	
	public static ArrayList<Book> addBook (ArrayList<Book> library, Book bookToAdd) {
		library.add(bookToAdd);
		return library;
	}
	
	public static int searchOnLibrary(String searchedTitle,ArrayList<Book> library) {
		System.out.println(" The books of opur library than contains "+searchedTitle+" are:");
		int i=0;
		int counter=0;
		
		while(i<(library.size())) {
			if (library.get(i).getTitle().contains(searchedTitle)) {
				counter=1;
				break;
				}else {
				i++;
			}
		}
		if(counter==0) {
			i=i+1;
		} 
		return i;
	}
	
}
