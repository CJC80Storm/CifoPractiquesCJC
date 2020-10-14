

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
		personalCredit(account003,15000);
		yourMethod(account001,account002,account003);
		
	}

	public static void transfer(Object from, Object to,double i) {
		/*from.withdrawal(i);
		to.deposit(i);*/
	}

	public static void personalCredit  (Object to, double i) {		
		/*to.deposit(i);
		System.out.Println(to.owner+ "must return "+i+"€ in 3 years, at reason of "+i+1,1/(3*12)+"month");*/
	}

	public static void yourMethod (Object a1, Object a2, Object a3) {
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}
