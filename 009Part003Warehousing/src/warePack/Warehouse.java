package warePack;

public class Warehouse {
	double capacity;
	double load;
	
	public Warehouse(double capacity,double load) {
		this.capacity=capacity;
		this.load=load;
		if(capacity<0.0) {
			this.capacity=0.0;
		}
		if(load>capacity) {
			this.load=capacity;
		}
	}
	
	public Warehouse(double capacity) {
		this.capacity=capacity;
		this.load=0;
		if(capacity<0.0) {
			this.capacity=0.0;
		}
	}
	
	public double getLoad() {
		return load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
		
	public double howMuchSpaceLeft() {
		return this.capacity-this.load;
	}
	
	public void addToWarehouse(double amount) {
		if(amount+this.load<=capacity){
			this.load=this.load+amount;
		} else {
			this.load=this.capacity;
		}
	}
	
	public void takeFromWarehouse(double amount) {
		if(this.load>=amount) {
			this.load=this.load-amount;
		}else {
			this.load=0.0;
		}
	}
	
	@Override
	public String toString() {
		//return "Capacity:" +100*load/capacity+"%";
		return "balance: "+load+", space left"+(capacity-load);
	}
}
