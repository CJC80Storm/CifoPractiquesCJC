package people;

public class Teacher extends Person {
	int salary;
	
	public Teacher(String name,String adress,int salary) {
		super (name,adress);
		this.salary=salary;
	}

	@Override
	public String toString() {
		return this.name+"\n"+this.adress+"\n"+this.salary;
	}
	
	
	

}
