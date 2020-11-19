package menu;

import java.util.ArrayList;
import java.util.Scanner;

import itemToSearch.Book;

public class ChoicesHelp {
	
	
	public static void fillArray(ArrayList<Book> books, Scanner reader) {
		books.add(new Book(101));
		books.add(new Book(102));
		books.add(new Book(103));
		books.add(new Book("pepito grillo", "luciernagas", 104));
		books.add(new Book(106));
	}

	public static int linearSearch(ArrayList<Book> books, int typeInt) {
		for(Book book: books) {
			if(book.getId()==typeInt) {
				return books.lastIndexOf(book);
			}
		}
		/*int index=0;
		while(index<books.size()) {
			if(books.get(index).getId()==typeInt) {
				break;
			}
			index++;
		}
		*/
		return -1;
	}
	
	public static int binarySearch(ArrayList<Book> books, int typeInt) {
		int begin=0; // the 0th index of the list (i.e, the first index of the list)
		int end=books.size()-1; // the last index in the list
		int middle=(end+begin)/2;
		
		for(int index1=middle;index1<=middle;index1--) {
			if(books.get(index1).getId()==typeInt) {
				if(index1==middle) {
					return middle;
				} else {
					return index1;
				}
			}else if(index1==0) {
				for(int index2=middle+1;index2<=end;index1--) {
					if(books.get(index2).getId()==typeInt) {
						return index2;
					}
				}
			}
		}
		return -1;
	}
	
}


