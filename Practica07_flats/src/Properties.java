
public class Properties {
	
	public static void main (String[] args) {
		Aparment studioManhattan = new Aparment(1, 16, 5500);
		Aparment twoRoomsBrooklyn = new Aparment(2, 38, 4200); 
		Aparment fourAndKitchenBronx = new Aparment(3, 78, 2500); 
		
		System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );
		System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );
		System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );
		System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) ); 
		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) ); 
	
	
	}
	
}
