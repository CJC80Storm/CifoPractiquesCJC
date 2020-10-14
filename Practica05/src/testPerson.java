

public class testPerson {
	public static void main (String[] args) {
		
		Person joan = new Person("Joan","Pedrolo", 24, 89, 180);
		Person maria = new Person("Maria","Pedra", 21, 69, 175);
		Person carlos = new Person("Carlos Daniel","Perez", 17, 89, 159);
		
		joan.printPerson(joan);
		joan.becomeOlder(joan);
		joan.becomeOlder();
		joan.becomeOlder();
		joan.becomeOlder();
		
		carlos.printPerson(joan);
		carlos.printPerson();
	
		joan.isAdult();
		carlos.isAdult();
		carlos.becomeOlder(carlos);
		carlos.isAdult();
	
		double IndexBM = joan.bodyMassIndex(joan);
		String b = joan.toString(joan);
		System.out.println("El indice de masa corporal de "+b+" es : "+IndexBM);
		
		
	
		/*getters() i setters()
		Person() - sobrecarrega de constructor */
	}
}
