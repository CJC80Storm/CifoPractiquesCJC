package menuToHelp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dataBase.Numbers;

public class menuOptions {

	public static void fillNumbers(Scanner readerFile, Numbers numberDB) {
		ArrayList<Integer> nDB=new ArrayList<Integer>();
		int k=0;
		int index = 0;
			
		while(k!=-1){
			try{ k=Integer.valueOf(readerFile.nextLine());
			} catch(Exception e){
				System.out.println("Error to read");
				k=-200;
			}
			
			if(k!=-1) {
				nDB.add(k);
				index++;
			}else break;
		}
		numberDB.setNumbers(nDB);
	}
	

	public static double pointAverage(Numbers numberDB) {
		int counterNumbers=0;
		int sumNumber=0;
		
		for(Integer number:numberDB.getNumbers()) {
			int positionArray=numberDB.getNumbers().indexOf(number);
			if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))>=0) {
				if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))<=100) {
					sumNumber=sumNumber+numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number));
					counterNumbers++;
				}
			}
		}
		if(counterNumbers>0) {
			double toBack=Double.valueOf(sumNumber)/Double.valueOf(counterNumbers);
			return toBack;
		}else {
			return -1.0;
		}
	}


	public static double pointPassing(Numbers numberDB) {
		int counterNumbers=0;
		int sumNumber=0;
			
		for(Integer number:numberDB.getNumbers()) {
			int positionArray=numberDB.getNumbers().indexOf(number);
			if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))>=50) {
				if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))<=100) {
					sumNumber=sumNumber+numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number));
					counterNumbers++;
				}
			}
		}
		if(counterNumbers>0) {
			double toBack=Double.valueOf(sumNumber)/Double.valueOf(counterNumbers);
			return toBack;
		}else {
			return -1.0;
		}
	}


	public static double passPercentage(Numbers numberDB) {
		int counterNumbers=0;
	
			
		for(Integer number:numberDB.getNumbers()) {
			if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))>=50) {
				if(numberDB.getNumbers().get(numberDB.getNumbers().indexOf(number))<=100) {
					counterNumbers++;
				}
			}
		}

		double toBack=100*Double.valueOf(counterNumbers)/Double.valueOf(numberDB.getNumbers().size());
		return toBack;
	}


	public static ArrayList<Integer> Grade(Numbers numberDB) {
		// TODO Auto-generated method stub
		return null;
	}
			
}


