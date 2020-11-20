package main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import dataBase.Numbers;
import menuToHelp.menuOptions;

public class App {

	public static void main(String[] args) throws IOException {
		
		
		Scanner readerFile = new Scanner(Paths.get("listOfNumbers.txt"));
		
		String name="list of Number";
		ArrayList<Integer> numberDbase=new ArrayList<Integer>();
		
		Numbers numberDB=new Numbers(name, numberDbase);
		
		menuOptions.fillNumbers(readerFile,numberDB);
		
		double average=menuOptions.pointAverage(numberDB);
		double passing=menuOptions.pointPassing(numberDB);
		double percentage=menuOptions.passPercentage(numberDB);
		
		if(average>0) {
			System.out.println("Point average (all): "+average);
		} else {
			System.out.println("Point average (all): - ");
		}
		if(average>0) {
			System.out.println("Point average (passing): "+passing);
		} else {
			System.out.println("Point average (passing): - ");
		}
		System.out.println("Pass percentage "+percentage);
		
		
		ArrayList<Integer> grade=menuOptions.Grade(numberDB);
		System.out.println("Grade distribution: ");
		System.out.print("5: "+grade.indexOf(0));
		System.out.print("4: "+grade.indexOf(1));
		System.out.print("3: "+grade.indexOf(2));
		System.out.print("2: "+grade.indexOf(3));
		System.out.print("1: "+grade.indexOf(4));
		System.out.print("0: "+grade.indexOf(5));
		
	}
}
