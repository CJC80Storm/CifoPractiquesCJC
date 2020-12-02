package people;

public class Student extends Person {
	int credits=0;
	
	public Student(String Name,String Adress) {
		super(Name, Adress);
		this.credits=0;
	}
	
	public int study() {
		
		return this.credits=this.credits+1;
	}

	public int credits() {
		return this.credits;
	}
	
	public String toString() {
		return this.name+"\n"+this.adress+"\n"+this.credits;
	}

}
