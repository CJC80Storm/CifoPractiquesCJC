package itemToSearch;

public class Book {
	String name;
	String author;
	int id;
	
	public Book(String name,String author,int id) {
		this.author=author;
		this.name=name;
		this.id=id;
	}
	public Book(int id) {
		this.author=author;
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return ("The book with ID: "+id);
	}

}
