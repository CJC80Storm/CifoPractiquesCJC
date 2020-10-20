import java.util.ArrayList;

public class Library {
	int i=0;
	
	ArrayList<Book> library = new ArrayList<Book>();
		
	public static int baseConditions (int counter) {
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		counter++;
		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
		counter++;
		return counter;
	}
	
	public void add (Book bookAdded) {
		this.library.add(bookAdded);
	}

	public void searchOnLibrary(String searchedTitle) {
		System.out.println(" The books of opur library than contains "+searchedTitle+" are:");
		int counter=0;
		for(int i=0;i<=(library.size()-1);i++) {
			if(library.contains(searchedTitle)) {
				//System.out.println(Book.getTitle());
				counter++;
			}
		}
		System.out.println("There are "+counter+"book than contains:"+searchedTitle+".");
	}
	
}
