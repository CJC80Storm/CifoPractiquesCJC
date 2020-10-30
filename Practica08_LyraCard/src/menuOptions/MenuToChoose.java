package menuOptions;

import java.util.ArrayList;
import java.util.Collections;

public class MenuToChoose {
	
	ArrayList<String> dishes = new ArrayList<String>();
	ArrayList<Double> prizes = new ArrayList<Double>();
	
	public MenuToChoose (ArrayList<String> dishes,ArrayList<Double> prizes) {
		this.dishes=dishes;
		this.prizes=prizes;
	}
	public MenuToChoose () {
		ArrayList<String> dishes =new ArrayList<String>();
		ArrayList<Double> prizes =new ArrayList<Double>();
		this.dishes=dishes;
		this.prizes=prizes;
	}
	
	public int dishSizes() {
		int i=dishes.size();
		return i;
	}
	
	public ArrayList<String> getDishes() {
		return dishes;
	}

	public void setDishes(ArrayList<String> dishes) {
		this.dishes = dishes;
	}

	public ArrayList<Double> getPrizes() {
		return prizes;
	}

	public void setPrizes(ArrayList<Double> prizes) {
		this.prizes = prizes;
	}



}
