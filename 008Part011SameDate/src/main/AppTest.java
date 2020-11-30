package main;

import dates.SimpleDate;

public class AppTest {

	public static void main(String[] args) {
		SimpleDate d = new SimpleDate(1, 2, 2000);
		System.out.println(d.equals("heh"));
		System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
		SimpleDate e = new SimpleDate(1, 2, 2000);
		System.out.println(d.equals(e));
	}
}
