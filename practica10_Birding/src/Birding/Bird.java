package Birding;

public class Bird {
	
	String regularName;
	String latinName;
	int observation=0;

	public Bird (String regularName,String latinName, int observation){
		this.regularName=regularName;
		this.latinName=latinName;
		this.observation=observation;
	}

	public String getRegularName() {
		return regularName;
	}

	public void setRegularName(String regularName) {
		this.regularName = regularName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public int getObservation() {
		return observation;
	}

	public void setObservation(int observation) {
		this.observation = observation;
	}
	
}
