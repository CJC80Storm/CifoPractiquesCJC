package programDB;

public class Book {
	String title;
	int year;
	String content;
	
	public Book(String title,int year,String content) {
		this.title=title;
		this.year=year;
		this.content=content;
	}
	
	public Book(String title,int year) {
		this.title=title;
		this.year=year;
		this.content="...";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return("Title: "+title+", Year: "+year);
	}
	
}
