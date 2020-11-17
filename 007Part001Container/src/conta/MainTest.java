package conta;

import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {
		int nivel;
		Scanner reader=new Scanner(System.in);
		
		Container container=new Container();
		
		System.out.println(container);

		container.add(50);
		System.out.println(container);
		System.out.println(container.contains());

		container.remove(60);
		System.out.println(container);

		container.add(200);
		System.out.println(container);
		
		
		
		
	}
	

}
