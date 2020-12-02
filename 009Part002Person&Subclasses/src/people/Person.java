package people;

public class Person {
	String name;
	String adress;
	public Person(String name,String adress) {
		this.adress=adress;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return this.name+"\n"+this.adress;
	}
	
	

}
