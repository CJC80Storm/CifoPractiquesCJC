package packlibrary;
import java.util.ArrayList;


public class Book {
	public String title;
	public String author;
	public int year;

	public Book(String title, String author,int year){
	this.author=author;
	this.title=title;
	this.year=year;
	}
	public static String convertLetter(String word) {
		String abcd ="ABCDEFGHIKLMNOPQRSTVXYZ abcdefghiklmnopqrstvxyz ";
		
		ArrayList<Character> abcCapAMinus= new ArrayList<Character>();
		for(int a=0;a<=abcd.length()-1;a++) {
			abcCapAMinus.add(abcd.charAt(a));
		}
				
		for(int i=0;i<=word.length()-1;i++){
			for(int b=0;b<=((abcCapAMinus.size()-2)/2);b++){
				if (abcCapAMinus.get(b)==word.charAt(i)) {
					b=b+((abcCapAMinus.size()-2)/2);
					word.replace(word.charAt(i),abcCapAMinus.get(b));
					break;
				}
			}
		}
		return word;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
