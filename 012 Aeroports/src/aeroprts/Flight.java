package aeroprts;

public class Flight {
	String airportDeparture;
	String airportArrival;
	
	
	public Flight(String airportDeparture,String airportArrival) {
		this.airportDeparture=airportDeparture;
		this.airportArrival=airportArrival;
	}

	public String getAirportDeparture() {
		return airportDeparture;
	}

	public void setAirportDeparture(String airportDeparture) {
		this.airportDeparture = airportDeparture;
	}

	public String getAirportArrival() {
		return airportArrival;
	}

	public void setAirportArrival(String airportArrival) {
		this.airportArrival = airportArrival;
	}
	
	public String toStringFlight() {
		return  (" ("+airportDeparture+" - "+airportArrival+")");
	}

}
