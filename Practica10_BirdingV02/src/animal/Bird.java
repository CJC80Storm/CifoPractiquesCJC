package animal;

import people.Person;

public class Bird {
	String name;
	String nameLatin;
	Person whoSee1stTime;
	int numberOfTimesSeen;
	
	public Bird(String name,String nameLatin,Person whoSee1stTime, int numberOfTimesSeen) {
	 	this.name=name;
		this.nameLatin=nameLatin;
		this.numberOfTimesSeen=numberOfTimesSeen;
		this.whoSee1stTime=whoSee1stTime;
	}

	public Bird(String name2, String nameLatin2, int numberOfTimesSeen) {
		this.name=name;
		this.nameLatin=nameLatin;
		this.numberOfTimesSeen=numberOfTimesSeen;
		this.whoSee1stTime=whoSee1stTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLatin() {
		return nameLatin;
	}

	public void setNameLatin(String nameLatin) {
		this.nameLatin = nameLatin;
	}

	public Person getWhoSee1stTime() {
		return whoSee1stTime;
	}

	public void setWhoSee1stTime(Person whoSee1stTime) {
		this.whoSee1stTime = whoSee1stTime;
	}

	public int getNumberOfTimesSeen() {
		return numberOfTimesSeen;
	}

	public void setNumberOfTimesSeen(int numberOfTimesSeen) {
		this.numberOfTimesSeen = numberOfTimesSeen;
	}
}
