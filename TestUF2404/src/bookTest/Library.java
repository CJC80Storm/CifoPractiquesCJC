package bookTest;

import java.util.ArrayList;

public class Library {
	String Name="libraryDB";
	ArrayList<Author> AuthorDB;
	
	public Library (String Name, ArrayList<Author> AuthorDB) {
		this.Name=Name;
		this.AuthorDB=AuthorDB;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ArrayList<Author> getAuthorDB() {
		return AuthorDB;
	}

	public void setAuthorDB(ArrayList<Author> authorDB) {
		AuthorDB = authorDB;
	}
	
	
	
}
