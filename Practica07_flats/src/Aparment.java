
public class Aparment {
	private int rooms; 
	private int squareMeters; 
	private int pricePerSquareMeter;
	
	public Aparment(int rooms, int squareMeters, int pricePerSquareMeter){ 
			this.rooms = rooms; 
			this.squareMeters = squareMeters; 
			this.pricePerSquareMeter = pricePerSquareMeter;
	}
	public int priceDifference(Aparment otherAparment) {
		int a=this.squareMeters*this.pricePerSquareMeter;
		int b=otherAparment.pricePerSquareMeter*otherAparment.squareMeters;
		return Math.abs(a-b);
	}
	 public boolean moreExpensiveThan (Aparment otherAparment) {
		int priceApartmemt1=this.pricePerSquareMeter*this.squareMeters;
		//System.out.println(priceApartmemt1);
		int priceApartment2=otherAparment.pricePerSquareMeter*otherAparment.squareMeters;
		//System.out.println(priceApartment2);
		if (priceApartmemt1>priceApartment2) {
			return true;
		}else {
			return false;
		}
	 }
	 
	 public boolean larger(Aparment otherAparment) {
		 int Apart1=this.squareMeters;
		 int Apart2=otherAparment.squareMeters;
		 if(Apart1>Apart2) {
			 return true;
		 } else {
			 return false;
		 }
		
		
	 }

}
