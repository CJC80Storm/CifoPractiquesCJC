package dataBase;

import java.util.ArrayList;

public class Numbers {
	String name;
	ArrayList<Integer> numbers =new ArrayList<Integer>();
	
	public Numbers(String name,ArrayList<Integer> numbers) {
		this.name=name;
		this.numbers=numbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
	
}
