package aeroprts;

import java.util.ArrayList;

public class Plane {
	String iD;
	int loadPeople;
	ArrayList<Flight> fligths=new ArrayList<Flight>();

	
	public Plane(String iD,int loadPeople, ArrayList<Flight> fligths) {
		this.iD=iD;
		this.loadPeople=loadPeople;
		this.fligths=fligths;
	}
	
	public Plane(String iD,int loadPeople) {
		this.iD=iD;
		this.loadPeople=loadPeople;
		this.fligths=fligths;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public int getLoadPeople() {
		return loadPeople;
	}

	public void setLoadPeople(int loadPeople) {
		this.loadPeople = loadPeople;
	}

	public ArrayList<Flight> getFligths() {
		return fligths;
	}

	public void setFligths(ArrayList<Flight> fligths) {
		this.fligths = fligths;
	}
	
	
	
	

	public String toString() {
		return (iD+"("+loadPeople+")");	
	}
	
	public String toStringPlane(int index) {
		return  (iD+"("+loadPeople+") ("+getFligths().get(index).airportDeparture+" - "+getFligths().get(index).airportArrival+")");
	}
	
	
}
