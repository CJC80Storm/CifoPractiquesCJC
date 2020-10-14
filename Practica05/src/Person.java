
public class Person {
	
	private String firstName;
	private String lastName;
	//private int birthDay;
	//private int birthMonth;
	//private int birthYear;
	private int age;
	private int weight;
	private int height;
		
	public Person (String firstName, String lastName, int age, int weight, int height) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	public void isAdult() {
		// TODO Auto-generated method stub
		if(this.age>17){
			System.out.println(this.firstName+" "+this.lastName+" is an Adult.");
		} else {
			System.out.println(this.firstName+" "+this.lastName+" is not an Adult. He/she needs to grow up.");
		}	
	}
	public void printPerson(Person person1) {
		System.out.println(person1.firstName+" "+person1.lastName+", "+person1.age+", es alegre.");
		System.out.println(" ");
	}
	public void printPerson( ) {
		System.out.println(this.firstName+" "+this.lastName+", "+this.age+".");
	}
	
	public void becomeOlder(Person person1) {
		person1.age=person1.age+1;
	}
	
	public double bodyMassIndex(Person person1) {
		double Index = (double)person1.weight / (double)person1.height;
		return Index;
	}
	
	public String toString (Person person1) {
		
		String a=person1.firstName+" "+person1.lastName;
		System.out.println(a);
		return a;
		
	}
	public void becomeOlder() {
		this.age=this.age+3;
	}
}
