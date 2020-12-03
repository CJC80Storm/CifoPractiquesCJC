package warePack;

public class ProductWarehouseWithHistory extends ProductWarehouse{
	double initialBalance;
	
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName,capacity);
		this.load=this.load;
		this.historial=historial;
		this.initialBalance=initialBalance;		
	}
	
	public String history() {
		return "["+this.historial.toString()+"]";
	}

	public void addToWarehouse(double amount) {
		if(amount+this.load<=capacity){
			this.load=this.load+amount;
			this.historial.add(amount);
		} else {
			this.load=this.capacity;
			this.historial.add(this.capacity-this.load);
		}
	}
	
	public void takeFromWarehouse(double amount) {
		if(this.load>=amount) {
			this.load=this.load-amount;
			this.historial.add(amount);
		}else {
			this.load=0.0;
			this.historial.add(this.load);
		}
		
	}
	
	public void printAnalysis() {
		System.out.println("Largest amount of product: "+this.historial.maxValue() ); 
		System.out.println("Smallest amount of product: "+this.historial.minValue() );
		System.out.println("Average: "+this.historial.average() );
		
		
		
		
		
	}

}
