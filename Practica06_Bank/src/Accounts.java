

public class Accounts {
	
	public static void main(String[] args) {
		Account account001 = new Account("Pepito Perez",1000.31);
		Account account002 = new Account("Jaimito Perez",-20.35);
		Account account003 = new Account("Juanito Perez",1368.50);
		Account creditbank = new Account ("Credit Bank",10000000);
		
		System.out.println("Condiciones Iniciales:");
		System.out.println(account001.toString());
		System.out.println(account002.toString());
		System.out.println(account003.toString());
		System.out.println(creditbank.toString());
		
		transfer(account001,account002,100.00);
		
		
		
	}

	private static void transfer(Object withdrawal, Object deposit,double i) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	public static void personalCredit  () {			
		
		
		
	}


	public static void yourMethod () {
		
	}


}
