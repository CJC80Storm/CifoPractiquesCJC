package person;

import java.util.ArrayList;

import modelCard.LyyraCard;

public class Person {
	String firstName;
	String lastName;
	int weight;
	int height;
	int age;
	LyyraCard bankCard;
	double cash; 

	public Person(String firstName, String lastName, int weight, int height, int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.weight=weight;
		this.height=height;
		this.age=age;
		this.bankCard=bankCard;
		this.cash=cash;
	}
	//
	public Person() {
		this.firstName=firstName;
		this.lastName=lastName;
		this.weight=weight;
		this.height=height;
		this.age=age;
		this.bankCard=bankCard;
		this.cash=cash;
	}

	public LyyraCard getBankCard() {
		return bankCard;
	}
	public void setBankCard(LyyraCard bankCard) {
		this.bankCard = bankCard;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
