

public class Accounts {
	
	public static void main(String[] args) {
		Account account001 = new Account("Pepito Perez",1000.31);
		Account account002 = new Account("Jaimito Perez",-20.35);
		Account account003 = new Account("Juanito Perez",1368.50);
		Account account004 = new Account("Jai",20.35);
		Account creditbank = new Account ("Credit Bank",10000000);
		
		System.out.println("Condiciones Iniciales:");
		System.out.println(account001.toString());
		System.out.println(account002.toString());
		System.out.println(account003.toString());
		System.out.println(creditbank.toString());
		
		transfer(account001,account002,100.00);
		personalCredit(account003,15000);
		yourMethod(account001);
		yourMethod(account002);
		yourMethod(account004);
	}

	public static void transfer(Object from, Object to,double i) {
		((Account)from).withdrawal(i);
		((Account)to).deposit(i);
	}

	public static void personalCredit  (Object to, double i) {		
		((Account)to).deposit(i);
		String b = ((Account)to).owner;
		System.out.println(b+" must return "+(i*1.1)+"€ in 3 years, at reason of "+((i*1.1)/36)+"per month.");
	}

	public static void yourMethod (Object a1) {
		String a =((Account)a1).owner;
		int password =0;
				System.out.println(a);
		for(int i=0;i<6;i++) {
			int numNombre = a.length()-i;
			password = password +(int) Math.pow(10, i)*numNombre;
		}
		if (password<0) {
			password=-password;
		}
		while (true) {
			if(password>10000) {
				password=password/3;
			} else break;
		}	
		System.out.println("The password of "+((Account)a1).owner+" is: "+password);
		
	}

}
